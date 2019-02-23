import java.util.*;
import java.util.HashMap;
import java.util.ArrayList;
import java.text.DecimalFormat;
import java.util.Arrays;
class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        Double[] score = new Double[n];
        Map<Integer, Double> hm1 = new HashMap<>();
        Map<Integer, Double> hm2 = new HashMap<>();
        Percentage p  = new Percentage();

        for (int i=0;i<n ;i++) {
            String[] s = sc.nextLine().split(",");
            hm1.put(Integer.parseInt(s[0]),Double.parseDouble(s[1]));
            score[i]=Double.parseDouble(s[1]);
        }
        System.out.println(hm1);
        int m = sc.nextInt();
        int[] answer1 = new int[m];
        Double percent=0.0;
        for (int i=0;i<m ;i++ ) {
            answer1[i] = sc.nextInt();
            System.out.println(answer1[i]);
        }
        for (Integer key : hm1.keySet()) {
            percent = p.Percentage(hm1.get(key),n,score);
            hm2.put(key,percent);

        }
        System.out.println(hm2.toString());

        for (Integer inte :answer1 ) {
            Double answer =hm2.get(inte);
            answer = answer*100.0/100.0;
            if (answer == 100.0) {
                System.out.println(answer);
            } else {
                String numberAsString = String.format ("%.2f", answer);
                System.out.println(numberAsString);
            }
        }
    }


}
class Percentage{
    Percentage(){
        
    }
        Double Percentage(Double v,int count1,Double[] arr){
            Double answer=0.0;
            int count=0;

            for (int i=0;i<arr.length ;i++ ) {
                if(arr[i]<=v){
                    count++;
                }
            }

            answer = (100 * count)/Double.valueOf(count1);

            return answer;
        }
}