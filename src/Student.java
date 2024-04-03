package edu.cs2430.assignment3.CoursePlanningSystem;
public class Student {

    private String name;
    private int id;
    private Schedule[] schedules;
    private final static int MAX_SCHEDULES = 5;
    private static int nextStudentId = 1;

    public Student(String name) {
        this.name = name;
        this.id = nextStudentId;
        this.schedules = new Schedule[MAX_SCHEDULES];
        nextStudentId++;
    }
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Schedule[] getSchedules() {
            return schedules;
        }

        public void setSchedules(Schedule[] schedules) {
            this.schedules = schedules;
        }
    }
    
