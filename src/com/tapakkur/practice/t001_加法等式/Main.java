package com.tapakkur.practice.t001_加法等式;

/**
 * @author tapakkur
 * @ProjectName javacodepractice
 * @Date 2019/3/15 15:54
 */
public class Main {
    public static void main(String[] args) {
        for (int a = 0; a < 10; a++){
            for (int b = 0; b < 10; b++){
                for (int c = 0; c < 10; c++){
                    if (a*100 + b*10 + c + b*100 + c*10 + c == 532) {
                        System.out.println(a + " " + b + " " + c);
                    }
                }
            }
        }
    }
}
