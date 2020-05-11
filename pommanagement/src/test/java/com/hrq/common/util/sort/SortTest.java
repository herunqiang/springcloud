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
        this.isDesc=false;
        new BubbleSort().sort(this.data,isDesc);
    }
    @After
    public void after (){
        System.out.println(sign+"排序后数据：");
        for (int i = 0; i < data.size(); i++) {
            Integer num =data.get(i);

            if(i!=data.size() -1) {
                //降序检查
                if (this.isDesc) {
                    if (data.get(i)<data.get(i+1)){
//                        System.out.print(num + " ");
                        System.out.print("["+num+"] ");
                        continue;
                    }
                }else{//升序检查
                    if (data.get(i)>data.get(i+1)){
//                        System.out.print(num + " ");
                        System.out.print("["+num+"] ");
                        continue;
                    }
                }
            }
            System.out.print(num+"   ");
        }
        System.out.println();
    }
}