package dilky;

public enum Barva {
	MODRA ("Modr�"), ZELENA ("Zelen�"), CERVENA ("�erven�"), LAK ("Jen lak"); 
	
	private final String popisCesky;
	
	private Barva(String s) {
		popisCesky = s;
	}
	
	@Override
	public String toString() {
		return popisCesky;
	}
}
