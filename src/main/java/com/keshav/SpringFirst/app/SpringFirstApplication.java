package com.keshav.SpringFirst.app;
import com.keshav.SpringFirst.app.models.Computer;
import com.keshav.SpringFirst.app.models.Alien;
import com.keshav.SpringFirst.app.models.Laptop;
import com.keshav.SpringFirst.app.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringFirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringFirstApplication.class, args);
		ApplicationContext context = SpringApplication.run(SpringFirstApplication.class);
		LaptopService service = context.getBean(LaptopService.class);
		Laptop lap = context.getBean(Laptop.class);
		service.addLaptop(lap);


	}

}
