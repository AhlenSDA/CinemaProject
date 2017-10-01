package org.cinema.project.cinema.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CinemaMenu {
    private JPanel content;
    private JTextField cinemaProjectTextField;
    private JTable Movies;
    private JTextField adminCommandsTextField;
    private JTextField moviesDetailsTextField;
    private JButton addMovieButton;
    private JButton updateDatabaseButton;
    private JButton bookingButton;
    private JButton deleteMovieButton;
    private JButton currentShowtimesButton;
    private JButton searchMovieButton;
    private JButton addNewShowtimeButton;
    private JTextField moviesTextField;
    private JTextField showtimeTextField;
    private JTextField databaseTextField;
    private JScrollBar scrollBar1;
    private JButton movieDatabaseButton;

    public CinemaMenu() {
        addMovieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame addMovie = new JFrame();
                addMovie.setVisible(true);
                addMovie.setContentPane(new AddMovie().getPanel1());
                addMovie.pack();
            }
        });
    }

    public JPanel getContent() {
        return content;
    }
}


