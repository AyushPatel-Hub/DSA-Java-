class  Animal{
    String name;
    
}
class Dog extends Animal{
    public void Info(String name){
        System.out.println(name);
    }
}
public class inheritance {
    public static void main(String[] args) {
        Dog d1= new Dog();
        d1.name="Sheru";
        d1.Info(d1.name);
    }
    
}
