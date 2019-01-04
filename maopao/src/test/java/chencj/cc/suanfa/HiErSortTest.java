package chencj.cc.suanfa;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author CHENCJ
 * @create 2019-01-04-15:53-2019/1/4-
 * suanfa
 */
public class HiErSortTest {
    @Test
    public void hierSort() throws Exception {
        int[] arr = {1,7,3,9,2,5,4};
        System.out.println(Arrays.toString(arr));
        HiErSort.hierSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}