package com.tapakkur.practice.t003_直角三角形;

import java.util.Scanner;

/**
 * @author tapakkur
 * @ProjectName javacodepractice
 * @Date 2019/3/15 16:49
 */
public class CTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        while (count > 0){
            int x1 = in.nextInt();
            int y1 = in.nextInt();

            int x2 = in.nextInt();
            int y2 = in.nextInt();

            int x3 = in.nextInt();
            int y3 = in.nextInt();

            double a = len(x1,y1,x2,y2);
            double b = len(x1,y1,x3,y3);
            double c = len(x2,y2,x3,y3);

            if (isTrianle(a,b,c)){
                double result = a + b + c;
                if (isRight(a,b,c)){
                    System.out.println("Yes");
                    System.out.printf("%.2f\n", result); // 注意格式化输出
                } else {
                    System.out.println("No");
                    System.out.printf("%.2f\n", result); // 注意格式化输出
                }
            }
            count--;
        }
    }

    public static double len(int x1,int y1, int x2, int y2){
        double len = Math.sqrt((x1 - x2)*(x1 - x2) + (y1 - y2)*(y1 - y2))* 1.0;
        return len;
    }

    public static boolean isTrianle(double a, double b, double c){
        if ((a+b > c) || (a+c > b) || (b+c > a)){
            return true;
        }
        return false;
    }

    public static boolean isRight(double a, double b, double c){
        if ((a*a + b*b == c*c) || (a*a + c*c ==b*b) || (b*b + c*c == a*a)){
            return true;
        }
        return false;
    }
}
