package com.whr.jdemo.test.beans;

/**
 * Created by whrr5 on 2017/8/4.
 */

class TestBean implements TestInterface{
	public String name;

	@Override
	public String getName() {
		return name;
	}
}
