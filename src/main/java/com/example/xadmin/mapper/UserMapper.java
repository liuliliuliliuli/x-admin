package com.example.xadmin.mapper;

import com.example.xadmin.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author liuli
 * @since 2023-09-16
 */
public interface UserMapper extends BaseMapper<User> {

    public List<String> getRoleNamesByUserId(Integer id);
}
