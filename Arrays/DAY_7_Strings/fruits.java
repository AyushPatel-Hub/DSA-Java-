package DAY_7_Strings;
public class fruits {
    public static void main(String[] args) {
        String fruits[]={"Apple","banana","mango"};
    String largest=fruits[0];
    for(int i=1;i<fruits.length;i++){
        if(largest.compareTo(fruits[i])<0){
            largest=fruits[i];
            
        }
    }
    System.err.println(largest);
    }

}
