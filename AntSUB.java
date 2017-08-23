//SUBCLASS


public class  AntSUB extends AnimalPAR {
	private int HowMuch;
	private int QueenNum;
	
	public AntSUB(String class1, int class2, int class3, int AClass, int AClass2 ) {
		
		super(class1,class2,class3);
		
		HowMuch = AClass;
		QueenNum = AClass2;
		
	}
	
	public int getHowMuch() {
		return HowMuch;
	}
	
	public int getQueenNum() {
		return QueenNum;
	}
	
public void getAntInfo() {
		
		System.out.println("There are " + HowMuch + " ants in this ant hill and There are " + QueenNum + " Queens in the hill too.");
		System.out.println(" ");
	}
	
	}