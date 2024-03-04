public class scheduleObject {
    private String semester;
    private int year;
    private course courseObject;

    public scheduleObject(String semester, int year, course courseObject) {
        this.semester = semester;
        this.year = year;
        this.courseObject = courseObject;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public course getCourseObject() {
        return courseObject;
    }

    public void setCourseObject(course courseObject) {
        this.courseObject = courseObject;
    }

}
