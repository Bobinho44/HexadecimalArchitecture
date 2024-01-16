package org.exemple.data.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;

@Builder
@AllArgsConstructor
public class PermissionsDTO {

    private Object projectAccess;

    private Object groupAccess;

}