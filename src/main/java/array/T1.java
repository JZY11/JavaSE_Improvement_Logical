package array;

import java.util.Arrays;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/17.
 * JavaSE_Improvement_Logical.
 */
/*
    Remove Duplicates from Sorted Array


    Given a sorted array, remove the duplicates in place such that each element
    appear only once and return the new length;
    Do not allocate extra space for another array, you must do this in place with constant memory.
    For example, Given input array A = [1,1,2],
    Your function should return length = 2, and A is now [1,2]
 */
public class T1 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int index = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[index - 1]) {
                nums[index++] = nums[i];
            }
        }
        return index;
    }
    public static void main(String[] args) {
        T1 t1 = new T1();
        int[] A = {1,1,2};
        t1.removeDuplicates(A);
        System.out.println(Arrays.toString(A));
    }
}
