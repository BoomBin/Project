package com.bin.toHashCode;

import java.util.Collection;
import java.util.HashSet;

/**
 * 重写父类的HashCode
 * @author jiabin
 *
 */
public class ToHashCode {
	//重写父类的HashCode
	public static void main(String[] args) {
		Collection c = new HashSet();
		c.add(new Student("张三","123"));
		c.add(new Student("李四","456"));
		c.add(new Student("王五","789"));
		System.out.println(c);
		c.remove(new Student("李四","456"));
		System.out.println(c);
	}
}
