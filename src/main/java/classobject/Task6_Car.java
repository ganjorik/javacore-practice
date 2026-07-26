
package classobject;

public class Task6_Car {
	String model;
	static String color;
	double fuelConsumption;
	int volume;
	int fuelLevel;

	Task6_Car() {
		color = "Белый";
		fuelConsumption = 8;
		volume = 45;
		fuelLevel = 10;
	}

	Task6_Car(String model) {
		this.model = model;
		color = "Белый";
		fuelConsumption = 8;
		volume = 45;
		fuelLevel = 10;
	}

	Task6_Car(String model, String color) {
		this.model = model;
		this.color = color;
		fuelConsumption = 18;
	}

	public Task6_Car(String model, String color, double fuelConsumption, int volume, int fuelLevel) {
		this.model = model;
		this.color = color;
		this.fuelConsumption = fuelConsumption;
		this.volume = volume;
		this.fuelLevel = fuelLevel;
	}

	void move (int x1, int y1, int x2, int y2) {
		double path = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		fuelLevel = (int) (fuelLevel - path / 100 * fuelConsumption);
		if (fuelLevel < 0) {
			System.out.println("Автомобиль марки: " + model + " не доехал, пора заправиться");
			fuelLevel = 0;
		} else {
			System.out.println("Автомобиль марки: " + model + " прошел: 0" + path + " км, осталось топлива: " + fuelLevel + " литра");
		}
	}

	void refuel (int liters) {
		fuelLevel = fuelLevel + liters;
		if (fuelLevel > volume) {
			System.out.println("Бензин льется через край!");
			fuelLevel = volume;
		} else {
			System.out.println("Заправились, теперь у нас " +  fuelLevel + " литров");
		}
	}

	public static void main(String[] args) {
		Task6_Car.color = "Белый";
		System.out.println(Task6_Car.color);




		/*opel.color = "Желтый";

		opel.move(10, 10, 100, 100);

		Car bmw = new Car("BMW", "Чёрный");
		bmw.volume = 60;

		bmw.move(0, 0, 500, 300);
		bmw.refuel(50);
		bmw.move(150, 150, 500, 300);*/
	}
}
