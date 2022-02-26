package cs2263_hw03;

public class Course {
    private String courseName = null;
    private String department = null;
    private String courseCode = null;
    private int credits = 0;

    public Course() {

    }

    public Course(String department, String course, String code, int numCredits) {
        this.department = department;
        this.courseName = course;
        this.courseCode = code;
        this.credits = numCredits;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
}
