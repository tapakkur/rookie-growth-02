package com.tapakkur.practice.t006_日期类;

import java.util.Scanner;

/**
 * @author tapakkur
 * @ProjectName javacodepractice
 * @Date 2019/3/16 17:48
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int days[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        int count = in.nextInt(); // 次数
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < count; i++){
            int y = in.nextInt(); // year
            int m = in.nextInt(); // month
            int d = in.nextInt(); // day

            // 不跨年，仅跨月
            if (d == days[m-1] && m != 12){
                d = 1;
                m += 1;
            } else if (d == days[m-1] && m == 12){ // 跨年，月进1
                y += 1;
                m = 1;
                d = 1;
            } else {
                d += 1;
            }

            // 是否补全0
            if (m < 10){
                sb.append(y + "-0" + m);
            } else {
                sb.append(y + "-" + m);
            }

            if (d < 10){
                sb.append("-0" + d);
            } else {
                sb.append("-" + d);
            }

            sb.append(" "); // 作为分割标记
        }

        String time = sb.toString();
        String result[] = time.split(" ");

        for (int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }

    }
}
