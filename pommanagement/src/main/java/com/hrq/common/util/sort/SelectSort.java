package com.hrq.common.util.sort;

import java.util.List;

public class SelectSort<T extends Number> extends Sort<T> {
    /**
     * 循环遍历未排序序列，查出最值放到已排序末尾
     * @param data 待排序数据
     * @param isDesc 是否降序
     */
    @Override
    public void sort(List<T> data, Boolean isDesc) {
        int index = 0;
        for (int i = 0; i < data.size(); i++) {
            T value = data.get(i);
            index = i;
            for (int j = i+1; j < data.size(); j++) {
                //降序
                if (isDesc) {
                    if ( value.doubleValue() <= data.get(j).doubleValue()) {
                        value = data.get(j);
                        index = j;
                    }
                } else {//升序
                    if (value.doubleValue() >= data.get(j).doubleValue()) {
                        value = data.get(j);
                        index = j;
                    }
                }
            }
            this.exchange(data,i,index);
        }
        this.after(data,isDesc,"选择");
    }
}
