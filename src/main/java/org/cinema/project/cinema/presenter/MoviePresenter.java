package org.cinema.project.cinema.presenter;

import org.cinema.project.cinema.model.dao.MovieDAO;
import org.cinema.project.cinema.model.entity.Movie;
import org.cinema.project.cinema.view.CinemaMenu;

import java.util.List;

public class MoviePresenter {

    private MovieDAO movieDAO = new MovieDAO();
    private CinemaMenu cinemaMenu;

    public MoviePresenter(CinemaMenu cinemaMenu) {
        this.cinemaMenu = cinemaMenu;
    }

    public void addMovie(Movie movie) {
        movieDAO.addMovie(movie);
    }

    public void showMovieList() {
        List<Movie> allMovies = movieDAO.getMovieList();
        cinemaMenu.setMovieList(allMovies);
    }
}
