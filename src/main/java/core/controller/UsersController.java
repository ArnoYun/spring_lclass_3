package core.controller;

import core.other.FileManager;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersController {
    @Value("${users-api-path}")
    String groupsApiPath;
    @GetMapping
    public String getUsers() {
        return FileManager.getMapManager().get(String.format("%susers.json", groupsApiPath));
    }
}