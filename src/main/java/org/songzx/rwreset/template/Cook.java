package org.songzx.rwreset.template;

public abstract class Cook {
	public void open() {
		System.out.println("打开抽油烟机");
	}

	public void fire() {
		System.out.println("生火");
	}

	/**
	 * 期望子类去实现
	 */
	public abstract void doCook();

	public void outfire() {
		System.out.println("灭火");
	}

	public void close() {
		System.out.println("关闭抽油烟机");
	}

	/**
	 * 使用final关键字，防止子类重写
	 */
	public final void cook() {
		this.open();
		this.fire();
		this.doCook();
		this.outfire();
		this.close();
	}
	
	public void beforeCook(){};
}
