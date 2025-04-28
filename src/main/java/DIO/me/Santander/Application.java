package DIO.me.Santander;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication (scanBasePackages = "DIO.me.Santander")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
