package com.rem.gmdb;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.boot.test.autoconfigure.json.AutoConfigureJsonTesters;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.test.context.web.WebAppConfiguration;

import com.fasterxml.jackson.databind.ObjectMapper;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


import com.rem.gmdb.controllers.MovieCon;
import com.rem.gmdb.models.Movie;
import com.rem.gmdb.models.Reviewer;
import com.rem.gmdb.repos.MovieRepo;
import com.rem.gmdb.repos.ReviewRepo;
@SpringBootTest
@AutoConfigureMockMvc
@AutoConfigureJsonTesters
class GmdbApplicationTests {
	private MockMvc mvc,mvc1;
    @InjectMocks
    private MovieCon moviesController;
    @Mock MovieRepo repo;
    @Mock ReviewRepo repo1;
    private JacksonTester<Reviewer> jsonReviewer;
    private JacksonTester<Movie> jsonmovies;
    private JacksonTester<ReviewRepo> jsonreview;
    @Autowired
    private WebApplicationContext context;
    // private 
    @BeforeEach
    public void setup() {
        JacksonTester.initFields(this, new ObjectMapper());
        mvc = MockMvcBuilders.webAppContextSetup(context).build();
        mvc1=MockMvcBuilders.standaloneSetup(moviesController).build();
    }
	// 1. As a user
    //    I can GET a list of movies from GMDB that includes Movie ID | Movie Title | Year Released | Genre | Runtime
    //    so that I can see the list of available movies.
	@Test
	public void getallMovies()throws Exception{
		Movie movie1 = new Movie(1,1010, "Sabih", "lame", "120 mins");
		Movie movie2 = new Movie(1,1010, "Sabih", "lame", "120 mins");
		Movie movie3 = new Movie(1,1010, "Sabih", "lame", "120 mins");
		ArrayList<Movie> movies = new ArrayList<>();
		movies.add(movie1);
		movies.add(movie2);
		movies.add(movie3);
		when(repo.findAll()).thenReturn(movies);
		mvc.perform(get("/movies/all")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk());
	}

	@Test
	public void getByReviewes()throws Exception{
		
		
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
