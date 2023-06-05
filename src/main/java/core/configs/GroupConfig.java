package core.configs;

import core.models.Group;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

@Configuration
@ConfigurationProperties
@Setter
@Getter
public class GroupConfig {
    private List<Group> groups;
    @PreDestroy
    private void preDestroy() {
        System.out.println("GroupConfig use pre destroy");
    }
    @PostConstruct
    private void postConstruct() {
        System.out.println("GroupConfig use post construct");
    }
}
