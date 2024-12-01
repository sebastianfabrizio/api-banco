package pe.edu.cibertec.apibancocibertec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class ApiBancoCibertecApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiBancoCibertecApplication.class, args);
    }


    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
               registry.addMapping("api/v1/**").allowedOrigins("GET", "POST", "PUT").allowedOrigins("*");

                //con esto solo le digo que se puede usar esta url
                //allowedOrigins("http://frontbancociber.com")
            }
        };
    }

}
