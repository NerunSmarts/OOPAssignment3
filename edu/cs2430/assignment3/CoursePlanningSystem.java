package edu.cs2430.assignment3;

import java.util.UUID;
public class CoursePlanningSystem {
    private static final int ARRAY_MAX = 1000;
    private int courseIndex;
    private Course[] courses;
    private int schedule;
    private Schedule[] schedules;
    private int studentIndex;
    private Student[] students;
    private int scheduleIndex;

    /*
     * @author 1: Jonah Gjersvig - 50%ish
     * @author 2: Jack Wilburn - 50%ish as well
     */

    public CoursePlanningSystem() {
        this.courseIndex = 0;
        this.courses = new Course[ARRAY_MAX];
        this.scheduleIndex = 0;
        this.schedules = new Schedule[ARRAY_MAX];
        this.studentIndex = 0;
        this.students = new Student[ARRAY_MAX];
    }

    public boolean addCourse(Course course) {
        if (courseIndex < ARRAY_MAX) {
            courses[courseIndex] = course;
            courseIndex++;
            return true;
        } else {
            return false;
        }
    }

    public boolean addSchedule(Schedule schedule) {
        if (scheduleIndex < ARRAY_MAX) {
            schedules[scheduleIndex] = schedule;
            scheduleIndex++;
            return true;
        } else {
            return false;
        }
    }

    public boolean addScheduleEntryByScheduleUuid(UUID scheduleUuid, ScheduleEntry scheduleEntry) {
        for (Schedule s : schedules) {
            if (s.getUuid() == scheduleUuid) {
                return s.addScheduleEntry(scheduleEntry);
            }
        }
        return false;
    }

    public boolean addStudent(Student student) {
        if (studentIndex < ARRAY_MAX) {
            students[studentIndex] = student;
            studentIndex++;
            return true;
        } else {
            return false;
        }
    }

    public Course getCourse(int courseNumber, Program program) {
        for (Course c : courses) {
            if (c.getNumber() == courseNumber && c.getProgram() == program) {
                return c;
            }
        }
        return null;
    }

    public Course[] getCourses() {
        return courses;
    }

    public Schedule getScheduleByUuid(UUID scheduleUuid) {
        for (Schedule s : schedules) {
            if (s.getUuid() == scheduleUuid) {
                return s;
            }
        }
        return null;
    }

    public Schedule[] getSchedulesByStudentId(int studentId) {
        Schedule[] studentSchedules = new Schedule[ARRAY_MAX];
        int studentScheduleIndex = 0;
        for (Schedule s : schedules) {
            if (s.getStudentId() == studentId) {
                studentSchedules[studentScheduleIndex] = s;
                studentScheduleIndex++;
            }
        }
        return studentSchedules;
    }

    public Schedule[] getSchedules() {
        return schedules;
    }

    public Student getStudent(int studentId) {
        for (Student s : students) {
            if (s.getId() == studentId) {
                return s;
            }
        }
        return null;
    }

    public Student[] getStudents() {
        return students;
    }

    public boolean removeCourse(int courseNumber, Program program) {
        for (Course c : courses) {
            if (c.getNumber() == courseNumber && c.getProgram() == program) {
                c = null;
                return true;
            }
        }
        return false;
    }

    private void removeCourseEntry(int index) {
        courses[index] = null;
    }

    private void removeSchedule(int index) {
        schedules[index] = null;
    }

    public boolean removeSchedule(UUID scheduleUuid) {
        for (Schedule s : schedules) {
            if (s.getUuid() == scheduleUuid) {
                s = null;
                return true;
            }
        }
        return false;
    }

    public boolean removeScheduleEntryByScheduleUuid(UUID scheduleUuid, ScheduleEntry scheduleEntry) {
        for (Schedule s : schedules) {
            if (s.getUuid() == scheduleUuid) {
                return s.removeScheduleEntry(scheduleEntry);
            }
        }
        return false;
    }

    public boolean removeStudent(int studentId) {
        for (Student s : students) {
            if (s.getId() == studentId) {
                s = null;
                return true;
            }
        }
        return false;
    }

    private void removeStudentEntry(int index) {
        students[index] = null;
    }

}
