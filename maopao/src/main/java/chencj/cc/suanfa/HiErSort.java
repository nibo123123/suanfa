package chencj.cc.suanfa;

import java.util.Arrays;

/**
 * @author CHENCJ
 * @create 2019-01-04-15:33-2019/1/4-
 * suanfa
 */
public class HiErSort {
    /**
     * 希尔排序的机制：
     * 以arr.length/2得到步长，进行分组，把分组后的进行插入排序
     * @param arr
     */
    public static void hierSort(int[] arr){
        int len = arr.length;
        int d = len/2;
        for (int i = d; i >= 1; i/=2) {//步长 len/2  len/4  .... 1
            for (int j = i; j < len; j++) {//分组
                int a = arr[j];
                int k;
                for (k = j-i; k >= 0&&arr[k]>a ; k -= i) {
                    arr[k+i] = arr[k];
                }
                arr[k+i] = a;
                System.out.println("第"+j+"轮的xire排序展示："+ Arrays.toString(arr));
            }

        }
    }
}
