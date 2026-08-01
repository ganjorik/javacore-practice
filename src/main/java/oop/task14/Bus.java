package oop.task14;

public class Bus extends GroundTransport{

	private String model = "ЛАЗ";
	private String honk = "Уйди с дороги";

	@Override
	public void refuel(int liters) {
		System.out.println("Заправился на " + liters + " литров");
	}

	@Override
	public void move(int path) {
		System.out.println("Проехал " + path + " км.");
	}

	@Override
	public void honk() {
		super.honk();
		System.out.println(honk);
	}

	@Override
	public String toString() {
		return "Bus{" +
				"model='" + model + '\'' +
				", honk='" + honk + '\'' +
				'}';
	}
}
