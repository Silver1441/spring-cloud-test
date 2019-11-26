package com.epam.hw.netflix.service;

import com.epam.hw.netflix.api.WorkspaceAPI;
import com.epam.hw.netflix.domain.OSFamily;
import com.epam.hw.netflix.domain.Workspace;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class WorkspaceFallback implements WorkspaceAPI {

    @Override
    public Workspace getWorkspaceById(@PathVariable("id") String id) {
        Workspace mockWorkspace = new Workspace();
        mockWorkspace
                .setId(id)
                .setOsFamily(OSFamily.LINUX)
                .setSeat(0)
                .setSerialNumber("null")
                .setUnit(0);
        return mockWorkspace;
    }
}
