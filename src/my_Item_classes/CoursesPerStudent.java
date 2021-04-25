package my_Item_classes;


import java.util.ArrayList;
import java.util.List;


public class CoursesPerStudent {
    
    private int studentId;
    private List<Integer> courseId;

    public CoursesPerStudent() {
        courseId = new ArrayList<>();
    }

    public CoursesPerStudent(int studentId, List<Integer> courseId) {
        this.studentId = studentId;
        this.courseId = courseId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public List<Integer> getCourseId() {
        return courseId;
    }

    public void setCourseId(List<Integer> courseId) {
        this.courseId = courseId;
    }

    @Override
    public String toString() {
        return "CoursesPerStudent{" + "studentId=" + studentId + ", courseId=" + courseId + '}';
    }
    }
