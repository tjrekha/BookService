package com.books;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class BooksController {
	
	
	@GetMapping("/books")
		public String getBooks(HttpServletRequest request) {
		String httpUser = request.getHeader("Http-User");
		
		return httpUser+"- bookName";
	}

}
