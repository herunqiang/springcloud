package com.hrq.common.util.sort;

import java.util.List;

public abstract class Sort <T> {
    /**
     *
     */
    protected  void exchange(List<T> data,int curData, int nextData){
        T temp = null;
        temp = data.get(curData);
        data.set(curData, data.get(nextData));
        data.set(nextData , temp);
    }

    /**
     * 排序实现
     * @param data 待排序数据
     * @param isDesc 是否降序
     */
    public abstract void sort(List<T> data,Boolean isDesc);
}
