package cn.rayest.dao;

import java.io.Serializable;
import java.util.List;

// 基础数据库操作类
public interface BaseDao<T> {

    //保存一个对象
    public Serializable save(T o);

    // 删除一个对象
    public void delete(T o);

    // 更新一个对象
    public void update(T o);

    // 保存或更新对象
    public void saveOrUpdate(T o);


    // 查询
    public List<T> find(String hql);

    // 查询集合
    public List<T> find(String hql, Object[] param);

    // 查询集合

    public List<T> find(String hql, List<Object> param);

    //查询集合(带分页), page: 查询第几页, rows: 每页显示几条记录

    public List<T> find(String hql, Object[] param, Integer page, Integer rows);

    // 查询集合(带分页)
    public List<T> find(String hql, List<Object> param, Integer page, Integer rows);

    // 获得一个对象, c: 对象类型
    public T get(Class<T> c, Serializable id);

    // 获得一个对象
    public T get(String hql, Object[] param);

    // 获得一个对象
    public T get(String hql, List<Object> param);

    // select count(*) from 类
    public Long count(String hql);

    // select count(*) from 类
    public Long count(String hql, Object[] param);

    // select count(*) from 类
    public Long count(String hql, List<Object> param);

    // 执行 HQL 语句
    public Integer executeHql(String hql);

    // 执行 HQL 语句
    public Integer executeHql(String hql, Object[] param);

    // 执行 HQL 语句
    public Integer executeHql(String hql, List<Object> param);

}
