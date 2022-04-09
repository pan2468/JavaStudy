package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int count = 4;
        int price = 3;
        int sum = 0;
        int answer = 0;
        int money = 20;
        int[] arr = new int[count];

        for(int i=0; i<=arr.length; i++){
            arr[i] += price;
            sum += arr[i];
            answer = sum - money;
            System.out.println(answer);
        }

    }
}
