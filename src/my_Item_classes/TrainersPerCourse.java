package my_Item_classes;

import java.util.ArrayList;
import java.util.List;


public class TrainersPerCourse {
    
    private int courseId;
    private List<Integer> trainerId = new ArrayList();

    public TrainersPerCourse() {
    }

    public TrainersPerCourse(int courseId, List<Integer> trainerId) {
        this.courseId = courseId;
        this.trainerId = trainerId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public List<Integer> getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(List<Integer> trainerId) {
        this.trainerId = trainerId;
    }

    @Override
    public String toString() {
        return "TrainersPerCourse{" + "courseId=" + courseId + ", trainerId=" + trainerId + '}';
    }
    
    
}
