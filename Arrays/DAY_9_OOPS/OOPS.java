package DAY_9_OOPS;

public class OOPS{
    public static void main(String[] args) {
        Pen p1 = new Pen(); // object is created of class Pen
        p1.changeColor("BLUE");
        System.out.println(p1.getColor());

        BankAccount myAcc= new BankAccount();
        // myAcc.password="hello"; not visible because it is private 
    }



    
     
}

//class can be made outside the main class
class BankAccount{
        public String username;
        private String password;
    }
    
    class Pen{
        private String color;
        private int tip;
        public String getColor(){ // getters
            return this.color;
        }
        public int getTip(){
            return this.tip;
        }

        void changeColor(String newColor){ // setters
            color=newColor;
        }
        void changeTip(int newTip){
            tip=newTip;
        }
    }