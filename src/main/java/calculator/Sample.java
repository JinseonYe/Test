package calculator;

import calculator.mineral.Bronze;
import calculator.mineral.Gold;
import calculator.mineral.Silver;

public class Sample {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		//더하기
		cal.add(110);
		cal.add(200);
		System.out.println(cal.getValue());
		System.out.println("---------------------");

		UpgradeCalculator upgradeCalculator = new UpgradeCalculator();
		//빼기
		upgradeCalculator.add(110);
		upgradeCalculator.add(200);
		upgradeCalculator.minus(200);
		System.out.println(upgradeCalculator.getValue());
		System.out.println("---------------------");

		MaxLimitCalculator maxLimitCalculator = new MaxLimitCalculator();
		//100을 초과하지 않는 정수 더하기
		maxLimitCalculator.add(10);
		maxLimitCalculator.add(91);
		maxLimitCalculator.add(200);
		System.out.println(maxLimitCalculator.getValue());
		System.out.println("---------------------");

		//홀짝 판별하기
		System.out.println(cal.isOdd(3));
		System.out.println("---------------------");

		//평균 구하기
		int[] arr = {1, 2, 10};
		System.out.println(cal.avegrage(arr));

		//미네랄 계산기
		MineralCalculator mineralCalculator = new MineralCalculator();
		mineralCalculator.add(new Gold());
		mineralCalculator.add(new Silver());
		mineralCalculator.add(new Bronze());
	}
}