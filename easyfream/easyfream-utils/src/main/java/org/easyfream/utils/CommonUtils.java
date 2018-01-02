package org.easyfream.utils;

import java.util.ArrayList;
import java.util.List;

import org.easyfream.domain.Test;

public class CommonUtils {
	public static List<Test> updateListTest(List<Test> list) {
		List<Test> newList = new ArrayList<Test>();
		for (Test test : list) {
			test.setPassword("111111");
			newList.add(test);
		}
		return newList;
	}
}
