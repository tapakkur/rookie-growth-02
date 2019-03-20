package com.tapakkur.practice.t002_反序相等;

/**
 * @author tapakkur
 * @ProjectName javacodepractice
 * @Date 2019/3/15 16:24
 */
public class Main {
    public static void main(String[] args) {
        for (int a = 1; a < 10; a++){
            for (int b = 0; b < 10; b++){
                for (int c = 0; c < 10; c++){
                    for (int d = 0; d < 10; d++){
                        int N = 1000*a + 100*b + 10*c + d;
                        int M = 1000*d + 100*c + 10*b + a;
                        if (N*9 == M){
                            System.out.println(N);
                        }
                    }
                }
            }
        }
    }
}
