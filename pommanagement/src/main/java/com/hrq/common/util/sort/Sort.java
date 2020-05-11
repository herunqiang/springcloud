package com.hrq.common.util.sort;

import java.util.List;

public class Sort <T> {
    /**
     *
     */
    protected  void exchange(List<T> data,int curData, int nextData){
        T temp = null;
        temp = data.get(curData);
        data.set(curData, data.get(nextData));
        data.set(nextData , temp);
    }
}
