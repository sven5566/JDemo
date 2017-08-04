package com.whr.jdemo.test.beans;

/**
 * Created by whrr5 on 2017/8/4.
 */

public class TestFactory {
	public static TestInterface getBean(){
		final TestBean testBean = new TestBean();
		testBean.name="asdfww";
		return testBean;
	}
}
