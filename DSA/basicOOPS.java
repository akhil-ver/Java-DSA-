package OOPS;
//import java.util.*;
class Student{
    private String name; // instance variable
    private int age;
    private int rollNo;
    private String college;

    Student(){
        this.name ="Akhil";
        this.age = 21;
        this.rollNo = 49;
        this.college ="VIT";
    }
    Student(String name , int age , int rollNo , String college){
        this.name = name;
        this.age=age;
        this.rollNo=rollNo;
        this.college=college;
    }
    void setValue(String name , int age , int rollNo , String college){
        this.name = name;
        this.age=age;
        this.rollNo=rollNo;
        this.college=college;
    }

    void print(){
        System.out.println("Details of Student : ");
        System.out.println("Name : "+name +", Age : "+age+", Roll Number : "+rollNo+", College : "+college);
    }

}
public class basicOOPS {
    public static void main(String[]args){
        //Scanner sc = new Scanner(System.in);
    // int x = 4; // local variable -> no default values assign if no alue user assign and print than compile time find error but instances variable assign default value 
        Student s1 = new Student();
        s1.print();
        s1.setValue("Harsh", 22, 31, "Vellore");
        s1.print();
      
    }
}



/*
-> Why oops
Need a lot of independent variable to represent ine student
if i pass the student to a function i need to pass all 4 variables
I need to create new set of variables for new Student
No authority over data




*/