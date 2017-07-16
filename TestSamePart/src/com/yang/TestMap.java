package com.yang;

import java.util.HashMap;
import java.util.Map;
/**
 * 测试map的key和value的值都可以是哪些类型的
 * @author Administrator
 *
 */
public class TestMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		测试map的key和value的类型
		Map map1 = new HashMap();
		int a = 1;
		map1.put(a, 1);
		System.out.println(map1.toString());
	}

}
