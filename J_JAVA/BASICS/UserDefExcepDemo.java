
import java.util.Scanner;

class IllegalMarksException extends Exception
{
    public String toString()
    {
        return "invalid marks";
    }

}
class Student
{
    int regno,m1,m2,m3,total;
    String name;

    Student()
    {
        regno=m1=m2=m3=total=0;
        name="";
    }

    void getmarks()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter student name");
        name=sc.next();
        System.out.println("Enter marks m1,m2 m3");
        m1=input();
        m2=input();
        m3=input();
        total=m1+m2+m3;
        System.out.println("mrks are "+m1+" "+m2+" "+m3);
        System.out.println("total is "+total);

    }
    private int input()
    {
        Scanner sc=new Scanner(System.in);
        try{
            int mrk=sc.nextInt();
            if(mrk<0)
            {
                throw new IllegalMarksException();
            }
            return mrk;
        }
        catch(IllegalMarksException e)
        { 
            System.out.println(e);
            System.out.println("enter again");
            return this.input();
        }
    }
}
class UserDefExcepDemo {
    public static void main(String[] args) {
        Student S1 = new Student();
            S1.getmarks();
    }
}