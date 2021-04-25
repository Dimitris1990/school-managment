package my_Item_classes;

import java.util.ArrayList;
import java.util.List;


public class StudentsPerCourse {
    
    private int courseId;
    private List<Integer> studentId = new ArrayList();

    public StudentsPerCourse() {
    }

    public StudentsPerCourse(int courseId, List<Integer> studentId) {
        this.courseId = courseId;
        this.studentId = studentId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public List<Integer> getStudentId() {
        return studentId;
    }

    public void setStudentId(List<Integer> studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "StudentsPerCourse{" + "courseId=" + courseId + ", studentId=" + studentId + '}';
    }
}
