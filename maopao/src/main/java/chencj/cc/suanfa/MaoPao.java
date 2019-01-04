package chencj.cc.suanfa;

import java.util.Arrays;

/**
 * @author CHENCJ
 * @create 2019-01-04-9:02-2019/1/4-
 * suanfa
 */
public class MaoPao {

    /**
     * 算法机制 ：分成arr。length-1轮
     * 每次比较arr.length-1-论数，相邻两者比较，大的放在后面后面已经排序
     * @param arr
     */
    public static void maopao(int[] arr){
        long startTime = System.currentTimeMillis();
        System.out.println(startTime);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println("第"+i+"轮的冒泡排序展示："+Arrays.toString(arr));
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime);
    }
}
