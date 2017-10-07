package org.cinema.project.cinema.view;

import org.cinema.project.cinema.presenter.MoviePresenter;

import javax.swing.*;
import java.awt.*;

public class GuiMain extends JFrame{

    private MoviePresenter moviePresenter;
    private CinemaMenu cinemaMenu;


    public GuiMain() throws HeadlessException {
        cinemaMenu = new CinemaMenu();
        moviePresenter = new MoviePresenter(cinemaMenu);
        setContentPane(cinemaMenu.getContent());
    }

    public static void main(String[] args) {

        GuiMain guiMain = new GuiMain();
        guiMain.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        guiMain.pack();
        guiMain.setVisible(true);

    }
}
