package in.javaguides.repo;

import org.springframework.stereotype.Repository;

@Repository
public class MyRepo {

	public String hello() {
		return "Hello Repository";
	}
}
