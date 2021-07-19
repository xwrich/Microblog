package com.rich.common.lang;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author: OriginalCoder
 * @Date: 2021/7/17 21:39
 * @Description:
 */
@Data
public class Result implements Serializable {

	private int code;		//200：正常，非200数据异常
	private String msg;
	private Object data;

	public static Result success(Object data){
		return success(200,"操作成功",data);
	}

	public static Result success(int code,String msg,Object data){
		Result result = new Result();
		result.setCode(code);
		result.setMsg(msg);
		result.setData(data);
		return result;
	}

	public static Result fail(String msg){
		return fail(400,msg,null);
	}

	public static Result fail(String msg,Object data){
		return fail(400,msg,data);
	}

	public static Result fail(int code,String msg,Object data){
		Result result = new Result();
		result.setCode(code);
		result.setMsg(msg);
		result.setData(data);
		return result;
	}
}
