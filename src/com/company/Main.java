package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào kích thước ma trận axa");
        int size = scanner.nextInt();
        double[][] matrix = new double[size][size];
        for (int i =0;i<size;i++){
            for (int n =0;n<size;n++){
                System.out.println("Nhập từng phần tử "+n+" của mảng "+i);
                matrix[i][n]= scanner.nextDouble();
            }
        }
//        double[][] matrix = {
//                {1,2,3},
//                {0,1,2},
//                {4,2,1}
//        };
        double max;
        int x=0, y=0;
        max = matrix[0][0];
        for (int i=0;i< matrix.length;i++){
            for (int j=0;j<matrix.length;j++){
                if(max<matrix[i][j]){
                    max = matrix[i][j];
                    x = i;
                    y = j;
                }
            }
        }
        System.out.println("Giá trị lớn nhất là: "+max);
        System.out.println("Nằm tại vị trí: x = "+x+" y = "+y);
    }
}
