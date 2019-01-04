package chencj.cc.suanfa;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author CHENCJ
 * @create 2019-01-04-9:09-2019/1/4-
 * suanfa
 */
public class MaoPaoTest {
    @org.junit.Test
    public void maopao() throws Exception {
        int[] arr = {1,7,3,9,2,5,4};
        System.out.println(Arrays.toString(arr));
        MaoPao.maopao(arr);
        System.out.println(Arrays.toString(arr));
    }

}