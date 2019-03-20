package com.tapakkur.practice.t011_完数和盈数;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tapakkur
 * @ProjectName javacodepractice
 * @Date 2019/3/19 15:58
 * 一个数如果恰好等于它的各因子（该数本身除外）子和，
 * 如：6=3+2+1，则称其为“完数”；若因子之和大于该数，则称其为“盈数”。
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> wanshu = new ArrayList<>();
        List<Integer> yingshu = new ArrayList<>();
        for (int i = 2; i <= 60; i++){
            int sum = 0;
            for (int j = 1; j < i; j++){
                if (i % j == 0){
                    sum += j;
                }
            }
            if (i == sum){
                wanshu.add(i);
            }
            else if (i < sum){
                yingshu.add(i);
            }
        }
        System.out.print("E:");
        for (Integer param : wanshu){
            System.out.print(" " + param);
        }
        System.out.print(" G: 2");
        for (Integer param : yingshu){
            System.out.print(" " + param);
        }
    }
}
