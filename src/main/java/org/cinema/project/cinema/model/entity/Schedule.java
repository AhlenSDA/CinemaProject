package org.cinema.project.cinema.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "movies_schedule")
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int schedule_id;

    @Column(name = "Title")
    private String title;

    @Column(name = "DisplayDate")
    private LocalDate displayDate;

    @Column(name = "DisplayTime")
    private Integer displayTime;

    public int getSchedule_id() {
        return schedule_id;
    }

    public void setSchedule_id(int schedule_id) {
        this.schedule_id = schedule_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDisplayDate() {
        return displayDate;
    }

    public void setDisplayDate(LocalDate displayDate) {
        this.displayDate = displayDate;
    }

    public LocalTime getDisplayTime(LocalTime displayTime) {
        return displayTime;
    }

    public void setDisplayTime(Integer displayTime) {
        this.displayTime = displayTime;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "schedule_id=" + schedule_id +
                ", title='" + title + '\'' +
                ", displayDate=" + displayDate +
                ", displayTime=" + displayTime +
                '}';
    }
}
