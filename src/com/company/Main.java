package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double sum=0;
        for(int i=1;i<=9;i++){
            int x=i+1;
            for(int j=1;j<=9;j++){
                sum=sum+(double)j/(double)x;
                x++;
            }
        }
        System.out.println(sum);
    }
}
