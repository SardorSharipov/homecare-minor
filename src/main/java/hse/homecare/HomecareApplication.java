package hse.homecare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@Configuration
public class HomecareApplication implements WebMvcConfigurer {

    public static void main(String[] args) {
        SpringApplication.run(HomecareApplication.class, args);
    }

    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/pngFiles/**")
                .addResourceLocations("file:ext-resources/")
                .setCachePeriod(0);
    }
}

