import java.util.Scanner;
public class swap{
    int score1;
    int score2;
    public void swapPlayerScore(int player1,int player2){
        int var=player1; // temporary variable to store values
        player1 = player2;
        player2 = var;
        System.out.println("After swapping:\n Score of player 1=" + player1 +"\nScore of player 2 = "+ player2);
    }
    public static void main(String[] args){
    System.out.println("Fariah Hajra");
    System.out.println("Task 03:Swapping of Players Scores");
    swap obj=new swap();
    Scanner sc=new Scanner(System.in);
    System.out.println("enter  score1="); // input from user
    obj.score1=sc.nextInt();
    
     System.out.println("enter  score2=");
     obj.score2=sc.nextInt();
    System.out.println("Before swapping: \nScore of player 1="+obj.score1+"\nScore of player 2="+obj.score2);
    obj.swapPlayerScore(obj.score1,obj.score2);
}
}