package net.kiel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@SpringBootApplication
public class HomebookApplication {

    public static void main(String[] args) {
        SpringApplication.run(HomebookApplication.class, args);
    }

}
