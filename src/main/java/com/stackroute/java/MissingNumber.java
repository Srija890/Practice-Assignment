package com.stackroute.java;

public class MissingNumber {
    public  static  void main(String[]args){
        int total;
        int[] numbers =new  int[]{1,2,3,4,5,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51};
        total=51;
        int expected_num=total*((total+1)/2);
        int num_sum=0;
        for (int i: numbers){
            num_sum+=i;
        }
        System.out.println(expected_num-num_sum);

    }
}
