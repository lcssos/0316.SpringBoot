package cn.martin.boot.component;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;

/**
 * Created by lcssos on 16/4/20.
 */
@Component
@ConfigurationProperties(prefix = "foo")
@Getter
@Setter
public class FooComponent {

    @NotNull
    private String username;

    private String password;


}
