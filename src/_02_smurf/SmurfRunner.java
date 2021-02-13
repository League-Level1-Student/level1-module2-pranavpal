package _02_smurf;

public class SmurfRunner {
	public static void main(String[] args) {
		Smurf handy = new Smurf("Handy");
		handy.getName();
		handy.eat();
		
		Smurf papa = new Smurf("Papa Smurf");
		papa.getName();
		papa.eat();
		papa.getHatColor();
		papa.isGirlOrBoy();
		
		Smurf ette = new Smurf("Smurfette");
		ette.getName();
		ette.eat();
		ette.getHatColor();
		ette.isGirlOrBoy();
		
	}
}