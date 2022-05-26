package singleton;

public class Singletomlazy {
	private static Singletomlazy instancia;

	private Singletomlazy() {
		super();
	}

	public static Singletomlazy getIstancia() {
		if (instancia == null) {
			instancia = new Singletomlazy();
		}
		return instancia;
	}
}
