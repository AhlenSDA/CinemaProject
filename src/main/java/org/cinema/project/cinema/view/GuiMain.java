package org.cinema.project.cinema.view;

import javax.swing.*;

public class GuiMain extends JFrame{

    public static void main(String[] args) {

        GuiMain guiMain = new GuiMain();

        guiMain.setContentPane(new CinemaMenu().getContent());
        guiMain.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        guiMain.pack();
        guiMain.setVisible(true);

    }
}
