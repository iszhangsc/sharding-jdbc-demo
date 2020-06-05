package com.sharding.controller;

import com.sharding.entity.User;
import com.sharding.mapper.UserMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  用户
 * </p>
 *
 * @author zhangshichang
 * @date 2020/6/5 10:09 下午
 */
@Api(tags = "用户")
@RestController
@RequestMapping("/user")
public class UserController {

    private final UserMapper userMapper;

    public UserController(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @GetMapping("/list")
    @ApiOperation(value = "所有用户列表")
    public List<User> list() {
        return userMapper.selectList(null);
    }

    @PostMapping("/save")
    @ApiOperation(value = "保存用户")
    public int save(@RequestBody User user) {
        return userMapper.insert(user);
    }

    @PutMapping("/update")
    @ApiOperation(value = "修改用户")
    public int update(@RequestBody User user) {
        return userMapper.updateById(user);
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "删除用户")
    public int delete(@PathVariable Long id) {
        return userMapper.deleteById(id);
    }

}
