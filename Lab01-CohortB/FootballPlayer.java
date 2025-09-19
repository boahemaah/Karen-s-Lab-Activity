//Task 1
import java.util.Scanner;
public class FootballPlayer{
    public static void main(String[] args){
        String name;
        int age;
        double height;
        double weight;
        int jerseynumber;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your name:");
        name=input.nextLine();
        System.out.print("Enter your age:");
        age=input.nextInt();
        System.out.print("Enter your weight:");
        weight=input.nextDouble();
        System.out.print("Enter your height:");
        height=input.nextDouble();
        System.out.print("Enter your jerseynumber:");
        jerseynumber=input.nextInt();
        System.out.print("Player name- "+ name);
        System.out.print("Age- "+ age);
        System.out.print("Height- "+height+"m");
        System.out.print("Weight- "+weight+"lbs");
        System.out.print("Jersey Number- "+jerseynumber)

    }
}

//Task 2
