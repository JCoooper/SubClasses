//SUPER


public class AnimalPAR {

	private String type;
	private int age;
	private int lifetime;
	
	public AnimalPAR(String class1, int class2, int class3) {
		type = class1;
		age = class2;
		lifetime = class3;
	}
	
	public String getType() {
		return type;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getLifetime() {
		return lifetime;
	}
	
	public void getAniInfo() {
		
	System.out.println("This " + type + " is " + age + " years old and will live to be " + lifetime);
	System.out.println(" ");

}
}


