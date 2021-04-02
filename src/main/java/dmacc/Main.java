package dmacc;

import dmacc.beans.Computer;

public class Main {
	public static void main(String[] args)
	{
		Computer com = new Computer();
		System.out.println(com.getCpu().getCpu_Brand());
	}

}
