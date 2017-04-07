package policy;

import myFoodora.MyFoodora;

public interface TargetProfitPolicy {
	public double makeDescision(double target, double arg1, double arg2, MyFoodora myfoodora);
}
