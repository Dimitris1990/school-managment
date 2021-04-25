
package my_helping_classes;

import java.util.List;
import my_Item_classes.Assignment;
import my_Item_classes.Course;
import my_Item_classes.Student;
import my_Item_classes.Trainer;

public class ListsPerCourse {
    
    private Course course;
    private List<Student> studentsPerCourse;
    private List<Trainer> trainersPerCourse;
    private List<Assignment> assignmentsPerCourse;

    public ListsPerCourse() {
    }

    public ListsPerCourse(Course course, List<Student> studentsPerCourse, List<Trainer> trainersPerCourse, List<Assignment> assignmentsPerCourse) {
        this.course = course;
        this.studentsPerCourse = studentsPerCourse;
        this.trainersPerCourse = trainersPerCourse;
        this.assignmentsPerCourse = assignmentsPerCourse;
    }
    
    
}
