package controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springidols.Performer;

public class Main {
    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("file:src/main/resources/config.xml");

        Performer performer = (Performer) ctx.getBean("kenny");

        performer.perform();
    }
}
