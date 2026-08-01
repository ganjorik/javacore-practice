package oop.task14;

public abstract class GroundTransport implements Transport {

	abstract void refuel(int liters);

	@Override
	public void honk() {
		System.out.println("Дзынь-дзынь");	}
}
