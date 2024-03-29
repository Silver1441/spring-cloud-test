package com.epam.hw.netflix.api;

import com.epam.hw.netflix.domain.Workspace;
import com.epam.hw.netflix.service.WorkspaceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient(name = "workspaces-api", fallback = WorkspaceFallback.class)
public interface WorkspaceAPI {

    @RequestMapping(value = "/workspaces/{id}", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    Workspace getWorkspaceById(@PathVariable("id") String id);
}
