package lulu02_CodeBased5_Registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer; 

@EnableEurekaServer
@SpringBootApplication
public class Lulu02CodeBased5RegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lulu02CodeBased5RegistryApplication.class, args);
	}

}
