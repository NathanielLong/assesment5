package co.grandcircus.assessment5b;

import org.springframework.stereotype.Component;

@Component
public class age {

	private Integer age;

	public age() {
		super();
		// TODO Auto-generated constructor stub
	}

	public age(Integer age) {
		super();
		this.age = age;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "age:" + age;
	}

}
