package org.songzx.rwreset.decorator;

public class Jacket extends ClothesDecorator {

	public Jacket(Person person) {
		super(person);
	}

	@Override
	public Double cost() {
		return person.cost() + 100; //夹克100元
	}

	@Override
	public void show() {
		person.show();
        System.out.println("穿上夹克，累计消费" + this.cost());

	}

}
