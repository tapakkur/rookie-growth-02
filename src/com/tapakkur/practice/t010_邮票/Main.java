package com.tapakkur.practice.t010_邮票;

import java.util.HashSet;
import java.util.Set;

/**
 * @author tapakkur
 * @ProjectName javacodepractice
 * @Date 2019/3/19 15:21
 */
public class Main {
    public static void main(String[] args) {
        int a = 8, b = 10, c = 18;
        Set<Integer> set = new HashSet<>(); // 将相同结果被省略
        for (int i = 0; i <= 5; i++){ // 可能有0个或以上
            for (int j = 0; j <= 4; j++){
                for (int k = 0; k <= 6; k++){
                    set.add(a*i + b*j + c*k);
                }
            }
        }
        System.out.println(set.size() - 1); //省略0的情况，因为题中要求至少是一张
    }
}
