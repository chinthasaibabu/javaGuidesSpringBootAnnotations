package in.javaguides.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import in.javaguides.beans.Book;

@Controller
public class BookController {

	@RequestMapping("/hello")
	@ResponseBody
	public String helloWorld() {
		return "Hello World";
	}
	
	@RequestMapping("/book")
	@ResponseBody
	public Book getBook() {
		Book book = new Book(1,"Core Java","Learn Core Java");
		return book;
	}
}
