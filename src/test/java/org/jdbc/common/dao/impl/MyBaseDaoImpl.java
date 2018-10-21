package org.jdbc.common.dao.impl;

import java.io.Serializable;

import javax.annotation.Resource;

import org.jdbc.common.base.BaseDaoImpl;
import org.springframework.jdbc.core.JdbcTemplate;

public abstract class MyBaseDaoImpl<T extends Serializable> extends BaseDaoImpl<T> {

	@Resource(name = "jdbcTemplate")//以配置文件名称为准
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

}
