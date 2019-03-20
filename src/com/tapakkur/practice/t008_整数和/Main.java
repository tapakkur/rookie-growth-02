package com.tapakkur.practice.t008_整数和;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author tapakkur
 * @ProjectName javacodepractice
 * @Date 2019/3/17 15:41
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        while (m > 0){
            int N = Integer.parseInt(br.readLine());
            int sum = 0;
            if (N < 0){
                for (int i = 2*N; i <= N; i++){
                    sum += i;
                }
            } else {
                for (int i = N; i <= 2*N; i++){
                    sum += i;
                }
            }
            System.out.println(sum);
            m--;
        }
    }
}
