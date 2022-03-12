package study;

public class MyCalculator implements FeaturesList{

	@Override
	public double add(double a, double b) {
		
		return a+b;
	}

	@Override
	public int div(int a, int b) {
		
		return a/b;
	}

}
