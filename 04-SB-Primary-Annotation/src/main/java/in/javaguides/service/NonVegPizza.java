package in.javaguides.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary //higher preference to this component
public class NonVegPizza implements Pizza {

	@Override
	public String getPizza() {
		
		return "Non Veg Pizza";
	}

}
