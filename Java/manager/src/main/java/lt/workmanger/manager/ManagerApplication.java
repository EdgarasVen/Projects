package lt.workmanger.manager;

import lt.workmanger.manager.model.Project;
import lt.workmanger.manager.model.Task;
import lt.workmanger.manager.model.Worker;
import lt.workmanger.manager.model.Assignment;
import lt.workmanger.manager.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class ManagerApplication  implements CommandLineRunner
{
	@Autowired
	private  Repository repository;

	public static void main(String[] args) {
		SpringApplication.run(ManagerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Worker w1= new Worker(1L,"Andrej","Velikanov", "java programmer", 1200L);
		Worker w2= new Worker(2L,"Maksim","Kastalov", "php programmer", 1200L);
		Worker w3= new Worker(3L,"Oleg","Vlarimir", "tester", 1200L);
		Worker w4= new Worker(4L,"Marek","Bojko", "manager", 1200L);

		Project p1 =new Project(101L,"Web for UAB rimi","Vilnius",12000L);
		Project p2 =new Project(102L,"insurance database for UAB argo","Vilnius",3200L);

		Task t1=new Task("design front",12L);
		Task t2=new Task("design database",11L);
		Task t3=new Task("create html",1L);
		Task t4=new Task("write css",5L);
		Task t5=new Task("repair bugs",5L);
		Task t6=new Task("develop api",10L);
		Task t7=new Task("create jpa",8L);
		Task t8=new Task("make service",2L);
		Task t9=new Task("test",5L);

		w2.getProjects().add(p1);
		w3.getProjects().add(p1);
		w4.getProjects().add(p1);
		w1.getProjects().add(p2);

		Assignment a1 = new Assignment(w1,t6);
		Assignment a2 = new Assignment(w1,t2);
		Assignment a3 = new Assignment(w2,t1);
		Assignment a4 = new Assignment(w2,t3);
		Assignment a5 = new Assignment(w3,t9);
		Assignment a6 = new Assignment(w4,t5);

		repository.addProject(p1);
		repository.addProject(p2);

		repository.addWorker(w1);
		repository.addWorker(w2);
		repository.addWorker(w3);
		repository.addWorker(w4);

		repository.addTask(t1);
		repository.addTask(t2);
		repository.addTask(t3);
		repository.addTask(t4);
		repository.addTask(t5);
		repository.addTask(t6);
		repository.addTask(t7);
		repository.addTask(t8);
		repository.addTask(t9);

		repository.addAssignment(a1);
		repository.addAssignment(a2);
		repository.addAssignment(a3);
		repository.addAssignment(a4);
		repository.addAssignment(a5);
		repository.addAssignment(a6);
	}
}
