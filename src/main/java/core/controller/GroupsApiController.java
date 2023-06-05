package core.controller;

import core.other.FileManager;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/groups-api")
public class GroupsApiController {
    @Value("${groups-api-path}")
    String groupsApiPath;
    @GetMapping("/groups")
    public String getGroups() {
        return FileManager.getMapManager().get(String.format("%sgroups.json", groupsApiPath));
    }
    @GetMapping("/groups-1")
    public String getGroups1() {
        return FileManager.getMapManager().get(String.format("%sgroups-1.json", groupsApiPath));
    }
}