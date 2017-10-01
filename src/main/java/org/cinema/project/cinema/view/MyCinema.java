package org.cinema.project.cinema.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyCinema {
    private JPanel panel1;
    private JButton button1;
    private JButton button2;
    private JButton DodajFilm;
    private JButton button4;
    private JButton button5;
    private JButton button6;

    public MyCinema() {
        DodajFilm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame addMovie = new JFrame();
                addMovie.setVisible(true);
                addMovie.setContentPane(new AddMovie().getPanel1());
                addMovie.pack();

            }
        });
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public JButton getButton1() {
        return button1;
    }

    public JButton getButton2() {
        return button2;
    }

    public JButton getDodajFilm() {
        return DodajFilm;
    }

    public JButton getButton4() {
        return button4;
    }

    public JButton getButton5() {
        return button5;
    }

    public JButton getButton6() {
        return button6;
    }
}
