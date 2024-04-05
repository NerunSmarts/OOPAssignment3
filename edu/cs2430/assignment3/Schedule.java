package edu.cs2430.assignment3;
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
        if (scheduleEntryIndex < MAX_SCHEDULE_ENTRY && !contains) {
            scheduleEntries[scheduleEntryIndex] = scheduleEntry;
            scheduleEntryIndex++;
            return true;
        }
        else{
            return false;
        }
    }
    private void removeScheduleEntry(int index) {
        
        int tIndex = -1;
        for (int i = 0; i < scheduleEntries.length; i++) {
            if (scheduleEntries[i] != null && i == index) {
                tIndex = i;
                break;
            }
        }
    
        if (tIndex != -1) {
            ScheduleEntry[] newScheduleEntries = new ScheduleEntry[MAX_SCHEDULE_ENTRY];
            int newScheduleIndex = 0;
            for (int i = 0; i < MAX_SCHEDULE_ENTRY; i++) {
                if (i == index) {
                    continue;
                }
                newScheduleEntries[newScheduleIndex++] = scheduleEntries[i];
            }
            scheduleEntries = newScheduleEntries;
        }
    }
    public boolean removeScheduleEntry(Course course) {
        boolean contains = false;
        int temp = -1;
        for (ScheduleEntry c : scheduleEntries) {
           temp++;
            if (c != null) {
                if (course == c.getCourse()) {
                    contains = true;
                    break;
                }
            }
        }
        if (contains) {
            removeScheduleEntry(temp);
            return true;
        }
        else{
            return false;
        }
    }

    public boolean removeScheduleEntry(UUID uuid) {
        boolean contains = false;
        for (ScheduleEntry c : scheduleEntries) {
            if (c != null) {
                if (uuid == c.getUuid()) {
                    contains = true;
                    c = null;
                }
            }
        }
        if (contains) {
            return true;
        }
        else{
            return false;
        }
    }

    public boolean removeScheduleEntry(ScheduleEntry scheduleEntry) {
        boolean contains = false;
        for (ScheduleEntry c : scheduleEntries) {
            if (scheduleEntry == c) {
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
            if (c != null) {
                if (course == c.getCourse()) {
                    contains = true;
                }
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
            if (c != null) {
                credits += c.getCourse().getNumberOfCredits();
            }
        }
        return credits;
    }
    public int calculateCredits(Semester semester, int year) {
        int credits = 0;
        for (ScheduleEntry c : scheduleEntries) {
            if (c != null) {
                if (c.getSemester() == semester && c.getYear() == year) {
                    credits += c.getCourse().getNumberOfCredits();
                }
            }
        }
        return credits;
    }

    public Course[] getCoursesForSemester(Semester semester, int year) {
        int numOfCourses = 0;
        for (ScheduleEntry c : scheduleEntries) {
            if (c != null) {
                if (c.getSemester() == semester && c.getYear() == year) {
                    numOfCourses += 1;
                }
            }
        }
        Course[] courses = new Course[numOfCourses];
        int temp = 0;
        for (ScheduleEntry c : scheduleEntries) {
            if (c != null) {
                if (c.getSemester() == semester && c.getYear() == year) {
                    courses[temp] = c.getCourse();
                    temp += 1;
                }
            }
        }
        return courses;
    }

    public ScheduleEntry[] getScheduleEntries() {
        return scheduleEntries;
    }

}
