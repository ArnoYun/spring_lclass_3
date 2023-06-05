package core.controller;

import core.configs.GroupConfig;
import core.models.Group;
import core.other.FileManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stubs")
public class StubController {
    @Value("${groups-api-path}")
    String groupsApiPath;
    @GetMapping("/groups")
    public String getGroups() {
        return FileManager.getMapManager().get(String.format("%sgroups.json", groupsApiPath));
    }
}