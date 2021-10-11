package com.codingdojo.books.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.codingdojo.books.models.Book;
import com.codingdojo.books.services.BookService;

@RestController
public class BooksApi {
	private final BookService bookService;
    public BooksApi(BookService bookService){
        this.bookService = bookService;
    }
    @RequestMapping(value="/api/books")
    public List<Book> index(){
    	return bookService.allBooks();
    }
    @RequestMapping(value="api/books/create", method=RequestMethod.POST)
    public Book create(Book b) {
    	return bookService.createBook(b);
    }
    
    @RequestMapping(value="/api/books/{id}")
    public Book singleBook(@PathVariable("id")Long id){
    	return bookService.singleBook(id);
    	
    }
//     other methods removed for brevity
    @RequestMapping(value="/api/books/update/{id}", method=RequestMethod.PUT)
    public Book update(
    		@PathVariable("id") Long id, 
    		@RequestParam(value="title") String title, 
    		@RequestParam(value="description") String desc, 
    		@RequestParam(value="language") String lang,
    		@RequestParam(value="numberOfPages") Integer numOfPages) {
        Book book = bookService.updateBook(id, title, desc, lang, numOfPages);
        return book;
    }
    
    @RequestMapping(value="/api/books/delete/{id}", method=RequestMethod.DELETE)
    public void destroy(@PathVariable("id") Long id) {
        bookService.deleteBook(id);
    }

}
