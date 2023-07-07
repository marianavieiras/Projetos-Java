package principal;

public class Incremental {

	private static Incremental instance;
	private static int count = 0;
	
	private Incremental() {
	}
	
	public static Incremental Cria_incremental() {
		if(instance == null) {			
			instance = new Incremental();
		}
	count = ++count;
		return instance;
	}
	
	public String toString() {
		return "Incremental "+this.count;
	}
}
