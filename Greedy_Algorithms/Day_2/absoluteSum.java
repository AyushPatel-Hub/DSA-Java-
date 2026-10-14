
import java.util.Arrays;


public class absoluteSum {
    public static void main(String args[]){
        int A[]={4,1,8,7};
        int B[]={2,3,6,5};
        Arrays.sort(A);
        Arrays.sort(B);
        int i=0,j=0,sum=0;
        while(i<A.length &&  j<B.length){
            sum+=Math.abs(A[i]-B[j]);
            i++;
            j++;
        }
        System.out.println(sum);
    }
}
