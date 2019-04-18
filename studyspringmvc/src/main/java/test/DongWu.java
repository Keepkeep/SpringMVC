package test;

public class DongWu {
	public String name;
	public Integer age;
	public String getName() {
		return name;
	}
	public static void main(String[] args) {
		DongWu a1 = new Cat();
		DongWu a2 = new Cat("Ð¡»¨", 19);
		System.out.println(a2);
	}
	public DongWu() {
		super();
	}

	public DongWu(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "DongWu [name=" + name + ", age=" + age + "]";
	}
	public  class elephene {
		public String  dec;
		public String  age;
		public String getDec() {
			return dec;
		}
		public void setDec(String dec) {
			this.dec = dec;
		}
		public String getAge() {
			return age;
		}
		public void setAge(String age) {
			this.age = age;
		}
		@Override
		public String toString() {
			return "elephene [dec=" + dec + ", age=" + age + "]";
		}
		
	}
	

}

class Cat extends DongWu{
	
	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cat(String name, Integer age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	
}
