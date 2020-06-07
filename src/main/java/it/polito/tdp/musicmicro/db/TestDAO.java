package it.polito.tdp.musicmicro.db;

import java.util.List;

import it.polito.tdp.musicmicro.model.Artist;
import it.polito.tdp.musicmicro.model.City;
import it.polito.tdp.musicmicro.model.Country;
import it.polito.tdp.musicmicro.model.Listening;
import it.polito.tdp.musicmicro.model.Track;

public class TestDAO {

	public static void main(String[] args) {
		MusicDAO dao = new MusicDAO() ;
		
		List<Country> countries = dao.getAllCountries() ;
		//System.out.println(countries) ;
		
		List<City> cities = dao.getAllCities() ;
		//System.out.println(cities) ;
		
		List<Artist> artists = dao.getAllArtists() ;
		
		List<Track> tracks = dao.getAllTracks() ;
		
		List<Listening> listenings = dao.getAllListenings() ;



		System.out.format("Loaded %d countries, %d cities, %d artists, %d tracks, %d listenings\n", 
				countries.size(), cities.size(), artists.size(), tracks.size(), listenings.size()) ;
	}

}
