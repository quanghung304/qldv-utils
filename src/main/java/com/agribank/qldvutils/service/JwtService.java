package com.agribank.qldvutils.service;

import com.agribank.qldvutils.response.TokenResponse;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;

import java.util.Date;
import java.util.function.Function;

public class JwtService {
    @Value("${jwt.secret}")
    private String secret;

    @Value("${jwt.expiration}")
    private Long expiration;

    public String generateToken(String username) {
        Date now = new Date();
        Date expirationDate = new Date(now.getTime() + expiration * 1000);

        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(now)
                .setExpiration(expirationDate)
                .signWith(SignatureAlgorithm.HS512, secret)
                .compact();
    }
    public TokenResponse checkToken(String token){
        Boolean check = false;
        String message = "Token không tồn tại!";
        String userName = "";
        TokenResponse result = new TokenResponse();
        try {
            check = this.validateToken(token);
            userName = this.extractUsername(token);
            message = "Success";
        }
        catch (ExpiredJwtException e){
            message = "Đã hết thời hạn của phiên đăng nhập!";
        }
        catch (Exception e){
            message = String.format("Lỗi lấy token: %s", e);
            System.out.printf("Lỗi lấy token: %s%n", e);
        }
        result.setCheck(check);
        result.setMessage(message);
        result.setUser(userName);
        return result;
    }

    public Boolean validateToken(String token) {
        return !isTokenExpired(token);
    }

    private Boolean isTokenExpired(String token) {
        final Date expiration = extractExpiration(token);
        return expiration.before(new Date());
    }

    public String extractUsername(String token) {
        return extractClaim(token, Claims::getSubject);
    }

    public Date extractExpiration(String token) {
        return extractClaim(token, Claims::getExpiration);
    }

    public <T> T extractClaim(String token, Function<Claims, T> claimsResolver) {
        final Claims claims = extractAllClaims(token);
        return claimsResolver.apply(claims);
    }

    private Claims extractAllClaims(String token) {
        return Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
    }
}
