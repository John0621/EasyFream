package org.easyfream.web.admin.controller;

import java.util.List;

import net.sf.json.JSONObject;

import org.easyfream.domain.Test;
import org.easyfream.service.TestService;
import org.easyfream.utils.CommonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	@Autowired
	private TestService testService;

	@RequestMapping(value = "/test.do")
	@ResponseBody
	public String getListTest(Model model) {
		List<Test> list = testService.getListTest();
		list = CommonUtils.updateListTest(list);
		JSONObject json = new JSONObject();
		json.put("list", list);
		return json.toString();
	}
}
