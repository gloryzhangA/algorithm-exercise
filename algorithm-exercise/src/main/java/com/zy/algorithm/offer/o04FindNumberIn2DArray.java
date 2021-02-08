package com.zy.algorithm.offer;

public class o04FindNumberIn2DArray {

    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix.length == 0||matrix[0].length == 0){
            return false;
        }
        int row = 0;
        int column = matrix[0].length - 1;
        while(row<matrix.length && column>=0){
            if(matrix[row][column]==target){
                return true;
            }else if(matrix[row][column]>target){
                column--;
            }else if(matrix[row][column]<target){
                row++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target = 20;
        System.out.println(findNumberIn2DArray(matrix, target));
    }

}
