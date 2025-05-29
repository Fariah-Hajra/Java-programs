import java.util.Scanner;
class Student {
    int stdId;
    String stdName;
    // Default constructor is made hen no constructor is initiallized
    Student(){

    }
    
    // Parameterized constructor
    public Student(int id, String name) {
        this.stdId = id;
        this.stdName = name;
    }

    // Copy constructor
    public Student(Student std1) {
        this.stdId = std1.stdId;
        this.stdName = std1.stdName;
    }
}

public class StudentInfo {
        public static void main(String[] args) {            
        Scanner inpt = new Scanner(System.in);
        System.out.println("Enter Stdent ID: " );
        int id = inpt.nextInt();   
        System.out.println("Enter Name: " );
       String name = inpt.nextLine();
        // Create Student objects
        Student obj1 = new Student();  //for default constructor when no constor is initialized
        Student obj2 = new Student(id, name);
        Student obj3 = new Student(obj2);
        
        // Print details of Student 01
         System.out.println("Details of Default Student 01:");
         display(obj1);
       
        //Print details of Student 02
        System.out.println("Details of Student 02:");
        display(obj2);

        //Print details of Student 03
        System.out.println("Details of Student 03(copy costructor):");
        display(obj3);
        
    }
    static void display(Student object){
        System.out.println("Name: " + object.stdName);
        System.out.println("Student ID: " + object.stdId);
    }
}
