package com.tapakkur.practice.t005_三角形相加;

import java.util.Scanner;

/**
 * @author tapakkur
 * @ProjectName javacodepractice
 * @Date 2019/3/15 21:28
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = 0, y = 0;
        while (in.nextInt() != 0){
            x += in.nextInt();
            y += in.nextInt();
        }
        System.out.println("A(0," + x +"),B(0,0),C(" + y + ",0");
    }
}
