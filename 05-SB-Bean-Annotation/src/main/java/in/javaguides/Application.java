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





//@SpringBootApplication
//public class Application {
//
//	public static void main(String[] args) {
//		var context = SpringApplication.run(Application.class, args);
//		PizzaController bean = (PizzaController) context.getBean("pizzaController");
//		System.out.println(bean.getPizza());
//		
//		VegPizza vegPizza = context.getBean(VegPizza.class);
//		System.out.println(vegPizza.getPizza());
//	}
//
//}






//@SpringBootApplication
//public class Application {
//
//	public static void main(String[] args) {
//		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
//		VegPizza vegPizza = context.getBean(VegPizza.class);
//		System.out.println(vegPizza.getPizza());
//	}
//
//}





//@SpringBootApplication
//public class Application {
//
//	public static void main(String[] args) {
//		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
//		VegPizza vegPizza = (VegPizza) context.getBean("vegPizzaBean");//Bean Specific Name
//		System.out.println(vegPizza.getPizza());
//	}
//
//}





//@SpringBootApplication
//public class Application {
//
//	public static void main(String[] args) {
//		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
//		VegPizza vegPizza = (VegPizza) context.getBean("vegPizza");//Method Name
//		System.out.println(vegPizza.getPizza());
//	}
//
//}





//@SpringBootApplication
//public class Application {
//
//	public static void main(String[] args) {
//		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
//		VegPizza vegPizza = (VegPizza) context.getBean(VegPizza.class);
//		System.out.println(vegPizza.getPizza());
//	}
//
//}





//@SpringBootApplication
//public class Application {
//
//	public static void main(String[] args) {
//		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
////		PizzaController pizzaController = context.getBean(PizzaController.class);
//		PizzaController pizzaController = (PizzaController) context.getBean("pizzaController");//Bean Explicit Method Name
//		System.out.println(pizzaController.getPizza());
//	}
//
//}





@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		PizzaController pizzaController = (PizzaController) context.getBean("pizzaControllerTwo");//Bean Explicit Method Name
		System.out.println(pizzaController.getPizza());
	}

}