import java.io.*;
import java.util.*;

class Data {
   int Roll, Age;
   String Name;

   public void SetRoll(int roll) {
       this.Roll = roll;
   }

   public int GetRoll() {
       return this.Roll;
   }

   public String toString2() {
       return "" + Roll;
   }

   public void SetAge(int age) {
       this.Age = age;
   }

   public int GetAge() {
       return this.Age;
   }

   public String toString3() {
       return "" + Age;
   }

   public void SetName(String name) {
       this.Name = name;
   }

   public String GetName() {
       return this.Name;
   }

   public String toString() {
       return "" + Name;
   }
}

class Vectors {
   Vector<Data> list = new Vector<Data>();

   public void add() {
       Data data = new Data();
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Name: ");
       data.SetName(sc.next());
       System.out.print("Enter Roll Number: ");
       data.SetRoll(sc.nextInt());
       System.out.print("Enter Age: ");
       data.SetAge(sc.nextInt());
       list.addElement(data);
   }

   public void view() {
       System.out.println("`````````````DISPLAY`````````````");
       for (int i = 0; i < list.size(); i++) {
           System.out.println("Student " + (i + 1));
           System.out.println("Name : " + list.get(i).toString());
           System.out.println("Roll Number : " + list.get(i).toString2());
           System.out.println("Age : " + list.get(i).toString3());
       }
       System.out.println("`````````````````````````````````");
   }
}

class VectorExample {
   public static void main(String[] args) {
       int ch;
       Scanner sc = new Scanner(System.in);
       Vectors st = new Vectors();
       System.out.println("`````````````WELCOME`````````````");
       System.out.println("1: Add a Student");
       System.out.println("2: Display and Exit");
       do {
           System.out.println("`````````````````````````````````");
           System.out.println("Enter choice : ");
           ch = sc.nextInt();
           switch (ch) {
               case 1:
                   st.add();
                   break;
               case 2:
                   st.view();
                   break;
               default:
                   System.out.println("Enter a valid choice ");
                   break;
           }
       } while (ch != 2);
   }
}
