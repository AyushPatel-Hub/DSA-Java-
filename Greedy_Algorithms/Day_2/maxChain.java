package Greedy_Algorithms.Day_2;

import java.util.Arrays;
import java.util.Comparator;

public class maxChain {
    public static void main(String[] args) {
        int chain[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};

        Arrays.sort(chain,Comparator.comparingDouble(o->o[1]));
    int end=chain[0][1];
    int count=1;
    for(int i=1;i<chain.length;i++){
        if(chain[i][0]>end){
            count++;
            end=chain[i][1];
        }
    }
    System.out.println(count);
    }
}
