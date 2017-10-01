package org.cinema.project.cinema.view;

import org.cinema.project.cinema.util.HibernateUtil;
import org.cinema.project.cinema.model.dao.ScheduleDAO;
import org.cinema.project.cinema.model.entity.Schedule;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

public class AddMovie {
    private JTextField textTitle;
    private JTextField textYear;
    private JTextField textDuration;
    private JTextField textDirector;
    private JRadioButton ADDRadioButton;
    private JPanel panel1;

    public AddMovie() {
        ADDRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ScheduleDAO scheduleDAO = new ScheduleDAO();
                Schedule matrix = new Schedule();
                matrix.setTitle(textTitle.getText());
                matrix.setDisplayDate(LocalDate.parse(textYear.getText()));
                matrix.setDisplayTime(Integer.valueOf(textDuration.getText()));

                scheduleDAO.addMovieSchedule(matrix);
                HibernateUtil.getSessionFactory().close();
            }
        });
    }

    public JPanel getPanel1() {
        return panel1;
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
