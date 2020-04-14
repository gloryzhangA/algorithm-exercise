package com.zy.algorithm.leetcode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class a001twoSum {

    public static void main(String[] args){
        int[] nums = {3,2,4};
        int target = 6;
        new a001twoSum().twoSum(nums, target);
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(i, nums[i]);
        }
        Iterator<Integer> iterator = map.keySet().iterator();
        while(iterator.hasNext()){
            int key = iterator.next();
            if(map.containsValue(target - map.get(key))){
                int number2Key = returnNumber(key, target - map.get(key), map);
                int[] returnNums = {key, number2Key};
                if(number2Key!=-1){
                    return returnNums;
                }
            }
        }
        return null;
    }

    public int returnNumber(int number1Key, int number2Value,Map<Integer, Integer> map){
        Iterator<Integer> iterator = map.keySet().iterator();
        while(iterator.hasNext()){
            int key = iterator.next();
            if(number2Value == map.get(key) && key != number1Key){
                return key;
            }
        }
        return -1;
    }
}
