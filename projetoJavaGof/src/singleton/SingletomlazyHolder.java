package singleton;

public class SingletomlazyHolder {
	private static class InstanceHolder {

		private static SingletomlazyHolder instancia = new SingletomlazyHolder();
	}

	private SingletomlazyHolder() {
		super();
	}

	public static SingletomlazyHolder getIstancia() {
		return InstanceHolder.instancia;
	}
}
