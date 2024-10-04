package activity_labanonnable;

import static activity_labanonnable.Activity_LabanonNable.name;
import static activity_labanonnable.Activity_LabanonNable.age;
import static activity_labanonnable.Activity_LabanonNable.grade;
import java.util.Scanner;

public class StudentInformation {
    
    Scanner sc = new Scanner(System.in);
    
    public void name(String names){
        System.out.print("Enter Name: ");
            names = name;
            name = sc.nextLine();     
    }
    public void age(int ages){
        System.out.print("Enter age: ");
        ages = age;
        age = sc.nextInt();
    }
    public void grade(int grades){
        System.out.print("Enter Grade Level: ");
        grades = grade;
        grade = sc.nextInt();
    }
}
