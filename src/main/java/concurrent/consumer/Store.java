package concurrent.consumer;

public class Store {
	private int item;

	public void put() {
		item++;
		System.out.println("Производитель добавил 1 товар. Теперь на складе: " + item);
	}

	public void  get() {
		item--;
		System.out.println("Покупатель купил 1 товар. Осталось на складе: " + item);
	}
}
