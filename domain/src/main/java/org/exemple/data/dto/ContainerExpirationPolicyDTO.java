package org.exemple.data.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.time.ZonedDateTime;

@Builder
@AllArgsConstructor
public class ContainerExpirationPolicyDTO {

    private String cadence;
    private boolean enabled;
    private int keepN;
    private String olderThan;
    private String nameRegex;
    private String nameRegexKeep;
    private ZonedDateTime nextRunAt;
}