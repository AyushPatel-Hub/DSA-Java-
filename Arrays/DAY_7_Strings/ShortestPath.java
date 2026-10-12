package DAY_7_Strings;

public class ShortestPath {
    public static float shortestPathDirection(String str){
        if(str.length()==0){
            return 0;
        }
        int x=0;
        int y=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='N'){
                y+=1;
            } else if(str.charAt(i)=='S'){
                y-=1;
            }else if(str.charAt(i)=='E'){
                x+=1;
            }else{
                x-=1;
            }
            
        }
        int distance=(x*x)+(y*y);
        return (float) Math.sqrt(distance);
        
    }
    public static void main(String[] args) {
        String str="NNNWWWEEEESSSS";
        
        System.out.println(shortestPathDirection(str));
    }
}
