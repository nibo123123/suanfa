package chencj.cc.suanfa;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author CHENCJ
 * @create 2019-01-04-9:29-2019/1/4-
 * suanfa
 */
public class QuickSortTest {
    @Test
    public void quickSort() throws Exception {
        int[] arr = {1,7,3,9,2,5,4};
        System.out.println(Arrays.toString(arr));
        QuickSort.quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}