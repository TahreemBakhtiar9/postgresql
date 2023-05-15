package com.rem.gmdb;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.json.AutoConfigureJsonTesters;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;



import com.rem.gmdb.controllers.MovieCon;
import com.rem.gmdb.models.Movie;
@SpringBootTest
@AutoConfigureMockMvc
@AutoConfigureJsonTesters
class GmdbApplicationTests {
	private MockMvc mvc;


	@InjectMocks
	private MovieCon movieCon;

	private JacksonTester<Movie> jsonMovie;
	private JacksonTester<Collection<Movie>> jsonBooks;

	@Test
	void contextLoads() {
	}

	@Test
	public void getallMovies()throws Exception{
		Movie movie1 = new Movie(1,1010, "Sabih", "lame", "120 mins");
		Movie movie2 = new Movie(1,1010, "Sabih", "lame", "120 mins");
		Movie movie3 = new Movie(1,1010, "Sabih", "lame", "120 mins");
		ArrayList<Movie> movies = new ArrayList<Movie>();
		movies.add(movie1);
		movies.add(movie2);
		movies.add(movie3);

		when(movieCon.findAll()).thenReturn(movies);
		mvc.perform(get("/movies/all")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk());
				// .andExpect(content().json(jsonMovie.write(movies).getJson()));

		//MockMvc
	}
	// @Test
	// public void canGetAllBooks() throws Exception {
	// 	Book book1 = new Book(1, "HTML for Babies", "Some Kid", 1999, 26);
	// 	Book book2 = new Book(2, "C# Expert", "Rox", 2006, 260);
	// 	Collection<Book> books = new ArrayList<Book>();
	// 	books.add(book1);
	// 	books.add(book2);
	// 	when(bookrepository.getAllBook()).thenReturn(books);
	// 	mvc.perform(get("/books/all")
	// 			.contentType(MediaType.APPLICATION_JSON))
	// 			.andExpect(status().isOk())
	// 			.andExpect(content().json(jsonBooks.write(books).getJson()));

	// }

}
