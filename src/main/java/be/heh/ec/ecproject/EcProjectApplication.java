package be.heh.ec.ecproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication/*(exclude={DataSourceAutoConfiguration.class})*/
public class EcProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcProjectApplication.class, args);
    }
}
