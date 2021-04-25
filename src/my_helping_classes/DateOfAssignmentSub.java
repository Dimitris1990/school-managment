package my_helping_classes;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;

import java.util.Scanner;
import static my_helping_classes.HelperClass.assignmentList;
import static my_helping_classes.HelperClass.assignmentsPerCourseList;

import static my_helping_classes.HelperClass.coursesPerStudentList;
import static my_helping_classes.HelperClass.dateCheck;

import static my_helping_classes.HelperClass.studentList;


public class DateOfAssignmentSub {
       static LocalDate end;
       static LocalDate start;
    public static void subDate(Scanner sc) {
        LocalDate check = dateCheck();
        DayOfWeek k = DayOfWeek.from(check);
        System.out.println("Day of week " + k);
        end = check;
        start = check;
        switch (k.getValue()) {
            case 1:
                end = check.plusDays(5);
                start = check.minusDays(1);
                
                break;
            case 2:
                end = check.plusDays(4);
                start = check.minusDays(2);
                
                break;
            case 3:
                end = check.plusDays(3);
                start = check.minusDays(3);
                
                break;
            case 4:
                end = check.plusDays(2);
                start = check.minusDays(4);
                
                break;
            case 5:
                end = check.plusDays(1);
                start = check.minusDays(5);
                
                break;
            case 6:
                end = check;
                start = check.minusDays(6);
                
                break;
            case 7:
                end = check.minusDays(1);
                start = check.minusDays(7);

                break;
        }
        System.out.println(start);
        System.out.println(end);
        
    }
    public static void printAssignmentsPerStudentDate(){
        
        for (int i = 0; i < coursesPerStudentList.size(); i++) {
            if (coursesPerStudentList.get(i).getCourseId().size()>0){
                int f =coursesPerStudentList.get(i).getStudentId();
                
                List<Integer> g = coursesPerStudentList.get(i).getCourseId();
                for (int j = 0; j <g.size() ; j++) {
                   int cid = g.get(j);
                    
                   List<Integer> h = assignmentsPerCourseList.get(cid).getAssignmentId();
                   
                    for (int k = 0; k < h.size(); k++) {
                        int aId = h.get(k);
                        
                        LocalDate assignmentSubDate = assignmentList.get(aId).getSubDateTime();
                        
                        if (assignmentSubDate.isAfter(start) && assignmentSubDate.isBefore(end)){
                        System.out.println(studentList.get(f).getLastName() + " " + studentList.get(f).getFirstName());    
                        System.out.println(assignmentList.get(aId).getTitle()+ " "+ assignmentList.get(aId).getSubDateTime());
                        }
                    }
                }
            }
        }
    }
}
