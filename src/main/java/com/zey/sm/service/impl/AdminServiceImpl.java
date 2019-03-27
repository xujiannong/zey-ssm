package com.zey.sm.service.impl;

import java.util.HashMap;
import java.util.List;
import javax.annotation.Resource;
import com.zey.sm.dao.AdminDao;
import com.zey.sm.model.PageBean;
import com.zey.sm.model.User;
import com.zey.sm.service.AdminService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * User类业务层实现类
 * @author Peng
 * @Date2016年12月13日上午9:54:56
 */
@Service("AdminService")
public class AdminServiceImpl implements AdminService {

	Logger logger = LoggerFactory.getLogger(AdminServiceImpl.class);

	@Resource
	private AdminDao adminDao;

	@Override
	public List<User> getAdmin() {
		return adminDao.selectUserList();
	}
}
