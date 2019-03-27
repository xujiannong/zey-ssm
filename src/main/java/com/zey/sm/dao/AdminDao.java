package com.zey.sm.dao;

import com.zey.sm.model.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository("AdminDao")
public interface AdminDao {

    /**
     * 查询所有用户数据
     *
     * @return
     */
    List<User> selectUserList();

    /**
     * 查询用户记录总数
     *
     * @return
     */
    int selectCount();

}
