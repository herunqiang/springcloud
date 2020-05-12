package com.hrq.common.util.sort;

import java.util.List;

public abstract class Sort <T extends Number> {
    protected List<T> data;
    protected Boolean isDesc;
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
     * TODO: 排序完调用after方法
     */
    public abstract void sort(List<T> data,Boolean isDesc);

    public void after (List<T> data,Boolean isDesc){

        System.out.println("冒泡排序后数据：");
        String eFlag = "";
        for (int i = 0; i < data.size(); i++) {
            T num =data.get(i);
            if(i!=data.size() -1) {
                //降序检查
                if (isDesc) {
                    if (data.get(i).doubleValue()<data.get(i+1).doubleValue()){
//                        System.out.print(num + " ");
                        System.out.print("["+num+"] ");
                        eFlag = "1";
                        continue;
                    }
                }else{//升序检查
                    if (data.get(i).doubleValue()>data.get(i+1).doubleValue()){
//                        System.out.print(num + " ");
                        System.out.print("["+num+"] ");
                        eFlag = "2";
                        continue;
                    }
                }
            }
            System.out.print(num+"   ");
        }
        System.out.println();
        if ("1".equals(eFlag)){
            throw new RuntimeException("降序排序异常");
        }else if ("2".equals(eFlag)){
            throw new RuntimeException("升序排序异常");
        }
    }
}
