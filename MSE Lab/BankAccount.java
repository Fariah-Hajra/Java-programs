import java.util.Scanner;

class emp{
    //incapsulation for data hiding
    String name;
    private int accNum;
    private double balance;
    //get and set method
    void getaccNum(int accNum){
        this.accNum = accNum;
    }
    int setaccNum(){
        return accNum;
    }
    
    void setBal(double balance){
        this.balance = balance;
    }
    double getBal(){
        return balance;
    }
    
    void depos(double depositAmount){
        if (depositAmount >  0){
            balance += depositAmount;
        }
        else{
            System.err.println("Error:Deposit can not be less than 0");
        }
        
    }
    
    private double calculateInterest(int age){
        double interest;
        if(age > 60){
            interest = balance * 0.4;//50% balance
        }
        else{
            interest = balance * 0.10;//10% increase in interest
        }
        return interest;
    } 
    
    void applyInterest(int age){//current balance
        //retrieving private method by calling in same class get/set method is not needed
        balance += calculateInterest(age);
    }
    
    emp(String name,int accNum, double balance){
        this.name =  name;
        this.accNum = accNum;
        this.balance = balance;
    }
    void showInfo(){
        System.out.println("-------Displaying Account Information---------");
        System.out.println("Bank Account Holder Name: "+name);
        System.out.println("Bank account number: "+accNum);
        System.out.println("Balance: "+balance);
    }
}

public class BankAccount{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Task 02:");
        System.out.print("Enter  Name: ");
        String name = s.nextLine(); //calling String class to store string input
        System.out.print("Enter account Number: ");
        int accNum = s.nextInt();
        System.out.print("Enter age: ");
        int age = s.nextInt();
        System.out.print("Enter balance: ");
        double balance = s.nextDouble();
        System.out.print("Enter deposit: ");
        double deposit = s.nextDouble();
        
        emp e = new emp(name, accNum, balance);
        e.showInfo();
        
        System.out.println("\nAfter applying deposit:");
        e.depos(deposit);
        e.showInfo();
        
        System.out.println("\nAfter applying interest:");
        System.out.println("If age is greater than 60, 40% increase in interest other wise 10% of balance increases");
        e.applyInterest(age);
        e.showInfo();
    }
}