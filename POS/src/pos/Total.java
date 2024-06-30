package pos;

import java.util.Scanner;

public class Total {

    public static void main(String[] args) {
        // auto generate method
        // 0 1 1 2 3 5 8 ...
        // num 1 = 0
        // num 2 = 1
        // num 3 = 1
        // nextNum= num1+ num2



        int num1= 1;


        int num2=0;
        int nextNum;
        int lengthOfSeries;
        System.out.println("Enter length of the series");

        Scanner scan = new Scanner(System.in);
        lengthOfSeries=scan.nextInt();
        scan.close();

        for (int i=0; i<lengthOfSeries;i++){
            System.out.println(num1);
            nextNum= num1+num2;
            num1=num2;
            num2=nextNum;
        }
    }


}
