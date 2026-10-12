import java.util.Scanner;

public class string2 {
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
            String sentence=sc.nextLine();
            String result="";
            //code to replace "e" with "i"
            for(int i=0;i<sentence.length();i++){
                if(sentence.charAt(i)=='e'){
                    result += 'i';
                } else{
                    result += sentence.charAt(i);
                }
                
            }
            System.out.println(result);
        

    }
}
