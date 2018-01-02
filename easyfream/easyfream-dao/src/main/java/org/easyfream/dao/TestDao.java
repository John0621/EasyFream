package org.easyfream.dao;

import java.util.List;

import org.easyfream.domain.Test;


public interface TestDao {
	/**
	 * 获取用户列表
	 * */
	List<Test> getListTest();
}
