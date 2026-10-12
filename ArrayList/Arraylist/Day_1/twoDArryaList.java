package Day_1;

import java.util.ArrayList;

public class twoDArryaList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();
        ArrayList<Integer> listOf1=new ArrayList<>();
        ArrayList<Integer> listOf2=new ArrayList<>();
        ArrayList<Integer> listOf3=new ArrayList<>();
        listOf1.add(1);
        listOf1.add(2);
        listOf1.add(3);
        listOf1.add(4);
        listOf1.add(5);


        listOf2.add(2);
        listOf2.add(4);
        listOf2.add(6);
        listOf2.add(8);
        listOf2.add(10);


        listOf3.add(3);
        listOf3.add(6);
        listOf3.add(9);
        listOf3.add(12);
        listOf3.add(15);
        mainList.add(listOf1);
        mainList.add(listOf2);
        mainList.add(listOf3);
        System.out.println(mainList);
        for(int i=0;i<mainList.size();i++){
            ArrayList<Integer> currList= mainList.get(i);
            for(int j=0;j<currList.size();j++){
                System.out.print(currList.get(j)+ " ");
            }
            System.out.println();
        }
    }
}
