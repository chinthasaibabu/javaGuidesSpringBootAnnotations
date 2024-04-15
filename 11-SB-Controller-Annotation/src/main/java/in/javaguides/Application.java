package in.javaguides;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.javaguides.controller.MyController;
import in.javaguides.controller.PizzaController;
import in.javaguides.lazy.LazyLoader;
import in.javaguides.propertysource.PropertySourceDemo;
import in.javaguides.repo.MyRepo;
import in.javaguides.scope.PrototypeBean;
import in.javaguides.scope.SingletonBean;
import in.javaguides.service.MyService;
import in.javaguides.value.ValueAnnotation;

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





//@SpringBootApplication
//public class Application {
//
//	public static void main(String[] args) {
//		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
//		PizzaController pizzaController = (PizzaController) context.getBean("pizzaControllerTwo");//Bean Explicit Method Name
//		System.out.println(pizzaController.getPizza());
//	}
//
//}





//@SpringBootApplication
//public class Application {
//
//	public static void main(String[] args) {
//		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
//		MyController controller = context.getBean(MyController.class);
//		System.out.println(controller.hello());
//		
//		MyService service = context.getBean(MyService.class);
//		System.out.println(service.hello());
//		
//		MyRepo repo = context.getBean(MyRepo.class);
//		System.out.println(repo.hello());
//
//	}
//
//}





//@SpringBootApplication
//public class Application {
//
//	public static void main(String[] args) {
//		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
//		LazyLoader lazyLoader = context.getBean(LazyLoader.class);//to load on-demand
//		
//	}
//
//}




//@SpringBootApplication
//public class Application {
//
//	public static void main(String[] args) {
//		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
//		
//		SingletonBean singletonBean1 = context.getBean(SingletonBean.class);
//		System.out.println(singletonBean1.hashCode());
//		
//		SingletonBean singletonBean2 = context.getBean(SingletonBean.class);
//		System.out.println(singletonBean2.hashCode());
//		
//		SingletonBean singletonBean3 = context.getBean(SingletonBean.class);
//		System.out.println(singletonBean3.hashCode());
//		
//		PrototypeBean prototypeBean1 = context.getBean(PrototypeBean.class);
//		System.out.println(prototypeBean1.hashCode());
//		
//		PrototypeBean prototypeBean2 = context.getBean(PrototypeBean.class);
//		System.out.println(prototypeBean2.hashCode());
//		
//		PrototypeBean prototypeBean3 = context.getBean(PrototypeBean.class);
//		System.out.println(prototypeBean3.hashCode());
//			
//	}
//
//}






//@SpringBootApplication
//public class Application {
//
//	public static void main(String[] args) {
//		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
//		
//		ValueAnnotation valueAnnotation = context.getBean(ValueAnnotation.class);
//		System.out.println(valueAnnotation.getDefaultName());
//		System.out.println(valueAnnotation.getHost());
//		System.out.println(valueAnnotation.getEmail());
//		System.out.println(valueAnnotation.getPassword());
////		System.out.println(valueAnnotation.getJavaHome());
////		System.out.println(valueAnnotation.getHomeDir());
//	}
//
//}








//@SpringBootApplication
//public class Application {
//
//	public static void main(String[] args) {
//		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
//		
//		PropertySourceDemo propertySourceDemo = context.getBean(PropertySourceDemo.class);
//		System.out.println(propertySourceDemo.getHost());
//		System.out.println(propertySourceDemo.getEmail());
//		System.out.println(propertySourceDemo.getPassword());
//
//	}
//
//}










@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}