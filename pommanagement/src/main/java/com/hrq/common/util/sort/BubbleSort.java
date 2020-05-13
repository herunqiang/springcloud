package com.hrq.common.util.sort;

import java.util.List;

public class BubbleSort<T extends Number> extends Sort<T>{
    /**
     * 基本思路：两两比较然后换位，每轮之后就
     * @param data 待排序字段
     * @param isDesc 是否降序
     */
    public  void sort(List<T> data,Boolean isDesc){
        //1.两两比较然后换位
        for (int i = 0; i < data.size()-1; i++) {
            for (int j = 0; j < data.size()-1-i; j++) {
                T curData = data.get(j);
                T nextData = data.get(j + 1);
                //降序
                if (isDesc) {
                    if (curData.doubleValue() < nextData.doubleValue()) {
                        super.exchange(data, j, j + 1);
                    }
                } else {
                    if (curData.doubleValue() > nextData.doubleValue()) {//升序
                        super.exchange(data, j, j + 1);
                    }
                }
                //升序
            }
        }
        this.after(data,isDesc,"冒泡");
    }


}
