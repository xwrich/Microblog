package com.rich.utils;

import com.rich.shiro.AccountProfile;
import org.apache.shiro.SecurityUtils;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author: OriginalCoder
 * @Date: 2021/7/18 9:31
 * @Description:
 */
public class ShiroUtil {

	public static AccountProfile getProfile() {
		return (AccountProfile) SecurityUtils.getSubject().getPrincipal();
	}
}
