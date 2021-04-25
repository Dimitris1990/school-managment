
package my_helping_classes;

import java.time.LocalDate;

import java.util.concurrent.ThreadLocalRandom;
import java.util.List;
import my_Item_classes.Assignment;
import my_Item_classes.Course;
import my_Item_classes.Student;
import my_Item_classes.Trainer;
import static my_helping_classes.HelperClass.assignmentList;
import static my_helping_classes.HelperClass.courseList;
import static my_helping_classes.HelperClass.studentList;
import static my_helping_classes.HelperClass.trainerList;


public class SyntheticData {//Synthetic data methods.
    
//Random dates.
    public static LocalDate syntheticRandomDate(){
        long start = LocalDate.of(1980, 1, 1).toEpochDay();
        long end = LocalDate.of(2000, 1, 1).toEpochDay();
        long random = ThreadLocalRandom.current().nextLong(start, end);
        LocalDate randomDate = LocalDate.ofEpochDay(random);
        return randomDate;
    }

//Synthetic Students.    
    public static List<Student> syntheticStudentData(){
    
    Student s1 = new Student("Elvis","StudentBot1",syntheticRandomDate(),2500);
    Student s2 = new Student("Sean","StudentBot2",syntheticRandomDate(),2500);
    Student s3 = new Student("Patrick","StudentBot3",syntheticRandomDate(),2500);
    Student s4 = new Student("Moira","StudentBot4",syntheticRandomDate(),2500);
    Student s5 = new Student("Jessica","StudentBot5",syntheticRandomDate(),2500);
    Student s6 = new Student("Kevin","StudentBot6",syntheticRandomDate(),2500);
    Student s7 = new Student("Fred","StudentBot7",syntheticRandomDate(),2500);
    Student s8 = new Student("Malvin","StudentBot8",syntheticRandomDate(),2500);
    Student s9 = new Student("Stewart","StudentBot9",syntheticRandomDate(),2500);
    Student s10 = new Student("Bety","StudentBot10",syntheticRandomDate(),2500);
    
    studentList.add(s1);studentList.add(s2);studentList.add(s3);
    studentList.add(s4);studentList.add(s5);studentList.add(s6);
    studentList.add(s7);studentList.add(s8);studentList.add(s9);
    studentList.add(s10);
    
    return studentList;
    
    }
    
//Synthetic Trainers.    
    public static List<Trainer> syntheticTrainerData(){
        
        Trainer t1 = new Trainer("Albus","Dumbledor");
        Trainer t2 = new Trainer("Severus","Snape");
        Trainer t3 = new Trainer("Minerva","McGonagall");
        Trainer t4 = new Trainer("Sybill","Trelawney");
        
        trainerList.add(t1);trainerList.add(t2);
        trainerList.add(t3);trainerList.add(t4);
        
        return trainerList;
    }

//Synthetic Assignments.    
    public static List<Assignment> syntheticAssignmentData(){
        
        LocalDate date = LocalDate.of(2020, 07, 15);
        
        Assignment a1 = new Assignment("Project 1","Something something",date.plusDays(13),100);
        Assignment a2 = new Assignment("Project 2","Something something",date.plusMonths(2),100);
        Assignment a3 = new Assignment("Project 3","Something something",date.plusMonths(4),100);
        
        assignmentList.add(a1);assignmentList.add(a2);assignmentList.add(a3);
        
        return assignmentList;
    }

//Synthetic Courses.    
    public static List<Course> syntheticCourseData(){
        
        LocalDate date = LocalDate.of(2020, 06, 15);
        
        Course c1 = new Course("CB11 Java Full Time","Full Time","online",date,date.plusMonths(3));
        Course c2 = new Course("CB11 Java Part Time","Part Time","online",date,date.plusMonths(6));
        Course c3 = new Course("CB11 C# Full Time","Full Time","online",date,date.plusMonths(3));
        Course c4 = new Course("CB11 C# Part Time","Part Time","online",date,date.plusMonths(6));
        
        courseList.add(c1);courseList.add(c2);courseList.add(c3);courseList.add(c4);
        
        return courseList;
    }
}
