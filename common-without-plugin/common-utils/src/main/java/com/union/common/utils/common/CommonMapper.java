package com.union.common.utils.common;

import java.util.List;

/**
 * 通用mapper
 *
 * @author liurenkai
 * @time 2018/8/1 16:47
 */
public interface CommonMapper<T> {

    /**
     * 新增对象
     *
     * @param t 对象
     * @return
     */
    T add(T t);

    /**
     * 根据ID删除对象
     *
     * @param id ID
     * @return
     */
    int removeById(Integer id);

    /**
     * 根据ID更新对象
     *
     * @param t 对象
     * @return
     */
    int updateById(T t);

    /**
     * 根据ID查询对象
     *
     * @param id ID
     * @return
     */
    T getById(Integer id);

    /**
     * 查询对象列表
     *
     * @param t 条件
     * @return
     */
    List<T> listByConditions(T t);

}
