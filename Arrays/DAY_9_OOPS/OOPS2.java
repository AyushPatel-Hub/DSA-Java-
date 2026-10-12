package DAY_9_OOPS;

public class OOPS2 {
    public static void main(String[] args) {
        Student s1= new Student("Ayush"); // here Student() is a constructor
        System.out.println(s1.Name);
        s1.age=123;
        s1.password="AHSJS";
        Student s2= new Student(s1);
        s2.password="AJSJSJSNSN";
        System.out.println(s2.password);
        System.out.println(s2.Name);

        
    }
}

class Student{
    String Name;
    int age;
    String password;

    Student(Student s1){   // this is copy constructor
        this.Name=s1.Name;
        this.age=s1.age;
    }

    Student(String Name){
        this.Name=Name;
    }
}
