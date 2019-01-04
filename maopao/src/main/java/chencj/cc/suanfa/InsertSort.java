package chencj.cc.suanfa;

import java.util.Arrays;

/**
 * @author CHENCJ
 * @create 2019-01-04-9:43-2019/1/4-
 * suanfa
 */
public class InsertSort {

    /**
     * 直接插入排序算法机制：
     *  在左边的默认已经排好序，下一个，与前面遍历比较
     *  小于交换位置，大于停止遍历
     * @param arr
     */
    public static  void insrtSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int a = arr[i];
            int j = i-1;
//            for (j = i-1; j >=0 && arr[j]>a; j--) {
//                //说明下一个值大于前面的，进行交换
//
//                arr[j+1]=arr[j];
//
//            }
            while(j>=0&&a<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=a;
            System.out.println("第"+i+"轮的直接插入排序展示："+ Arrays.toString(arr));
        }
    }
}
