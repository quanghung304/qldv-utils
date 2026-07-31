package com.agribank.qldvutils.request.doctemplate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** Request cho {@code POST /api/v1/document-template/resolve-fields} (qldv-db, S2-03). */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResolveFieldsRequest {
    String caseId;
    String fieldMappingConfig;
}
