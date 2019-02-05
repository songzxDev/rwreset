package org.songzx.rwreset.decorator;

public class Hat extends ClothesDecorator {

	public Hat(Person person) {
		super(person);
	}

	@Override
	public Double cost() {
		return person.cost() + 50; // 帽子50元
	}

	@Override
	public void show() {
		// 执行已有功能
		person.show();
		// 此处是附加的功能
		System.out.println("戴上帽子，累计消费" + this.cost());

	}

}
