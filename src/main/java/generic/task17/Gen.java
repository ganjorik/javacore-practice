package generic.task17;

public class Gen<T> {
	T obj;

	Gen(){}

	static void setA(Gen<? extends A> a){	System.out.println("setA");	}

	static void setB(Gen<? super B> b){	System.out.println("setB");	}

	public static void main(String[] args) {
		Gen<A> genA = new Gen();
		Gen<B> genB = new Gen();
		Gen<C> genC = new Gen();

		setA(genC);
		setB(genA);

	}
}
