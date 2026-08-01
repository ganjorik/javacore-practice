package generic.task16;

public class Box<T> {
	private T item;

	public T getItem() {
		return item;
	}
	public void setItem(T item) {
		this.item = item;
	}

	public static void main(String[] args) {
		Box<String> myBox = new Box();
		myBox.setItem("Test");

		String s = myBox.getItem();
		System.out.println(s);

		Box<Integer> intBox = new Box();

		intBox.setItem(10);

		System.out.println(intBox.getItem());
	}
}
