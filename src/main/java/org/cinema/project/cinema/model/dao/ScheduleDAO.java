package org.cinema.project.cinema.model.dao;

import org.cinema.project.cinema.util.HibernateUtil;
import org.cinema.project.cinema.model.entity.Schedule;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ScheduleDAO {

    public Integer addMovieSchedule(Schedule schedule) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        Integer scheduleID = null;
        try {
            tx = session.beginTransaction();
            scheduleID = (Integer) session.save(schedule);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return scheduleID;
    }
}

