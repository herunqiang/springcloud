package com.hrq.common.util.sort;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.*;

public class SortTest {
    private List<Integer> data = new ArrayList<>();
    private String sign = null;
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
        new BubbleSort().sort(this.data,false);
    }
    @After
    public void after (){
        System.out.println(sign+"排序后数据：");
        for (Integer num : data) {
            System.out.print(num+"   ");
        }
        System.out.println();
    }
}