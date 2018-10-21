package org.jdbc.common;

import java.io.Serializable;
import java.util.List;
import java.util.Map;


public interface IBaseService<T extends Serializable> {
	public IBaseDao<T> getBaseDao();

	public int insert(T obj); // 添加

	public int deleteById(String id); // 根据id删除

	public int updateById(T obj); // 根据id修改

	public T getById(String id); // 根据id查询

	public Integer queryCount(); // 查询条数

	// -----------------------------------------------------

	Map<String, Object> genMapCondition(T obj); // 生成Map条件

	public List<T> query(T obj); // 按对象�?�查询数�?

	public List<T> query(T obj, PageParameters par); // 按对象�?�查询数�?

	public Integer queryCount(T obj); // 按对象查询条�?

	public DataAndTal queryListAndCount(T obj, PageParameters par); // 分页查询，带数据与�?�条�?

	// -----------------------------------------------------

	public List<T> query(ConditionBuilder condition); // 按条件�?�查询数�?

	public List<T> query(ConditionBuilder condition, PageParameters par); // 按条件�?�查询数�?

	public Integer queryCount(ConditionBuilder condition); // 按条件查询条�?

	public DataAndTal queryListAndCount(ConditionBuilder condition, PageParameters par); // 分页查询，带数据与�?�条�?

	// -----------------------------------------------------

	public List<T> query(JoinQuery jq, ConditionBuilder condition); // 按条件�?�级联查询数�?

	public List<T> query(JoinQuery jq, ConditionBuilder condition, PageParameters par); // 按条件�?�级联查询数�?

	public Integer queryCount(JoinQuery jq, ConditionBuilder condition); // 按条件查询条�?

	public DataAndTal queryListAndCount(JoinQuery jq, ConditionBuilder condition, PageParameters par); // 分页级联查询，带数据与�?�条�?

	// -----------------------------------------------------

	public List<T> query(JoinQuery jq, T obj); // 按对象�?�查询数�?

	public List<T> query(JoinQuery jq, T obj, PageParameters par); // 按对象�?�查询数�?

	public Integer queryCount(JoinQuery jq, T obj); // 按对象查询条�?

	public DataAndTal queryListAndCount(JoinQuery jq, T obj, PageParameters par); // 分页查询，带数据与�?�条�?
}
