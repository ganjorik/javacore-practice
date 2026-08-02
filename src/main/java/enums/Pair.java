package enums;

public class Pair<K, V> {
	private K key;
	private V value;

	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

	public static void main(String[] args) {
		Pair<Day, Integer> [] scheduler = new Pair[4];
		scheduler[0] = new Pair<>(Day.MONDAY, 4);
		scheduler[1] = new Pair<>(Day.TUESDAY, Day.FRIDAY.getWorkingHours());
		scheduler[2] = new Pair<>(Day.FRIDAY, 0);
		scheduler[3] = new Pair<>(Day.THURSDAY, 8);

		for (Pair<Day, Integer> p : scheduler) {
			System.out.println(p.getKey() + " отработано фактически: " + p.getValue() +
					" норма часов: " + p.key.getWorkingHours());
		}
	}
}
