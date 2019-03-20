package com.tapakkur.practice.t012_单词识别;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author tapakkur
 * @ProjectName javacodepractice
 * @Date 2019/3/19 16:58
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String array[] = str.toLowerCase().trim().split("[,.\\s]"); // 拆分
        Arrays.sort(array); // 对新数组排序
        ArrayList<String> list = new ArrayList<>();
        for (String s : array){
            if (s.equals("")) continue;
            list.add(s);
        }
        int count = 1; // 由于单词都分离出来了，因此默认个数为1
        for (int i = 1; i < list.size(); i++){
            if (list.get(i-1).equals(list.get(i))){
                list.remove(i); // 为了避免再次出现导致重复计入，因此删除了
                count++;
                i--; // 当前第i元素被删后，第i+1元素代替第i元素，因此要让i++复原，不然会跳过一条元素
            } else {
                System.out.println(list.get(i-1) + ":" + count);
                count = 1;
            }
        }
        System.out.println(list.get(list.size()-1) + ":" + count);
    }
}
