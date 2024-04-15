package in.javaguides.controller;

import org.springframework.stereotype.Component;

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



@Component()
public class PizzaController {

	public String getPizza() {
		return "Hot Pizza";
	}
}

