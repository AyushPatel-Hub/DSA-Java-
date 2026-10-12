class Student{
    String name;
     int age;

    public void getInfo(String name){
        System.out.println(name);
 }
 public void getInfo(int age){
    System.out.println(age);
 }
 public void getInfo(String name,int age){
    System.out.println(name+ " " + age);
 }
}
public class polymorphism {
    public static void main(String[] args) {

        Student S1= new Student();
     S1.name="Ayush";
     S1.age=20;
     S1.getInfo(S1.age);
 
    }
    
}
