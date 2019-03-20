package com.tapakkur.practice.t004_对称平方数;

/**
 * @author tapakkur
 * @ProjectName javacodepractice
 * @Date 2019/3/15 18:35
 */
public class Main {
    public static void main(String[] args) {
        for (int n = 1; n < 256; n++){
            int product = n*n;
            if (isSymmetrical(product)){
                System.out.println(n);
            }
        }
    }

    // 方法1：巧妙运用对称数的特征：数字正序和反序，结果还是一样的，延伸出的结论是-->字符串反正，结果内容相同
    public static boolean isSymmetrical(int number)
    {
        String s = String.valueOf(number);
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return sb.toString().equals(s);
    }

    /**
     * 方法2： 相对比较麻烦，但是重要的实现方式
     * 思路：n < 256 ,那么n*n的最大值是65636，最大位是万位，
     * 因此分理处个，十，百，千，万等位的数字
     * 备注：这个方法还存在点问题，推荐方法1
     */


    public static void isSymmetrical2(int number){
        int product = number*number;
        int gw,sw,bw,qw,ww; // 个，十，百，千，万等位
        if (product < 10){
            System.out.println(number);
        }
        if (product < 100){
            gw = product % 10;
            sw = product / 10;
            if (gw == sw){
                System.out.println(number);
            }
        }
        if (product < 1000){
            gw = product % 10;
            sw = product % 100 / 10;
            bw = product / 100;
            if (gw == bw){
                System.out.println(number);
            }
        }
        if (product < 10000){
            gw = product % 10;
            sw = product % 100 / 10;
            bw = product % 1000 / 100;
            qw = product / 1000;
            if (gw == qw && sw == bw){
                System.out.println(number);
            }
        }
        if (product < 100000){
            gw = product % 10;
            sw = product % 100 / 10;
            bw = product % 1000 / 100;
            qw = product % 10000 / 1000;
            ww = product / 10000;
            if (gw == ww || sw == qw){
                System.out.println(number);
            }
        }
    }
}
