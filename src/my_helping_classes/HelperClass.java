package my_helping_classes;


import my_Item_classes.StudentsPerCourse;
import static java.lang.Character.isAlphabetic;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import my_Item_classes.Assignment;
import my_Item_classes.AssignmentsPerCourse;
import my_Item_classes.Course;
import my_Item_classes.CoursesPerStudent;
import my_Item_classes.Student;
import my_Item_classes.Trainer;
import my_Item_classes.TrainersPerCourse;


public class HelperClass { //Class that contains all my methods.

//------------------------------------------------------------------------------     
//Scanner.
    public static Scanner sc = new Scanner(System.in);
    
//------------------------------------------------------------------------------ 
//Basic Lists.
    public static List<Student> studentList = new ArrayList();
    public static List<Trainer> trainerList = new ArrayList();
    public static List<Assignment> assignmentList = new ArrayList();
    public static List<Course> courseList = new ArrayList();
    
//Merged Lists.
    public static List<StudentsPerCourse> studentsPerCourseList = new ArrayList();
    public static List<TrainersPerCourse> trainersPerCourseList = new ArrayList();
    public static List<AssignmentsPerCourse> assignmentsPerCourseList = new ArrayList();
    public static List<CoursesPerStudent> coursesPerStudentList = new ArrayList();
//------------------------------------------------------------------------------    
//Main menu method.
    public static void choiceMenu() {

        int choice;
        do {
            System.out.println("-----------------------•  MAIN MENU  •----------------------------");
            System.out.println("• Choose:\n 1. Make lists.\n 2. Combine lists.\n"
                    + " 3. Printing.\n 4. Use Synthetic data.\n 0. Exit");
            System.out.println("-----------------------------------------------------------------");
            choice = numChecking();

            switch (choice) {
                case 1:
                    int choice1;
                    System.out.println("-----------------------------------------------------------------");
                    System.out.println("• Make:\n 1. Student list.\n 2. Trainer list.\n 3. Assignment list.\n 4. Course list.\n "
                            + "0. Return.");
                    System.out.println("-----------------------------------------------------------------");
                    choice1 = numChecking();
                    switch(choice1){
                        case 1:
                            studentInput();
                            break;
                   
                        case 2:
                            trainerInput();
                            break;
                        
                        case 3:
                            assignmentInput();
                            break;
                            
                        case 4:
                            courseInput();
                            break;
                        
                        case 0:
                            choiceMenu();
                            break;
                    }
                    break;
                    
                case 2:
                    int choice2;
                    System.out.println("-----------------------------------------------------------------");
                    System.out.println("• Make:\n 1. Student per Course list.\n "
                            + "2. Trainer per Course list.\n 3. Assignment per Course list.\n "
                            +"\n 0. Return.");
                    System.out.println("-----------------------------------------------------------------");
                    choice2 = numChecking();
                    switch(choice2){
                        case 1:
                            studentsPerCourseMerge(courseList, studentList);
                            coursesPerStudentMerge();
                            break;
                   
                        case 2:
                            trainersPerCourseMerge(courseList, studentList);
                            break;
                        
                        case 3:
                            assignmentsPerCourseMerge(courseList, assignmentList);
                            break;
                            
                        case 4:
                            
                            break;
                            
                        case 0:
                            choiceMenu();
                            break;
                    }
                    break;
                    
                case 3 :
                    int choice3;
                    System.out.println("-----------------------------------------------------------------");
                    System.out.println("• Print:\n 1. Student list.\n 2. Trainer list.\n 3. Assignment list.\n "
                            + "4. Course list.\n 5. Students per Course list.\n 6. Trainers per Course list.\n"
                            + " 7. Assignments per Course list.\n 8. Assignments per student.\n"
                            + " 9. Students with multiple courses\n 10. Assignments date of submition.\n 0. Return.");
                    System.out.println("-----------------------------------------------------------------");
                    choice3 = numChecking();
                    switch(choice3){
                        case 1:
                            System.out.println(studentList);
                            break;
                   
                        case 2:
                            System.out.println(trainerList);
                            break;
                        
                        case 3:
                            System.out.println(assignmentList);
                            break;
                            
                        case 4:
                            System.out.println(courseList);
                            break;
                            
                        case 5:
                            printStudentsPerCourseList(studentsPerCourseList, courseList, studentList);
                            break;
                        
                        case 6:
                            printTrainersPerCourseList(trainersPerCourseList, courseList, trainerList);
                            break;
                            
                        case 7:
                            printAssignmentsPerCourseList(assignmentsPerCourseList, courseList, assignmentList);
                            break;
                            
                        case 8:
                            printAssignmentsPerStudent();
                            break;
                            
                        case 9:
                            printMultipleCoursesPerStudent();
                            break;
                        
                        case 10:
                            DateOfAssignmentSub.subDate(sc);
                            DateOfAssignmentSub.printAssignmentsPerStudentDate();
                            break;
                        case 0:
                            choiceMenu();
                            break;
                    }
                    break;
                    
                case 4:
                    System.out.println("notice: Once you use synthetic date you will be able to continue \n"
                                 + "adding data manualy in your lists but you won't be able to empty them \n"
                                 + "unless you restart the program!\n");
                    System.out.println("Are you sure you want to continue? ");    
                    boolean check = yesNoChoise();
                    
                    if(check){
                        SyntheticData.syntheticStudentData();
                        SyntheticData.syntheticTrainerData();
                        SyntheticData.syntheticAssignmentData();
                        SyntheticData.syntheticCourseData();
                        break;
                    }else{
                       choiceMenu(); 
                    }
                        
                case 0:
                    System.out.println("Exiting program...");
                    System.exit(0);

            }
        } while (choice != 0);
    }
    
//------------------------------Funtional-Methods-------------------------------
//******************************************************************************
//------------------------------------------------------------------------------
//Stoping the user from giving numbers and numbers with characters instead of only characters.
    public static String charChecking(){
        
        String x = sc.next();
        boolean error = true;
        while (error) {
            for (int i = 0; i < x.length(); i++) {
                if (!isAlphabetic(x.charAt(i))) {
                    error = true;
                    System.out.println("Wrong input. Type only letters!");
                    x = sc.next();
                    break;
                } else {
                    error = false;
               }
            }
        }
        return x;
    }
    
//------------------------------------------------------------------------------ 
//Stoping the user from giving anything but numbers.
    public static int numChecking (){
        
        int x = 0;
        while (true) {
            if (sc.hasNextInt()) {
                x = sc.nextInt();
                break;
            } else {
                String m = sc.next();
                System.out.println("Wrong input. Use only numbers.");
            }
        }
         return x;
    }

//------------------------------------------------------------------------------ 
//Yea or No checking method.
    public static boolean yesNoChoise() {
        char choice;
        System.out.print("Y/N ?\n");
        while (true) {
            choice = sc.next().charAt(0);
            if (choice == 'Y' || choice == 'y') {
                return true;
            }
            if (choice == 'N' || choice == 'n') {
                return false;
            }
        }
    }
    
//------------------------------------------------------------------------------
//Method to check inport and parse Local Dates.   
    public static LocalDate dateCheck(){
        System.out.println("Give your date (d/M/y): ");
        String date = sc.next();
        DateTimeFormatter formatter;
        LocalDate dateFromString;
        boolean error = true;
        while(error){
        try {
            formatter = DateTimeFormatter.ofPattern("d/M/y");
            dateFromString = LocalDate.parse(date, formatter);
            error = false;
          } catch (DateTimeParseException ex) {
               System.out.println("Give your date in this format (dd/MM/yyy): ");
               date = sc.next();
                    error = true;
                }
        }
        formatter = DateTimeFormatter.ofPattern("d/M/y");
        dateFromString = LocalDate.parse(date, formatter);
        return dateFromString;
    }
        
    
//-------------------------------------LISTS------------------------------------
//******************************************************************************
//-------------------------------------BASIC------------------------------------
// List for students.
     public static List<Student> studentInput() {
        int i = 0;
        System.out.println("Do you want to add a Student?");
        boolean y = yesNoChoise();
        while (y) {
            Student student = new Student();
            System.out.printf("Enter first name of student %d: \n", (i + 1));
            student.setFirstName(charChecking());
            System.out.printf("Enter last name of student %d: \n", (i + 1));
            student.setLastName(charChecking());
            System.out.printf("Enter Students %d birth date: \n", (i + 1));
            student.setDateOfBirth(dateCheck());
            System.out.printf("Enter Students %d tuition fees: \n", (i + 1));
            student.setTuitionFees(numChecking());
            studentList.add(student);
            i++;
            System.out.print("Do you want to add an other student?\n");
            y=yesNoChoise();
            if(y==false)
            return studentList;
        }
        return studentList;
    }

//------------------------------------------------------------------------------
//List creation for trainers.
    public static List<Trainer> trainerInput() {
        int i = 0;
        System.out.println("Do you want to add a Trainer?");
        boolean y = yesNoChoise();
        while (y) {
            Trainer trainer = new Trainer();
            System.out.printf("Enter first name of trainer %d: \n", (i + 1));
            trainer.setFirstName(charChecking());
            System.out.printf("Enter last name of trainer %d: \n", (i + 1));
            trainer.setLastName(charChecking());
            trainerList.add(trainer);
            i++;
            System.out.print("Do you want to add an other trainer?\n");
            y = yesNoChoise();
            if (y == false) {
                return trainerList;
            }
        }
        return trainerList;
    }

//------------------------------------------------------------------------------ 
//List creation for assignments.
    public static List<Assignment> assignmentInput() {
        int i = 0;
        System.out.println("Do you want to add an Assignment?");
        boolean y = yesNoChoise();
        while (y) {
            Assignment assignment = new Assignment();
            System.out.printf("Enter a title for assignment %d: \n", (i + 1));
            assignment.setTitle(charChecking());
            System.out.printf("Enter a description for assignment %d: \n", (i + 1));
            assignment.setDescription(charChecking());
            System.out.printf("Enter the date of submition for assignment %d: \n", (i + 1));
            assignment.setSubDateTime(dateCheck());
            System.out.printf("Enter the total mark for the assignment %d: \n", (i + 1));
            assignment.setTotalMark(numChecking());
            assignmentList.add(assignment);
            i++;
            System.out.print("Do you want to add an other assignment?\n");
            y = yesNoChoise();
            if (y == false) {
                return assignmentList;
            }
        }
        return assignmentList;
    }

//------------------------------------------------------------------------------ 
//List creation for courses.
    public static List<Course> courseInput() {
        int i = 0;
        System.out.println("Do you want to add an Course?");
        boolean y = yesNoChoise();
        while (y) {
            Course course = new Course();
            System.out.printf("Enter a title for course %d: \n", (i + 1));
            sc.nextLine();//to clear the new line
            course.setTitle(sc.nextLine());
            System.out.printf("Enter a stream for course %d: \n", (i + 1));
            course.setStream(charChecking());
            System.out.printf("Enter a type for course %d: \n", (i + 1));
            course.setType(charChecking());
            System.out.printf("Enter the starting date of course %d: \n", (i + 1));
            course.setStartDate(dateCheck());
            System.out.printf("Enter the end date of course %d: \n", (i + 1));
            course.setEndDate(dateCheck());
            courseList.add(course);
            i++;
            System.out.print("Do you want to add an other course?\n");
            y = yesNoChoise();
            if (y == false) {
                return courseList;
            }
        }
        return courseList;
    }
    
//------------------------------------MERGING-----------------------------------
//Method to register Students in Courses.
    public static List<StudentsPerCourse> studentsPerCourseMerge(List<Course> courseList,List<Student> studentList){
        
        for (int i = 0; i < courseList.size(); i++) {
            StudentsPerCourse studentsPerCourse = new StudentsPerCourse();
            System.out.println("Course: " + courseList.get(i).getTitle());
            for (int j = 0; j < studentList.size(); j++) {
                System.out.println((j+1) + " - " + studentList.get(j).getFirstName() + " " + studentList.get(j).getLastName());
            }
            studentsPerCourse.setCourseId(i);
            while(true){
                System.out.println("Select the student you want to register in the course by typing his number or type 0 to stop.");
                //System.out.println("Course: " + courseList.get(i).getTitle());
                int studentNumber = sc.nextInt();
                if(studentNumber == 0){
                    break;
                }else{
                   studentsPerCourse.getStudentId().add(studentNumber-1);
                }
            }
            studentsPerCourseList.add(studentsPerCourse);
        }
        return studentsPerCourseList;
    }

//Method to print Students per Course list.
    public static void printStudentsPerCourseList(List<StudentsPerCourse> studentsPerCourseList, List<Course> courseList, List<Student> studentList){
        int a;
        for (int i = 0; i < studentsPerCourseList.size(); i++) {
            System.out.println("• Course: " + courseList.get(studentsPerCourseList.get(i).getCourseId()).getTitle());
            for (int j = 0; j < studentsPerCourseList.get(i).getStudentId().size(); j++) {
                a = studentsPerCourseList.get(i).getStudentId().get(j);
                System.out.println("- Student: " + studentList.get(a).getFirstName() + " " + studentList.get(a).getLastName());
            }
            System.out.println("");
        }
    }

//------------------------------------------------------------------------------    
//Method to register Trainers in Courses.
    public static List<TrainersPerCourse> trainersPerCourseMerge(List<Course> courseList,List<Student> trainerList){
        
        for (int i = 0; i < courseList.size(); i++) {
            TrainersPerCourse trainersPerCourse = new TrainersPerCourse();
            System.out.println("Course: " + courseList.get(i).getTitle());
            for (int j = 0; j < trainerList.size(); j++) {
                System.out.println((j+1) + " - " + trainerList.get(j).getFirstName() + " " + trainerList.get(j).getLastName());
            }
            trainersPerCourse.setCourseId(i);
            while(true){
                System.out.println("Select the trainer you want to register in the course by typing his number or type 0 to stop.");
                int trainerNumber = sc.nextInt();
                if(trainerNumber == 0){
                    break;
                }else{
                   trainersPerCourse.getTrainerId().add(trainerNumber-1);
                }
            }
            trainersPerCourseList.add(trainersPerCourse);
        }
        return trainersPerCourseList;
    }
    
//Method to print Students per Course list.
    public static void printTrainersPerCourseList(List<TrainersPerCourse> trainersPerCourseList, List<Course> courseList, List<Trainer> trainerList){
        
        int a;
        for (int i = 0; i < trainersPerCourseList.size(); i++) {
            System.out.println("• Course: " + courseList.get(trainersPerCourseList.get(i).getCourseId()).getTitle());
            for (int j = 0; j < trainersPerCourseList.get(i).getTrainerId().size(); j++) {
                a = trainersPerCourseList.get(i).getTrainerId().get(j);
                System.out.println("- Trainer: " + trainerList.get(a).getFirstName() + " " + trainerList.get(a).getLastName());
            }
            System.out.println("");
        }
    }
    
//------------------------------------------------------------------------------    
//Method to register Assignments in Courses.
    public static List<AssignmentsPerCourse> assignmentsPerCourseMerge(List<Course> courseList,List<Assignment> assignmentList){
        
        for (int i = 0; i < courseList.size(); i++) {
            AssignmentsPerCourse assignmentsPerCourse = new AssignmentsPerCourse();
            System.out.println("Course: " + courseList.get(i).getTitle());
            for (int j = 0; j < assignmentList.size(); j++) {
                System.out.println((j+1) + " - " + assignmentList.get(j).getTitle());
            }
            assignmentsPerCourse.setCourseId(i);
            while(true){
                System.out.println("Select the assignment you want to register in the course by typing its number or type 0 to stop.");
                
                int assignmentNumber = sc.nextInt();
                if(assignmentNumber == 0){
                    break;
                }else{
                   assignmentsPerCourse.getAssignmentId().add(assignmentNumber-1);
                }
            }
            assignmentsPerCourseList.add(assignmentsPerCourse);
        }
        return assignmentsPerCourseList;
    }
    
//Method to print Assignments per Course list.
    public static void printAssignmentsPerCourseList(List<AssignmentsPerCourse> assignmentsPerCourseList, List<Course> courseList, List<Assignment> assignmentList){
        int a;
        for (int i = 0; i < assignmentsPerCourseList.size(); i++) {
            System.out.println("• Course: " + courseList.get(assignmentsPerCourseList.get(i).getCourseId()).getTitle());
            for (int j = 0; j < assignmentsPerCourseList.get(i).getAssignmentId().size(); j++) {
                a = assignmentsPerCourseList.get(i).getAssignmentId().get(j);
                System.out.println("- Assignment: " + assignmentList.get(a).getTitle());
            }
            System.out.println("");
        }
        
    }
    
//Method to reverse students per course.
    public static List<CoursesPerStudent> coursesPerStudentMerge(){
        
        for (int i = 0; i < studentList.size(); i++) {
            CoursesPerStudent coursesPerStudent = new CoursesPerStudent();
            coursesPerStudent.setStudentId(i);
            coursesPerStudentList.add(coursesPerStudent);
        }
        System.out.println("courses per student: " + coursesPerStudentList);
        for (int i = 0; i < studentsPerCourseList.size(); i++) {
            List<Integer> stID = studentsPerCourseList.get(i).getStudentId();
            for (int j = 0; j < stID.size(); j++) {
                int k = stID.get(j);
                
                coursesPerStudentList.get(k).getCourseId().add(i);
             }
        }
        return coursesPerStudentList;
    }

//Method to print students that are in more than one course
    public static void printMultipleCoursesPerStudent(){
        
        for (int i = 0; i < coursesPerStudentList.size(); i++) {
            if (coursesPerStudentList.get(i).getCourseId().size()>1) {
                int f =coursesPerStudentList.get(i).getStudentId();
                System.out.println(f + ". " + studentList.get(i).getLastName() + " " + studentList.get(i).getFirstName());
            }
        }
    }

//Method to print the assignments per student.
    public static void printAssignmentsPerStudent(){
        
        for (int i = 0; i < coursesPerStudentList.size(); i++) {
            if (coursesPerStudentList.get(i).getCourseId().size()>0){
                int f =coursesPerStudentList.get(i).getStudentId();
                System.out.println(studentList.get(f).getLastName() + " " + studentList.get(f).getFirstName());
                List<Integer> g = coursesPerStudentList.get(i).getCourseId();
                for (int j = 0; j <g.size() ; j++) {
                   int cid = g.get(j);
                   List<Integer> h = assignmentsPerCourseList.get(cid).getAssignmentId();
                    for (int k = 0; k < h.size(); k++) {
                        int aId = h.get(k);
                        System.out.println(courseList.get(cid).getTitle() + " - " + assignmentList.get(aId).getTitle());
                    }
                }
            }
        }
        
    }

}