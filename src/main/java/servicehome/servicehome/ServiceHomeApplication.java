package servicehome.servicehome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@RestController
public class ServiceHomeApplication {

	@RequestMapping("/home")
	public String home() {
		return "Hello This is Home Page";
	}

	public static void main(String[] args) {
		SpringApplication.run(ServiceHomeApplication.class, args);
	}

}
