package com.agribank.qldvutils.response.bcsl_report.dv;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Builder
@Data
@NoArgsConstructor()
@AllArgsConstructor()
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DvRp18Response {
    String organizationCode;
    String organizationName;
    String form;
    @Builder.Default
    Integer male1830 = 0;
    @Builder.Default
    Integer female1830 = 0;
    @Builder.Default
    Integer male3135 = 0;
    @Builder.Default
    Integer female3135 = 0;
    @Builder.Default
    Integer male3640 = 0;
    @Builder.Default
    Integer female3640 = 0;
    @Builder.Default
    Integer male4145 = 0;
    @Builder.Default
    Integer female4145 = 0;
    @Builder.Default
    Integer male4650 = 0;
    @Builder.Default
    Integer female4650 = 0;
    @Builder.Default
    Integer male5155 = 0;
    @Builder.Default
    Integer female5155 = 0;
    @Builder.Default
    Integer male5660 = 0;
    @Builder.Default
    Integer female5660 = 0;
    @Builder.Default
    Integer male6162 = 0;
    @Builder.Default
    Integer female6162 = 0;
}
