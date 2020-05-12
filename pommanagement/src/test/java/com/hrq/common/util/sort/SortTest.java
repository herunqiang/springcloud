package com.hrq.common.util.sort;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SortTest {
    private List<Integer> data = new ArrayList<>();
    private String sign = null;
    private boolean isDesc;
    @Before
    public void before(){
        // todo
        System.out.println("排序前数据：");
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            Integer num = random.nextInt(1001);
            System.out.print(num+"   ");
            this.data.add(num);
        }
        System.out.println();
    }
    /**
     * 冒泡排序测试
     */
    @Test
    public void bubbleSortTest() {
        this.sign = "冒泡";
        this.isDesc=true;
        new BubbleSort().sort(this.data,isDesc);
    }
    /**
     * 快速排序测试
     */
    @Test
    public void quickSortTest() {
        this.sign = "快速";
        this.isDesc=true;
        new QuickSort().sort(data,isDesc);
    }
}