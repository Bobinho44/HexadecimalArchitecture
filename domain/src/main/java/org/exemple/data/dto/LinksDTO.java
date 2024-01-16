package org.exemple.data.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;

@Builder
@AllArgsConstructor
public class LinksDTO {

    private String self;
    private String issues;
    private String mergeRequests;
    private String repoBranches;
    private String labels;
    private String events;
    private String members;
    private String clusterAgents;

}