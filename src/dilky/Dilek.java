package dilky;

public abstract class Dilek {
	Barva barva;
	TypKostky typ;
	
	public Dilek(Barva barva, TypKostky typ) {
		this.barva = barva;
		this.typ = typ;
	}
	
	public abstract double getObjem ();
	
	public abstract double getPlochaPovrchu();
	
	public Barva getBarva( ) {
		return barva;
	}

	public TypKostky getTyp() {
		return typ;
	}
	
	public void setBarva (Barva barva) {
		this.barva = barva;
	}
	
	public void setTypKostky (TypKostky typ) {
		this.typ = typ;
	}
	
	public String getSpolecneVlasnosti( ) {
		return getBarva() + ", " + getTyp() + ", objem: " + getObjem() + ", povrch: " + getPlochaPovrchu();
	}
	
}
