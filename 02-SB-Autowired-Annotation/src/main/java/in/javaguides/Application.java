package in.javaguides;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.javaguides.controller.PizzaController;

//@SpringBootApplication
//public class Application {
//
//	public static void main(String[] args) {
//		var context = SpringApplication.run(Application.class, args);
//		PizzaController bean = context.getBean(PizzaController.class);
//		System.out.println(bean.getPizza());
//	}
//
//}






//@SpringBootApplication
//public class Application {
//
//	public static void main(String[] args) {
//		var context = SpringApplication.run(Application.class, args);
//		PizzaController bean = (PizzaController) context.getBean("pizzaDemo");
//		System.out.println(bean.getPizza());
//	}
//
//}





//@SpringBootApplication
//public class Application {
//
//	public static void main(String[] args) {
//		var context = SpringApplication.run(Application.class, args);
//		PizzaController bean = (PizzaController) context.getBean("pizzaController");//class name with first letter small
//		System.out.println(bean.getPizza());
//	}
//
//}





@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		var context = SpringApplication.run(Application.class, args);
		PizzaController bean = (PizzaController) context.getBean("pizzaController");//class name with first letter small
		System.out.println(bean.getPizza());
	}

}
