package calculator;

public class Calculator {
	int value;

	Calculator() {
		this.value = 0;
	}

	void add(int value) {
		this.value += value;
	}

	int getValue() {
		return this.value;
	}

	boolean isOdd(int value) {
		return value % 2 == 1;
	}

	int avegrage(int[] array) {
		int total = 0;
		for (int element : array) {
			total += element;
		}
		return total / array.length;
	}

	// int average(List<Integer> list) {
	// 	int total = 0;
	// 	for (int element : list) {
	// 		total += element;
	// 	}
	// 	return total / list.size();
	// }
}
