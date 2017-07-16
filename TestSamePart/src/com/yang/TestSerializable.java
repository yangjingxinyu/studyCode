package com.yang;

import java.io.Serializable;

public class TestSerializable implements Serializable{

	/**
	 * 1 当一个类实现了可序列化接口，如果不写底下这个UID，就会出现警告，
	 * 根据警告提示的方法，就可以自动生成一个UID
	 * 2 这个序列号是为了在序列化时保持版本的兼容性
	 * 3 什么时候一个类需要序列化，还不知道。。。。。。。。。。。。。。。。。。。。。。？？？？？？
	 */
	private static final long serialVersionUID = -6651263457887818929L;
	

}
