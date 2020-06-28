package lt.app.numbers;

import lt.app.numbers.model.Number;
import lt.app.numbers.model.Request;
import lt.app.numbers.repo.RepoRequest;
import lt.app.numbers.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class NumbersApplication implements CommandLineRunner {
	@Autowired
	RequestService service;

	public static void main(String[] args) {
		SpringApplication.run(NumbersApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Request request1= new Request();
		request1.setCreated(new Date());

		Request request2= new Request();
		request2.setCreated(new Date());

		Request request3= new Request();
		request3.setCreated(new Date());

		List<Number> numbers1= new ArrayList<>();
		numbers1.add(new Number(1,request1));
		numbers1.add(new Number(2,request1));
		numbers1.add(new Number(0,request1));
		numbers1.add(new Number(3,request1));
		numbers1.add(new Number(0,request1));
		numbers1.add(new Number(0,request1));
		numbers1.add(new Number(1,request1));

		List<Number> numbers2= new ArrayList<>();
		numbers2.add(new Number(3,request1));
		numbers2.add(new Number(2,request1));
		numbers2.add(new Number(0,request1));
		numbers2.add(new Number(-2,request1));
		numbers2.add(new Number(0,request1));

		List<Number> numbers3= new ArrayList<>();
		numbers3.add(new Number(3,request1));
		numbers3.add(new Number(2,request1));
		numbers3.add(new Number(0,request1));
		numbers3.add(new Number(3,request1));
		numbers3.add(new Number(1,request1));
		numbers3.add(new Number(0,request1));
		numbers3.add(new Number(1,request1));
		numbers3.add(new Number(3,request1));
		numbers3.add(new Number(1,request1));

		request1.setNumbers(numbers1);
		request1.createNumberString();

		request2.setNumbers(numbers2);
		request2.createNumberString();

		request3.setNumbers(numbers3);
		request3.createNumberString();

		service.checkAndSaveNumbers(request1);
		service.checkAndSaveNumbers(request2);
		service.checkAndSaveNumbers(request3);
	}
}
