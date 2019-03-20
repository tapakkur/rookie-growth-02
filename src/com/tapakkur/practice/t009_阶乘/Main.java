package com.tapakkur.practice.t009_阶乘;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author tapakkur
 * @ProjectName javacodepractice
 * @Date 2019/3/17 17:38
 */
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        for (int i = 1; i <= m; i++){
            int n = Integer.parseInt(br.readLine());
            long result = 1;
            for (int k = 1; k <= n; k++){
                result *= k;
            }
            System.out.println(result);
        }
    }
}
