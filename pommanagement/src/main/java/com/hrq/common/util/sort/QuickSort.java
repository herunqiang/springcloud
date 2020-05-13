package com.hrq.common.util.sort;

import java.util.ArrayList;
import java.util.List;

/**
 * 快速排序
 * @param <T>
 */
public  class QuickSort <T extends Number> extends Sort<T> {
    /**
     * 快速排序：1：基准 2：分区  3：递归
     *          基准：将待排序数据中的第一个数据作为“基准”（随意选取）
     *          分区：如果是降序序左分区应该是大数，右分区小数；升序反之
     *          递归：在分区完成之后进行递归判断，待排序数据超过一个进行递归，反之退出递归
     * @param data 待排序数据
     * @param isDesc 是否降序
     */
    @Override
    public void sort(List<T> data, Boolean isDesc) {

        subarea(data,isDesc,0);
        this.after(data,isDesc,"快速");
    }

    private void subarea(List<T> data, Boolean isDesc,int povitIndex){
        List<T> dataLeft = new ArrayList<>();
        List<T> dataMid = new ArrayList<>();
        List<T> dataRight = new ArrayList<>();
        List<T> dataFinal = new ArrayList<>();
        //分区
        T temp = null;
        double value = data.get(povitIndex).doubleValue();
        for (int i = 0; i < data.size(); i++) {
            //降序
            temp = data.get(i);
            if (isDesc ){
                if (temp.doubleValue() > value){
                    dataLeft.add(temp);
                }else if(temp.doubleValue() < value) {
                    dataRight.add(temp);
                }else {
                    dataMid.add(temp);
                }
            }else {//升序
                if (temp.doubleValue() < value){
                    dataLeft.add(temp);
                }else if (temp.doubleValue() > value) {
                    dataRight.add(temp);
                }else {
                    dataMid.add(temp);
                }
            }
        }
        if(data.size()>2) {
            //递归左分区
            if (dataLeft.size() > 1) {
                this.subarea(dataLeft, isDesc, 0);
            }
            //递归右分区
            if (dataRight.size() > 1) {
                this.subarea(dataRight, isDesc, 0);
            }
        }
        //同步分区
        dataFinal.addAll(dataLeft);
        dataFinal.addAll(dataMid);
        dataFinal.addAll(dataRight);
        syschronizData(data, dataFinal);
    }
    private void syschronizData(List<T> data,List<T> dataFinal) {
        for (int i = 0; i < dataFinal.size(); i++) {
            data.set(i,dataFinal.get(i));
        }
    }
}
