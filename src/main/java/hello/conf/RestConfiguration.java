package hello.conf;

/**
 * Created by Администратор on 15.08.2016.
 */

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "hello")
public class RestConfiguration {

}
