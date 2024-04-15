package in.javaguides.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import in.javaguides.service.Pizza;
import in.javaguides.service.VegPizza;

//@Component
//public class PizzaController {
//
//	public String getPizza() {
//		return "Hot Pizza";
//	}
//}



//@Component("pizzaDemo")
//public class PizzaController {
//
//	public String getPizza() {
//		return "Hot Pizza";
//	}
//}



//@Component()
//public class PizzaController {
//
//	public String getPizza() {
//		return "Hot Pizza";
//	}
//}



//@Component()
//public class PizzaController {
//	
//	@Autowired //field injection
//	private VegPizza vegPizza;
//	
////	private VegPizza vegPizza;
//	
////	@Autowired //constructor injection
////	public PizzaController(VegPizza vegPizza) {
////		this.vegPizza = vegPizza;
////	}
//	
////	@Autowired //setter injection
////	public void setVegPizza(VegPizza vegPizza) {
////		this.vegPizza = vegPizza;
////	}
//	
//	
//	
//	public String getPizza() {
//		return vegPizza.getPizza();
//	}
//
////	public String getPizza() {
////		return "Hot Pizza";
////	}
//}




//@Component()
//public class PizzaController {
//	
//	private Pizza pizza;
//	
//	@Autowired //constructor injection
//	public PizzaController(@Qualifier("vegPizza") Pizza pizza) {//this will treated vegPizza,@Qualifier("nonVegPizza") 
//		this.pizza = pizza;
//	}
//
//	public String getPizza() {
//		return pizza.getPizza();
//	}
//
//}








//@Component()
//public class PizzaController {
//	
//	private Pizza pizza;
//	
//	@Autowired 
//	public PizzaController(Pizza pizza) { 
//		this.pizza = pizza;
//	}
//
//	public String getPizza() {
//		return pizza.getPizza();
//	}
//
//}










public class PizzaController {
	
	private Pizza pizza;
	
	public PizzaController(Pizza pizza) { 
		this.pizza = pizza;
	}

	public String getPizza() {
		return pizza.getPizza();
	}
	
	public void init() {
		System.out.println("Initailization Logic");
	}
	
	public void destroy() {
		System.out.println("Destruction Logic");
	}

}