package my_Item_classes;

import java.util.ArrayList;
import java.util.List;


public class AssignmentsPerCourse {
    
    private int courseId;
    private List<Integer> assignmentId = new ArrayList();

    public AssignmentsPerCourse() {
    }

    public AssignmentsPerCourse(int courseId, List<Integer> assignmentId) {
        this.courseId = courseId;
        this.assignmentId = assignmentId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public List<Integer> getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(List<Integer> assignmentId) {
        this.assignmentId = assignmentId;
    }

    @Override
    public String toString() {
        return "AssignmentPerCourse{" + "courseId=" + courseId + ", assignmentId=" + assignmentId + '}';
    }
}
