package lt.estate.app;

import lt.estate.app.dto.DtoBuilding;
import lt.estate.app.dto.DtoOwner;
import lt.estate.app.enums.PropertyType;
import lt.estate.app.rest.RestApiControllerV1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class AppApplication  implements CommandLineRunner {
	@Autowired
	RestApiControllerV1 controllerV1;

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		DtoOwner dtoOwner =new DtoOwner();
		dtoOwner.setName("Josh");
		dtoOwner.setSurname("Shepard");
		dtoOwner.setAddress("Some address 22");
		dtoOwner.setTelephone("893213244");

		DtoBuilding dtoBuilding= new DtoBuilding();
		dtoBuilding.setAddress("Some address 21");
		dtoBuilding.setSize(1200);
		dtoBuilding.setType(PropertyType.HOUSE);
		dtoBuilding.setValue(3000000L);
		dtoBuilding.setOwner(null);

		controllerV1.createBuilding(dtoBuilding);
		controllerV1.createOwner(dtoOwner);
	}
}
