package com.rich.shiro;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author: OriginalCoder
 * @Date: 2021/7/17 22:31
 * @Description:
 */
public class JwtToken implements AuthenticationToken {

	private String token;

	public JwtToken(String jwt){
		this.token = jwt;
	}

	@Override
	public Object getPrincipal() {
		return token;
	}

	@Override
	public Object getCredentials() {
		return token;
	}
}
