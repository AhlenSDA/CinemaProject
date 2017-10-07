package org.cinema.project.cinema.view;

import org.cinema.project.cinema.model.dao.MovieDAO;
import org.cinema.project.cinema.model.entity.Movie;
import org.cinema.project.cinema.presenter.MoviePresenter;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.List;

public class CinemaMenu {
    private JPanel content;
    private JTextField cinemaProjectTextField;
    private JTextField adminCommandsTextField;
    private JTextField movieDetailsTextField;
    private JButton addMovieButton;
    private JButton updateDatabaseButton;
    private JButton bookingButton;
    private JButton deleteMovieButton;
    private JButton currentShowtimesButton;
    private JButton searchMovieButton;
    private JButton addNewShowtimeButton;
    private JTextField MOVIESTextField;
    private JTextField SHOWTIMETextField;
    private JTextField DATABASETextField;
    private JScrollBar scrollBar1;
    private JButton movieDatabaseButton;
    private JTextField directorTextField;
    private JTextField durationTextField;
    private JTextField realeaseDateTextField;
    private JTextField movieTitleTextField;
    private JTextField movieTitleTextField2;
    private JTextField movieTitleTextField1;
    private JList movieList;
    private MoviePresenter moviePresenter;
    private Movie movie = new Movie();
    private MovieDAO movieDAO = new MovieDAO();

    public CinemaMenu() {

        moviePresenter = new MoviePresenter(this);
        initMovieList();
        addMovieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                movie.setTitle(movieTitleTextField.getText());
                movie.setReleaseDate(LocalDate.parse(realeaseDateTextField.getText()));
                movie.setMovieDuration(Integer.valueOf(durationTextField.getText()));
                movie.setDirectorName(directorTextField.getText());
                moviePresenter.addMovie(movie);
            }
        });
        moviePresenter.showMovieList();
    }

    public void setMovieList(List<Movie> movies) {
        movieList.setModel(new MovieListModel(movies));
    }

    private void initMovieList() {
        movieList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        movieList.setCellRenderer(new ListCellRenderer<Movie>() {
            @Override
            public Component getListCellRendererComponent(JList<? extends Movie> list, Movie value, int index, boolean isSelected, boolean cellHasFocus) {
                JLabel listItem = new JLabel(value.getTitle());
                listItem.setOpaque(true);
                if (isSelected)

                {
                    listItem.setBackground(list.getSelectionBackground());
                    listItem.setForeground(list.getSelectionForeground());
                } else {
                    listItem.setBackground(list.getBackground());
                    listItem.setForeground(list.getForeground());
                }
                listItem.setFont(list.getFont());
                listItem.setEnabled(list.isEnabled());
                listItem.setMinimumSize(new Dimension(100, 20));
                return listItem;
            }
        });

        movieList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                JList<Movie> movieList = (JList<Movie>) e.getSource();
                Movie selectedMovie = movieList.getSelectedValue();

//                movieTitle.setText(selectedMovie.getTitle());
//                movieDuration.setText("" + selectedMovie.getMovieDuration());
//                movieDirector.setText(selectedMovie.getDirectorName());
                System.out.println(selectedMovie);
            }
        });
    }


    public JPanel getContent() {
        return content;
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}


