package myPackage;

import java.rmi.RemoteException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorProxy proxy = new CalculatorProxy();
		double x = 3;
		double y = 5;
		double result;
		try {
			result = proxy.add(x, y);
			System.out.println(result);
			result = proxy.sub(x, y);
			System.out.println(result);
			result = proxy.mul(x, y);
			System.out.println(result);
			result = proxy.div(x, y);
			System.out.println(result);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
