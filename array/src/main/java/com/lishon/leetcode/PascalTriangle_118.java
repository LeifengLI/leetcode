package com.lishon.leetcode;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Given numRows, generate the first numRows of Pascal's triangle.

 For example, given numRows = 5,
 Return

 [
 [1],
 [1,1],
 [1,2,1],
 [1,3,3,1],
 [1,4,6,4,1]
 ]
 * @author lishon
 * @create 2018-04-18 11:24
 **/

public class PascalTriangle_118 {

    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> rl = new ArrayList<>();
        if (numRows == 0) return rl;
        List<Integer> l = new ArrayList<>();
        if (numRows == 1) {
            l.add(1);

        }else if (numRows ==2) {
            rl = generate(1);
            l.add(1);
            l.add(1);

        } else {

            l.add(1);
            rl = generate(numRows - 1);
            List<Integer> p = rl.get(rl.size()-1);
            for (int i =1; i< numRows -1;i++) {
                l.add(p.get(i-1)+p.get(i));
            }
            l.add(1);

        }
        rl.add(l);

        return rl;
    }


    public static void main(String[] args){

        List<List<Integer>> generate = generate(5);
        System.out.println(JSON.toJSON(generate));
    }
}
