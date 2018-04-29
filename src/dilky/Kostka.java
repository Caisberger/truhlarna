package dilky;

public class Kostka extends Dilek {
	
	public Kostka(Barva barva, TypKostky typ) {
		super(barva, typ);
	}
	
	@Override
	public double getObjem() {
		double a = getTyp().getRozmer();
		return a * a*a;
	}
	
	@Override
	public double getPlochaPovrchu() {
		double a = getTyp().getRozmer();
		return a*a *6;
	}
	
	@Override
	public String toString() {
		return "Kostka " + super.getSpolecneVlasnosti();
	}
	
}
