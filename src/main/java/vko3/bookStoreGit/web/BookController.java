package vko3.bookStoreGit.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import vko3.bookStoreGit.domain.Book;

@Controller
public class BookController {
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String getBooks(Model model) {
		
		List<Book> books = new ArrayList<Book>();
		books.add(new Book("Testikirja", "Wika Maltari", 1990, "12345-6", 5.99));
		model.addAttribute("books", books);
		return "index";	
		
	}

}
