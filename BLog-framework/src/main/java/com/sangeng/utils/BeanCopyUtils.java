package com.sangeng.utils;

import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

public class BeanCopyUtils {

    private BeanCopyUtils() {
    }

    //单个实体类的copy
    public static <V> V  copyBean(Object source,Class<V> clazz){
        //创建目标对象
        V result = null;
        try {
            result = clazz.newInstance();
            //实现属性copy
            BeanUtils.copyProperties(source,result);

        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        //返回结果
        return result;


    }

    //集合实体的copy
    public static <O,V> List<V> copyBeanList(List<O> list,Class<V> clazz){

        return list.stream()
                .map(o -> copyBean(o,clazz))
                .collect(Collectors.toList());
    }
}
