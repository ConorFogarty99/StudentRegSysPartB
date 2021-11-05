package StudentRegistrationSystemPartB2;
 
import java.util.ArrayList;
import org.joda.time.DateTime;
import StudentRegistrationSystem.Module;
import StudentRegistrationSystem.Student;
import StudentRegistrationSystem.CourseProgramme;
 
 
public class Main {
 
       public static void main(String[] args) {
    	ArrayList<Student> students = new ArrayList<Student>();
    	ArrayList<Module> modules = new ArrayList<Module>();
    	ArrayList<CourseProgramme> courses = new ArrayList<CourseProgramme>();
    	
        //Creating student data to populate arrays
        Student s1 = new Student("Conor Fogarty", new DateTime(1999, 7, 15 ,0 , 0 , 0 ));
        Student s2 = new Student("Sean Fogarty", new DateTime(1998, 7, 12 ,0 , 0 , 0 ));
        Student s3 = new Student("Kelan Fogarty", new DateTime(2001, 1, 30, 0 , 0 , 0 ));
        Student s4 = new Student("Ronan Fogarty", new DateTime(1995, 2, 22 ,0 , 0 , 0 ));
        Student s5 = new Student("Eoin Downing", new DateTime(1995, 6, 7 ,0 , 0 , 0 ));
        	
        //Add students to students array list
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
       
       
        //Creating module data to populate arrays
        Module m1 = new Module("CT400", "001");
        Module m2 = new Module("CT401", "002");
        Module m3 = new Module("ME402", "003");
        Module m4 = new Module("MA403", "004");
        Module m5 = new Module("MA404", "005");
        
        //Add modules to module array list
        modules.add(m1);
        modules.add(m2);
        modules.add(m3);
        modules.add(m4);
        modules.add(m5);
      
       
        //Creating start and end dates for the courses
        DateTime startDate = new DateTime(2021, 9, 01 ,0 , 0 , 0 );
        DateTime endDate = new DateTime(2022, 5, 19 ,0 , 0 , 0 );
       
        //Creating course data to populate arrays
        CourseProgramme c1 = new CourseProgramme("Computer Science", startDate, endDate);
        CourseProgramme c2 = new CourseProgramme("Mecanical Engineering",  startDate, endDate);
        CourseProgramme c3 = new CourseProgramme("Maths", startDate, endDate);
        
        //Add courses to courses array list
        courses.add(c1);
        courses.add(c2);
        courses.add(c3);
      
       
        //Add students to modules
        //Add Conor & Eoin to CT modules
        m1.addStudents(s1);
        m1.addStudents(s5);   
        m2.addStudents(s1);
        m2.addStudents(s5); 
        
        //Add Sean and Kelan to Mechanical Engineering modules
        m3.addStudents(s2);
        m3.addStudents(s3);
        
        //Add Ronan to the Maths course
        m4.addStudents(s4);
        m5.addStudents(s4);      
        
        //Adding CT400, CT401 & CT402 to Computer Science course
        c1.addModule(m1);
        c1.addModule(m2);
        c1.addModule(m3);
        
        //Adding CT402 to Mechanical Engineering course
        c2.addModule(m3);
        
        //Adding CT403 & CT404 to Maths course
        c3.addModule(m4);
        c3.addModule(m5);    
        
        //Adding Conor and Eoin to Computer Science course
        s1.addCourse(c1);
        s5.addCourse(c1);
        
        //Adding Sean and Kelan to the ME course
        s2.addCourse(c2);
        s3.addCourse(c2);
        
        //Adding Ronan to Maths course
        s4.addCourse(c3);
       
        //Print out student info
         System.out.println("----------------------------------");
         System.out.println("Students");
         System.out.println("----------------------------------");
        for (Student student : students) {
        	System.out.println(student.ToString());
        }
        
        System.out.println("----------------------------------");
        System.out.println("Modules");
        System.out.println("----------------------------------");
        for (Module module : modules) {
        	System.out.println(module.toString());
        }
        
        System.out.println("----------------------------------");
        System.out.println("Courses");
        System.out.println("----------------------------------");
        for (CourseProgramme course : courses) {
        	System.out.println(course.ToString());
        }
       
       }
}