package in.javaguides.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.javaguides.controller.PizzaController;
import in.javaguides.service.NonVegPizza;
import in.javaguides.service.Pizza;
import in.javaguides.service.VegPizza;

@Configuration
public class AppConfig {

//	@Bean(name = "vegPizzaBean") //to manage object for VegPizza Class, Explicitly we can create object
	@Bean
	public Pizza vegPizza() {
		return new VegPizza(); 
	}
	
	@Bean
	public Pizza nonVegPizza() {
		return new NonVegPizza();
	}
	
	@Bean
	public PizzaController pizzaController() {
		return new PizzaController(vegPizza());
	}
	
	@Bean(initMethod = "init",destroyMethod = "destroy")
	public PizzaController pizzaControllerTwo() {
		return new PizzaController(nonVegPizza());
	}
}
