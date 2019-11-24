package be.helha.demo.project_course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@Configuration
public class ProjectCourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectCourseApplication.class, args);
	}

}
