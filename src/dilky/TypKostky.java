package dilky;

public enum TypKostky {
	PRO_NEJMENSI (6), PRO_STARSI (3);
	
	private final double rozmer;
	
	private TypKostky(int r) {
		rozmer = r;
	}
	
	public double getRozmer() {
		return rozmer;
	}
}
