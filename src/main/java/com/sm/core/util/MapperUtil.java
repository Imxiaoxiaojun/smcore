package com.sm.core.util;

import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * Created by yj on 2018/4/15.
 */
public class MapperUtil<T> {
    /**
     * Mapper接口
     */
    private Class<T> clazz;
    /**
     * Mapper的父类接口
     */
    private BaseMapper<?> baseMapper;

    private MapperUtil(Class clazz) {
        this.clazz = clazz;
        this.baseMapper = (BaseMapper<?>) SpringContextHolder.getBean(clazz);
    }

    /**
     * <p>
     * 获取一个mapper的快捷方法
     *
     * @param clazz mapper类的类对象
     * @date 2017年2月22日 下午10:31:35
     */
    public static <T> T getMapper(Class<T> clazz) {
        return SpringContextHolder.getBean(clazz);
    }
}
