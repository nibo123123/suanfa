package chencj.cc.suanfa;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author CHENCJ
 * @create 2019-01-04-10:30-2019/1/4-
 * suanfa
 */
public class InsertSortTest {
    @Test
    public void insrtSort() throws Exception {
        int[] arr = {1,7,3,9,2,5,4};
        System.out.println(Arrays.toString(arr));
        InsertSort.insrtSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}