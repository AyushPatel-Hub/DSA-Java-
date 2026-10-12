public class movex {
    public static void Movexx(String str,int idx, int count,String newstring){
        if(idx==str.length()){
            for(int i=0;i<count;i++){
                newstring+= 'x';
            }
            System.out.println(newstring);
            return;
        }
        char current=str.charAt(idx);
        if(current=='x'){
            count++;
            Movexx(str, idx+1, count, newstring);
        } else{
            newstring+= current;
            Movexx(str, idx+1, count, newstring);
        }

    }
    public static void main(String[] args) {
        String str="axbxxcd";
        Movexx(str, 0, 0, "");
    }
}
