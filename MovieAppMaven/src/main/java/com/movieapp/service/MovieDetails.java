package com.movieapp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MovieDetails {
	
	public List<String> showMovies(String language){
		List<String> english = Arrays.asList("Mission Impossible", "Mummy", "Iron man", "SuperMan");
		if(language.equals("english")) {
			return english;
		}
		List<String> telugu = Arrays.asList("Pushpa", "RRR", "Munna", "Shiva");
		if (language.equals("telugu")) {
			return telugu;
		}
		List<String> tamil = Arrays.asList("vikram", "rolex", "SuperDelux", "Mahaan");
		if(language.equals("tamil")) {
			return tamil;
		}
		List<String> kannada = Arrays.asList("vikram", "rolex", "Part-A", "Part-A");
		if(language.equals("kannada")) {
			return kannada;
		}
		return null;
	}
}
