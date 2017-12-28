package springboottest;

import springboottest.app.Frontend;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;


/**
 * Created by tom_red on 2017/12/28.
 */
@EnableAutoConfiguration
@ComponentScan
public class App {
    public static void main(String[] args) {
        try (ConfigurableApplicationContext context = SpringApplication.run(App.class, args) ) {
            Frontend frontend = context.getBean(Frontend.class);
            frontend.run();
        }
    }
}
