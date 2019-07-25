/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author PATRICK
 */
import java.util.Scanner;
public class Employee {
    int age;
    String name , address , gender;
    Scanner get= new Scanner(System.in);
    
    Employee(){
    System.out.println("Enter Name of the Employee");
    name = get.nextLine();
    System.out.println("Enter gender of the Employee");
    gender = get.nextLine();
    System.out.println("Enter address of the Employee");
    address = get.nextLine();
    System.out.println("Enter age of the Employee");
    age= get.nextInt();
    
    }
    void display(){
    System.out.println("Enployee Name: " +name);
    System.out.println("Age: " +age);
    System.out.println("Gender " +gender);
    System.out.println("Address " +address);
    
    }
}
class FullTimeEmployees extends Employee{
float salary;
int desig;
//constructor
FullTimeEmployees(){
System.out.println("Enter Designation:");
desig= get.nextInt();
System.out.println("Enter salary");
salary =get.nextFloat();

}
@Override
void display()
{
System.out.println("====================="+"\n"+"Full Time employee Data"+"\n"+"===="+"\n");
super.display();
System.out.println("Salary :"+salary);
System.out.println("Designation:" +desig);
}
}
class PartTimeEmployees extends Employee{
    int  workinghrs , rate;
    PartTimeEmployees(){
        System.out.println("Enter the numbeer of working hours:");
        workinghrs= get.nextInt();
    }
        void calculatePay(){
            rate= 8*workinghrs;
    }
    @Override
      void display(){
          System.out.println("====================="+"\n"+"Part Time employee Data"+"\n"+"===="+"\n");
          super.display();
          System.out.println("Working Hours:" +workinghrs);
          System.out.println("Salary for " +workinghrs+  " working hours is :$" +rate);
      }
      
    }

  
    

        

