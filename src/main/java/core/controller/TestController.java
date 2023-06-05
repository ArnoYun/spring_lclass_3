package core.controller;

import core.configs.GroupConfig;
import core.models.Group;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/groups")
public class TestController {
    @Autowired
    GroupConfig groupConfig;

    @GetMapping
    public List<Group> getGroups() {
        return groupConfig.getGroups();
    }
}
