package com.bin.toHashCode;

public class Student {
	
	public Student(String name, String code) {
		super();
		this.name = name;
		this.code = code;
	}
	private String name;
	private String code;
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	//重写Object类的hashCode
	public int hashCode(String code) {
		return code.hashCode();
	}
	//重写equals方法
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		if(this == obj ) {
			return true;
		}
		//为了排除强转的风险
		if(obj instanceof Student) {
			//对比学号
			Student stu = (Student) obj;
			if(this.code.equals(stu.getCode())) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
}
