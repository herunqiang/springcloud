package com.hrq.common.util.sort;

import java.util.List;

public class InsertSort<T extends Number> extends Sort<T>{

    /**
     * 简单插入排序：
     * 第一个元素默认是已排序序列，从第二个元素开始从后往前比较，
     * 当降序排序时，当前排序字段大于等于排序序列则插入到排序序列前面，升序反之；
     *实现：
     *
     * @param data 待排序数据
     * @param isDesc 是否降序
     */
    @Override
    public void sort(List<T> data, Boolean isDesc) {
        T curData =null;
        int curIndex = 0;
        for (int i = 1; i < data.size(); i++) {//未排序序列
            curData = data.get(i);
            curIndex = i;
            for (int j = i-1; j >= 0; j--) {//便利已排序序列
                if (isDesc){ //降序
                    if (curData.doubleValue() >= data.get(j).doubleValue()) {
                        data.remove(curIndex);
                        curIndex = j;
                        data.add(j,curData);
                    }
                }else{//升序
                    if (curData.doubleValue() <= data.get(j).doubleValue()) {
                        data.remove(curIndex);
                        curIndex = j;
                        data.add(j,curData);
                    }
                }

            }
        }
        this.after(data,isDesc,"插入");
    }
}
