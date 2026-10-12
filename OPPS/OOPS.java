class Students{
    String name;
    int age;

public void printInfo(){
    System.out.println(this.name);
    System.out.println(this.age);
}
}

public class OOPS{
    public static void main(String[] args) {
        Students s1=new Students();
    Students s2=new Students();
    s1.name="Ayush";
    s1.age=20;
    s1.printInfo();
    
    s2.name="Ayushi";
    s2.age=20;
    s2.printInfo();
        
    }
    


}