//SUBCLASS


public class  TigerSUB extends AnimalPAR {
	private String PersName;
	private int PoundsOfFood;
	
	public TigerSUB(String class1, int class2, int class3, String TClass, int TClass2 ) {
		
		super(class1,class2,class3);
		
		PersName = TClass;
		PoundsOfFood = TClass2;
		
	}
	
	public String getPersName() {
		return PersName;
	}
	
	public int getPoundsOfFood() {
		return PoundsOfFood;
	}
	 
	public void getTigerInfo() {
		
		System.out.println("This tiger is named " + PersName + " and he eats about " + PoundsOfFood + "lbs of food a day.");
		System.out.println(" ");
	}
	
	}
