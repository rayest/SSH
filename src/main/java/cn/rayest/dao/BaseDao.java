package cn.rayest.dao;

import java.io.Serializable;
import java.util.List;

// �������ݿ������
public interface BaseDao<T> {

    //����һ������
    public Serializable save(T o);

    // ɾ��һ������
    public void delete(T o);

    // ����һ������
    public void update(T o);

    // �������¶���
    public void saveOrUpdate(T o);


    // ��ѯ
    public List<T> find(String hql);

    // ��ѯ����
    public List<T> find(String hql, Object[] param);

    // ��ѯ����

    public List<T> find(String hql, List<Object> param);

    //��ѯ����(����ҳ), page: ��ѯ�ڼ�ҳ, rows: ÿҳ��ʾ������¼

    public List<T> find(String hql, Object[] param, Integer page, Integer rows);

    // ��ѯ����(����ҳ)
    public List<T> find(String hql, List<Object> param, Integer page, Integer rows);

    // ���һ������, c: ��������
    public T get(Class<T> c, Serializable id);

    // ���һ������
    public T get(String hql, Object[] param);

    // ���һ������
    public T get(String hql, List<Object> param);

    // select count(*) from ��
    public Long count(String hql);

    // select count(*) from ��
    public Long count(String hql, Object[] param);

    // select count(*) from ��
    public Long count(String hql, List<Object> param);

    // ִ�� HQL ���
    public Integer executeHql(String hql);

    // ִ�� HQL ���
    public Integer executeHql(String hql, Object[] param);

    // ִ�� HQL ���
    public Integer executeHql(String hql, List<Object> param);

}
