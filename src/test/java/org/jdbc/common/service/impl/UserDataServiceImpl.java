package org.jdbc.common.service.impl;

import java.util.Map;

import org.jdbc.common.base.BaseServiceImpl;
import org.jdbc.common.dto.UserDto;
import org.jdbc.common.service.IUserDataService;
import org.springframework.stereotype.Service;
 
@Service
public class UserDataServiceImpl extends BaseServiceImpl<UserDto> implements IUserDataService {

	public Map<String, Object> genMapCondition(UserDto obj) {
		// TODO Auto-generated method stub

		return null;
	}
	
}
