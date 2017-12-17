package net.newtab.config;

/**
 * Created by Vardan on 12/17/2017.
 */


import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * This class will replace web.xml and it will map the spring’s dispatcher servlet and bootstrap it.
 */
public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{AppConfig.class};
    }

    protected Class<?>[] getServletConfigClasses() {
        return null;
    }

    protected String[] getServletMappings() {
        return new String[] {"/"};
    }
}
