package org.example.adapters.external.gitlab;

import org.exemple.data.dto.ProjectDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.List;

@FeignClient(name = "gitlab", url = "${adapters.external.gitlab}")
public interface GitLabClient {

    @GetMapping(value = "/api/v4/projects?membership={is-membership}")
    List<ProjectDTO> getProjectsInfo(
            @RequestHeader(value = "PRIVATE-TOKEN") String privateToken,
            @PathVariable(value = "is-membership") boolean isMembership
    );

}