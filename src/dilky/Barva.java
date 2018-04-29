package dilky;

public enum Barva {
	MODRA ("Modrá"), ZELENA ("Zelená"), CERVENA ("Èervená"), LAK ("Jen lak"); 
	
	private final String popisCesky;
	
	private Barva(String s) {
		popisCesky = s;
	}
	
	@Override
	public String toString() {
		return popisCesky;
	}
}
