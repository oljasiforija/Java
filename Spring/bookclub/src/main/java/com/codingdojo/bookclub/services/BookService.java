package com.codingdojo.bookclub.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codingdojo.bookclub.models.Book;
import com.codingdojo.bookclub.repositories.BookRepository;

@Service
public class BookService {
	private BookRepository bookRepository;
	
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	public Book create(Book book) {
		return bookRepository.save(book);
		
	}
	public List<Book> allBooks(){
		return bookRepository.findAll();
	}

}
