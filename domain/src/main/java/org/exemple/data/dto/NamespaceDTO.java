package org.exemple.data.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;

@Builder
@AllArgsConstructor
public class NamespaceDTO {

    private int id;
    private String name;
    private String path;
    private String kind;
    private String fullPath;
    private Object parentId;
    private String avatarUrl;
    private String webUrl;

}