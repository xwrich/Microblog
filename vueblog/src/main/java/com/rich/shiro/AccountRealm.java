package com.rich.shiro;

import com.rich.entity.User;
import com.rich.service.UserService;
import com.rich.utils.JwtUtil;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author: OriginalCoder
 * @Date: 2021/7/17 22:09
 * @Description:
 */

@Component
public class AccountRealm extends AuthorizingRealm {

	@Autowired
	JwtUtil jwtUtil;
	@Autowired
	UserService userService;


	@Override
	public boolean supports(AuthenticationToken token) {
		return token instanceof JwtToken;
	}

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		return null;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

		JwtToken jwtToken = (JwtToken) token;
		String userId = jwtUtil.getClaimByToken((String) jwtToken.getPrincipal()).getSubject();

		User user = userService.getById(Long.valueOf(userId));
		if (user == null){
			throw new UnknownAccountException("账户不存在");
		}

		if (user.getStatus() == -1){
			throw new LockedAccountException("账户已被锁定");
		}

		AccountProfile profile = new AccountProfile();
		BeanUtils.copyProperties(user,profile);

		return new SimpleAuthenticationInfo(profile,jwtToken.getCredentials(),getName());
	}



}
