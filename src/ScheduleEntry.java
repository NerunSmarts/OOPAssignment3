package edu.cs2430.assignment3;
import java.util.UUID;
public final class ScheduleEntry {
    private final Course course;
    private final Semester semester;
    private final UUID uuid;
    private final int year;

    public ScheduleEntry(UUID uuid, Semester semester, int year, Course course) {
        this.course = course;
        this.semester = semester;
        this.year = year;
        this.uuid = uuid;
    }

    public ScheduleEntry(Semester semester, int year, Course course) {
        this.course = course;
        this.semester = semester;
        this.year = year;
        this.uuid = UUID.randomUUID();
    }

    public ScheduleEntry(ScheduleEntry otherScheduleEntry) {
        this.course = otherScheduleEntry.course;
        this.semester = otherScheduleEntry.semester;
        this.year = otherScheduleEntry.year;
        this.uuid = UUID.randomUUID();
    }

    public Course getCourse() {
        return course;
    }

    public Semester getSemester() {
        return semester;
    }

    public UUID getUuid() {
        return uuid;
    }

    public int getYear() {
        return year;
    }


}
