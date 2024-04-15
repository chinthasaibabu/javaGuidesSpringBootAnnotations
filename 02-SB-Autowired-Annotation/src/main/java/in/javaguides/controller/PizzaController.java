package in.javaguides.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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



@Component()
public class PizzaController {
	
	@Autowired //field injection
	private VegPizza vegPizza;
	
//	private VegPizza vegPizza;
	
//	@Autowired //constructor injection
//	public PizzaController(VegPizza vegPizza) {
//		this.vegPizza = vegPizza;
//	}
	
//	@Autowired //setter injection
//	public void setVegPizza(VegPizza vegPizza) {
//		this.vegPizza = vegPizza;
//	}
	
	
	
	public String getPizza() {
		return vegPizza.getPizza();
	}

//	public String getPizza() {
//		return "Hot Pizza";
//	}
}

