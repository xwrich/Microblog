package com.rich.shiro;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author: OriginalCoder
 * @Date: 2021/7/17 23:13
 * @Description:
 */
@Data
public class AccountProfile implements Serializable {


	private Integer id;

	private String username;

	private String avatar;

	private String email;

}
