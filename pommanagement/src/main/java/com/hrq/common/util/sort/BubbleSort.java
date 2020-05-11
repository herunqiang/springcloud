package com.hrq.common.util.sort;

import java.util.List;

public class BubbleSort extends Sort<Integer>{
    /**
     *
     * @param data 待排序字段
     * @param isDesc 是否降序
     */
    public  void sort(List<Integer> data,Boolean isDesc){
        //1.两两比较然后换位
        for (int i = 0; i < data.size()-1; i++) {
            for (int j = 0; j < data.size()-1-i; j++) {
                Integer curData = data.get(j);
                Integer nextData = data.get(j + 1);
                //降序
                if(isDesc && curData < nextData){
                    super.exchange(data,j,j + 1);
                }else if (curData >nextData){//升序
                    super.exchange(data,j,j + 1);
                }
                //升序
            }
        }
    }


}
