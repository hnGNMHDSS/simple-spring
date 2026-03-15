package com.example.demo.modules.user.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.common.Result;
import com.example.demo.modules.user.dto.UserDTO;
import com.example.demo.modules.user.service.UserService;
import com.example.demo.modules.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * 基于SpringMVC框架开发web应用--用户restful api
 * 增加、删除、修改、查找用户信息的API交互服务
 *
 * @author zhuhuix
 * @date 2020-07-10
 */
@RestController
@RequestMapping("/api/user")
public class UserApiController {
    @Autowired
    private UserService userService;

    // 增加用户信息
    @PostMapping
    public Result<UserDTO> addUser(@RequestBody User user) {
        return Result.success(userService.saveUser(user));
    }

    // 根据id删除用户
    @DeleteMapping("")
    public Result<Integer> deleteUser(@RequestParam Long id) {
        return Result.success(userService.deleteById(id));
    }

    // 根据id修改用户
    @PutMapping("")
    public Result<UserDTO> updateUser(@RequestBody User user) {
        return Result.success(userService.saveUser(user));
    }

    // 根据id查找用户
    @GetMapping("")
    public Result<UserDTO> findUser(@RequestParam Long id) {
        return Result.success(userService.findUser(id));
    }

     @GetMapping("/page")
    public Result<Page<User>> userPage(UserDTO dto){
        return Result.success(userService.selectPage(dto));
     }
}
