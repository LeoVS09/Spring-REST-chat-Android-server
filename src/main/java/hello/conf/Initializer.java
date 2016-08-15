package hello.conf;

/**
 * Created by Администратор on 15.08.2016.
 */

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class Initializer extends AbstractAnnotationConfigDispatcherServletInitializer{

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] { RestConfiguration.class };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return null;
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }
}
