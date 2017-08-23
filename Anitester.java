//TESTER


public class Anitester {

	public static void main(String[] args) {
		//def info
		AnimalPAR tigerGen = new AnimalPAR("Tiger", 6 ,8);
		AnimalPAR antGen = new AnimalPAR("Ant", 9, 7);
		
		TigerSUB tigerSpe = new TigerSUB("Tiger", 6 ,8, "Andy", 20);
		AntSUB antSpe = new AntSUB("Ant", 9, 7, 395928, 2);
		
	
		
//--------------------------------------------------------		
		
		
		
		
		//get infos
		tigerGen.getAniInfo();
		tigerSpe.getTigerInfo();
		antGen.getAniInfo();
		antSpe.getAntInfo();
		
		
		System.out.println("This " + tigerSpe.getType() + " is " + tigerSpe.getAge() + " years old.");
		System.out.println(" ");
		System.out.println("This " + antSpe.getType() + " is " + antSpe.getAge() + " years old.");
	}

}
