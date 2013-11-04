package de.nk.flyway;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Niko Koebler, http://www.n-k.de
 */
public class MySpringApp {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
        MySpringService bean = (MySpringService) ctx.getBean("sessionFactory");
        System.out.println(bean.getMessage());
    }

}
