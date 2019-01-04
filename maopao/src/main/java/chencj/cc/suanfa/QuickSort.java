package chencj.cc.suanfa;

import java.util.Arrays;

/**
 * @author CHENCJ
 * @create 2019-01-04-9:11-2019/1/4-
 * suanfa
 */
public class QuickSort {

    public static  void quickSort(int[] arr){
        quickSort(arr,0,arr.length-1);
    }

    /**   {1,7,3,9,2,5,4}
     *      1是基准，索引low ， high
     *
     * 快排的机制：
     *
     * 1定义一个基准值，取start对应的值，建立两个索引
     * 2从后到前，遍历，小于基准值，放在当前索引，索引--，
     * 3从前往后，遍历，大于基准值，放在上次索引值的位置，索引++
     * @param arr
     * @param start
     * @param end
     */
    private static int conut = 0;
    private static void quickSort(int[] arr,int start,int end){
        long startTime = System.currentTimeMillis();
        if(start<end){
            int low = start;
            int high = end;
            int metric = arr[start];
            while(low<high){
                //从后往前，遍历，找到第一个小于基准值的索引值，记录，否则high--；
                //直到high=low while循环条件不成立
                while(low<high&&metric<=arr[high]){
                    high--;
                }
                //把当前找到小于基准值的放在基准值的位置上。
                arr[low] = arr[high];
                //同理，从前往后，找到第一个大于基准值的,小于基准值，++
                while (low<high&&metric>=arr[low]){
                    low++;
                }
                //把当前找到大于基准值的放在上次小于基准值的位置上。
                arr[high] = arr[low];

            }
            //此时完成所有的，跳出while
            //low与high相等,把基准值放在low上
            arr[low] = metric;
            System.out.println("第"+(conut++)+"轮的快速排序展示："+ Arrays.toString(arr));
            //完成一次快排
            quickSort(arr,start,low);
            quickSort(arr,low+1,end);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime+"");
    }
}
