package org.cinema.project.cinema;

import org.cinema.project.cinema.util.HibernateUtil;
import org.cinema.project.cinema.model.dao.MovieDAO;
import org.cinema.project.cinema.model.entity.Movie;

import java.time.LocalDate;

public class MovieApp {

    public static void main(String[] args) {

        MovieDAO movieDAO = new MovieDAO();
        Movie movie = new Movie();
        movie.setTitle("Matrix");
        movie.setMovieDuration(120);
        movie.setReleaseDate(LocalDate.parse("1990-01-01"));
        movie.setDirectorName("Wachowsky Brothers");

        movieDAO.addMovie(movie);

        HibernateUtil.getSessionFactory().close();
//
//        ScheduleDAO scheduleDAO = new ScheduleDAO();
//        Schedule matrix = new Schedule();
//        matrix.setTitle("Matrix");
//        matrix.setDisplayDate(LocalDate.parse("2017-09-30"));
//        matrix.setDisplayTime(Integer.valueOf(20));
//
//        scheduleDAO.addMovieSchedule(matrix);
//        HibernateUtil.getSessionFactory().close();

    }
}
