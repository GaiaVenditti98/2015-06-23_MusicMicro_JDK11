package it.polito.tdp.musicmicro.db;

import it.polito.tdp.musicmicro.model.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class MusicDAO {
	
	public List<Country> getAllCountries() {
		final String sql = "SELECT id, country FROM country" ;
		
		List<Country> countries = new LinkedList<Country>() ;
		
		try {
			Connection conn = DBConnect.getConnection() ;

			PreparedStatement st = conn.prepareStatement(sql) ;
			
			ResultSet res = st.executeQuery() ;
			
			while( res.next() ) {
				countries.add( new Country(res.getInt("id"), res.getString("country"))) ;
			}
			
			conn.close() ;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null ;
		}
		
		return countries ;
		
	}
	
	public List<City> getAllCities() {
		final String sql = "SELECT id, city FROM city" ;
		
		List<City> cities = new LinkedList<City>() ;
		
		try {
			Connection conn = DBConnect.getConnection() ;

			PreparedStatement st = conn.prepareStatement(sql) ;
			
			ResultSet res = st.executeQuery() ;
			
			while( res.next() ) {
				cities.add( new City(res.getInt("id"), res.getString("city"))) ;
			}
			
			conn.close() ;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null ;
		}
		
		return cities ;
		
	}

	
	public List<Artist> getAllArtists() {
		final String sql = "SELECT id, artist FROM artist" ;
		
		List<Artist> artists = new LinkedList<Artist>() ;
		
		try {
			Connection conn = DBConnect.getConnection() ;

			PreparedStatement st = conn.prepareStatement(sql) ;
			
			ResultSet res = st.executeQuery() ;
			
			while( res.next() ) {
				artists.add( new Artist(res.getInt("id"), res.getString("artist"))) ;
			}
			
			conn.close() ;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null ;
		}
		
		return artists ;
		
	}

	public List<Track> getAllTracks() {
		final String sql = "SELECT id, track FROM track" ;
		
		List<Track> tracks = new LinkedList<Track>() ;
		
		try {
			Connection conn = DBConnect.getConnection() ;

			PreparedStatement st = conn.prepareStatement(sql) ;
			
			ResultSet res = st.executeQuery() ;
			
			while( res.next() ) {
				tracks.add( new Track(res.getInt("id"), res.getString("track"))) ;
			}
			
			conn.close() ;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null ;
		}
		
		return tracks ;
		
	}
	
	public List<Listening> getAllListenings() {
		final String sql = "SELECT id, userid, month, weekday, longitude, latitude, countryid, cityid, artistid, trackid FROM listening" ;
		
		List<Listening> listenings = new LinkedList<Listening>() ;
		
		try {
			Connection conn = DBConnect.getConnection() ;

			PreparedStatement st = conn.prepareStatement(sql) ;
			
			ResultSet res = st.executeQuery() ;
			
			while( res.next() ) {
				listenings.add( new Listening(res.getLong("id"), res.getLong("userid"), res.getInt("month"), res.getInt("weekday"),
						res.getDouble("longitude"), res.getDouble("latitude"), res.getInt("countryid"), res.getInt("cityid"),
						res.getInt("artistid"), res.getInt("trackid"))) ;
			}
			
			conn.close() ;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null ;
		}
		
		return listenings ;
		
	}


	
	
	
}
