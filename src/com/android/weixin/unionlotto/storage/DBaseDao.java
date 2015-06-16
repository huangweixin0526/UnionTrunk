package com.android.weixin.unionlotto.storage;

/**
 * 数据库实体基类
 * 
 * @author weixin
 * 
 */
public class DBaseDao {

	public static final String COLUMN_PRIMARY_KEY_ID = "id";

	// @Id // 如果主键没有命名名为id或_id的时，需要为主键添加此注解
	// @NoAutoIncrement // int,long类型的id默认自增，不想使用自增时添加此注解
	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}
