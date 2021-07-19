package com.rich.controller;


import com.rich.common.lang.Result;
import com.rich.entity.User;
import com.rich.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author rich
 * @since 2021-07-17
 */
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("/index")
	public Object index(){
		User user = userService.getById(1L);
		return Result.success(user);
	}

	@PostMapping("/save")
	public Result save(@Validated @RequestBody User user){

		return Result.success(user);
	}
}
