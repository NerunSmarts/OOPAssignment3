package edu.cs2430.assignment3.CoursePlanningSystem;
import java.util.UUID;

public class Schedule {
    private static final int MAX_SCHEDULE_ENTRY = 50;
    private ScheduleEntry[] scheduleEntries = new ScheduleEntry[MAX_SCHEDULE_ENTRY];
    private int scheduleEntryIndex;
    private int studentId;
    private UUID uuid;

    public Schedule(int studentId){
        this.studentId = studentId;
        this.uuid = UUID.randomUUID();
    }
    public Schedule(Schedule otherSchedule){
        this.studentId = otherSchedule.studentId;
        this.scheduleEntryIndex = otherSchedule.scheduleEntryIndex;
        this.scheduleEntries = otherSchedule.scheduleEntries;
        this.uuid = UUID.randomUUID();
    }

    public UUID getUuid() {return uuid;}
    public int getStudentId() {return studentId;}
    public ScheduleEntry getScheduleEntry(int index) {return scheduleEntries[index];}
    public boolean addScheduleEntry(ScheduleEntry scheduleEntry) {
        boolean contains = false;
        for (ScheduleEntry c : scheduleEntries) {
            if (scheduleEntry == c) {
                contains = true;
            }
        }
        if (scheduleEntries.length < MAX_SCHEDULE_ENTRY && !contains) {

            return true;
        }
        else{
            return false;
        }
    }
    private void removeScheduleEntry(int index) {
        scheduleEntries[index] = null;
    }
    public boolean removeScheduleEntry(ScheduleEntry scheduleEntry) {
        boolean contains = false;
        for (ScheduleEntry c : scheduleEntries) {
            if (scheduleEntry == c) {
                contains = true;
            }
        }
        if (contains) {
            return true;
        }
        else{
            return false;
        }
    }

    public boolean removeScheduleEntry(UUID uuid) {
        boolean contains = false;
        for (ScheduleEntry c : scheduleEntries) {
            if (uuid == c.getUuid()) {
                contains = true;
                c = null;
            }
        }
        if (contains) {
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isCourseInSchedule(Course course) {
        boolean contains = false;
        for (ScheduleEntry c : scheduleEntries) {
            if (course == c.getCourse()) {
                contains = true;
            }
        }
        if (contains) {
            return true;
        }
        else{
            return false;
        }
    }

    public int calculateCredits() {
        int credits = 0;
        for (ScheduleEntry c : scheduleEntries) {
            credits += c.getCourse().getNumberOfCredits();
        }
        return credits;
    }
    public int calculateCredits(Semester semester, int year) {
        int credits = 0;
        for (ScheduleEntry c : scheduleEntries) {
            if (c.getSemester() == semester && c.getYear() == year) {
                credits += c.getCourse().getNumberOfCredits();
            }
        }
        return credits;
    }

    public Course[] getCoursesForSemester(Semester semester, int year) {
        int numOfCourses = 0;
        for (ScheduleEntry c : scheduleEntries) {
            if (c.getSemester() == semester && c.getYear() == year) {
                numOfCourses += 1;
            }
        }
        Course[] courses = new Course[numOfCourses];
        int temp = 0;
        for (ScheduleEntry c : scheduleEntries) {
            if (c.getSemester() == semester && c.getYear() == year) {
                courses[temp] = c.getCourse();
                temp += 1;
            }
        }
        return courses;
    }

}
