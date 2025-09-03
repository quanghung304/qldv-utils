package com.agribank.qldvutils.request.dv;

import com.agribank.qldvutils.entity.DV;
import com.agribank.qldvutils.entity.DvDraft;
import com.agribank.qldvutils.entity.DvOrgHistory;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SaveDVRequest {
    @NotNull
    DV dv;
    @NotNull
    DvDraft dvDraft;
    @NotNull
    DvOrgHistory dvOrgHistory;
}
