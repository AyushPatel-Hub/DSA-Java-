public class permutation{
    public static void Permm(String str, String Prmm){
        if(str.length()==0){
            System.out.println(Prmm);
            return;
        }
        for(int i=0;i<str.length();i++){
            char current=str.charAt(i);
            String newstring=str.substring(0,i)+str.substring(i+1);
            Permm(newstring, Prmm+current);
        }
        }
        public static void main(String[] args) {
            String str="ABC";
            Permm(str, "");
        }

    }
