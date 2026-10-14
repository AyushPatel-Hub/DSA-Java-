package Greedy_Algorithms.Day_2;

import java.util.ArrayList;
import java.util.Collections;

public class jobSequencing {

    public static class job{
        int deadline;
        int profit;
        int id;
        public job(int d,int p,int i){
             id=i;
             deadline=d;
             profit=p;
        }
    }
    public static void main(String[] args) {
        int jobInfo[][]={{4,20},{1,10},{1,40},{1,30}};
        ArrayList<job> jobs=new ArrayList<>();
        for(int i=0;i<jobInfo.length;i++){
            jobs.add(new job(i,jobInfo[i][0],jobInfo[i][1])); 
        }
        Collections.sort(jobs, (a,b)->b.profit-a.profit); // this sort the object based on the profit in descending order
         ArrayList<Integer> seq=new ArrayList<>();
         int time=0;
         for(int i=0;i<jobs.size();i++){
            job curr=jobs.get(i);
            if(curr.deadline>time){
                seq.add(curr.id);
                time++; 
            }
         }
         System.out.println(seq.size());
    }
}
