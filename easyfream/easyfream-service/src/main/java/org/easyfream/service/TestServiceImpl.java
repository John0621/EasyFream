package org.easyfream.service;

import java.util.List;

import org.easyfream.dao.TestDao;
import org.easyfream.domain.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

	@Autowired
	private TestDao testDao;

	@Override
	public List<Test> getListTest() {
		return testDao.getListTest();
	}

}
