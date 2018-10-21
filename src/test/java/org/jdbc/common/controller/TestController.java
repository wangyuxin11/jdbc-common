package org.jdbc.common.controller;

import java.util.Date;

import org.jdbc.common.base.ConditionBuilder;
import org.jdbc.common.dto.UserDto;
import org.jdbc.common.service.IUserDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
 

@Controller
@RequestMapping("/test")
public class TestController {

	@Autowired
	private IUserDataService service;

	/**

	 * 插入

	 * 

	 * @return

	 */

	@RequestMapping("/insert.do")
	@ResponseBody
	public Object insert() {

		UserDto user = new UserDto();

		user.setId("0dce718273b54d9ea635adaacb6642ea");

		user.setUserName("周杰伦");

		user.setCreated(new Date());

		user.setSex(0);

		user.setState(1);

		return service.insert(user);

	}

 

	/**

	 * 修改

	 * 

	 * @return

	 */

	@RequestMapping("/update.do")

	@ResponseBody

	public Object update() {

		UserDto user = new UserDto();

		user.setId("0dce718273b54d9ea635adaacb6642ea");

		user.setUserName("林俊杰");

		return service.updateById(user);

	}

 

	/**

	 * 查询

	 * 

	 * @return

	 */

	@RequestMapping("/query.do")

	@ResponseBody

	public Object query() {

		return service.query(new ConditionBuilder.Builder().equalTo("username", "周杰伦").build());

	}

 

	/**

	 * 修改

	 * 

	 * @return

	 */

	@RequestMapping("/delete.do")

	@ResponseBody

	public Object delete() {

		return service.deleteById("0dce718273b54d9ea635adaacb6642ea");

	}

}

