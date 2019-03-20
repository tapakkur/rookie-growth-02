package com.tapakkur.practice.t007_学生;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * @author tapakkur
 * @ProjectName javacodepractice
 * @Date 2019/3/17 8:44
 */

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());

        Map<Integer, String> map = new HashMap();
        for (int j = 1; j <= n; j++) {
            int m = Integer.valueOf(br.readLine());
            for (int i = 1; i <= m; i++) {
                String word = br.readLine();
                map.put(i, word);
            }
            int num = Integer.valueOf(br.readLine());
            System.out.println(map.get(num));
        }

    }

}