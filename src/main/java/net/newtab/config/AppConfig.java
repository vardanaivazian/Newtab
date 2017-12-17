package net.newtab.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by Vardan on 12/17/2017.
 */


/**
 * These will bootstrap the spring mvc application and set package to scan controllers and resources.
 */

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "net.newtab.*")
public class AppConfig {

}
