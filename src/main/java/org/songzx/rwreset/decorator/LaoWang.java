package org.songzx.rwreset.decorator;

public class LaoWang implements Person {

	@Override
	public Double cost() {
		return 0.0;
	}

	@Override
	public void show() {
		System.out.println("我是赤裸裸的老王！");
	}

}
