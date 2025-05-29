import java.util.Scanner;

class emp{
    String name;
    int hoursOfWork;
    double salary;
    emp(String name,int hoursOfWork,double salary){
        this.name =  name;
        this.hoursOfWork = hoursOfWork;
        this.salary = salary;
    }
    void showInfo(){
        System.out.println("\n--------Employee Info-----------");        
        System.out.println("/nEmployee Name: "+name);
        System.out.println("Employee Working  Hours: "+hoursOfWork);
        System.out.println("Employee salary: "+salary);
    }
    void deductFromSalary(double amount){
        amount = salary * 0.05;
        salary -= amount;
    }
    void addToSalary(double amount){
        amount = salary * 0.2;
        salary += amount ;
    }
}

public class EmpManagement{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Task 1:");
        System.out.print("Enter employee Name: ");
        String n = s.nextLine(); //calling String class to store string input
        System.out.print("Enter employee working  hours: ");
        int h = s.nextInt();
        System.out.print("Enter employee salary: ");
        double salary = s.nextDouble();
        emp e = new emp(n, h, salary);
        
        if(h > 8){
            e.addToSalary(salary);
        }
        else if(h < 5){
            e.deductFromSalary(salary);
        }
        else if(h < 0){
            System.err.println("Error: time can't be negative.");
        }
        else{
            System.out.println("Bonus is neither added nor any fine is deducted");
        }
        e.showInfo();
        s.close();
    }
}