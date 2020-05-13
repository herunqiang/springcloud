package com.hrq.common.util.sort;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
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
     * 冒泡排序和选择排序的区别在于：冒泡排序在未排序序列中的每次此比较都会交换位置，而选择排序只是从未排序序列中找出最值然后放到已排序序列后面
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

    /**
     * 简单插入排序测试
     */
    @Test
    public void insertSortTest() {
        this.sign = "简单插入排序";
        this.isDesc=true;
        new InsertSort().sort(data,isDesc);
    }
    @Test
    public void selectSortTest() {
        this.sign = "简单选择排序";
        this.isDesc=true;
        new SelectSort().sort(data,isDesc);
    }
}