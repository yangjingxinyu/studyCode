package com.yang;

import java.util.Map;

public class TestSamePart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map = SamePart.getInfo("test", "aaa");
		System.out.println(map.get("res"));
		System.out.println(map.toString());
	}

}
