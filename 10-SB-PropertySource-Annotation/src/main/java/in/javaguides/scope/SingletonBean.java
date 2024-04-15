package in.javaguides.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)//instead of hardcoded value singleton,spring boot constant
public class SingletonBean {

	public SingletonBean() {
		System.out.println("SingletonBean...");
	}
}
