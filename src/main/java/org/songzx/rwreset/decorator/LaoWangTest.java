package org.songzx.rwreset.decorator;

public class LaoWangTest {

	public static void main(String[] args) {
		Person laowang = new LaoWang();
		// 穿上夹克
		laowang = new Jacket(laowang);
		// 戴上帽子
		laowang = new Hat(laowang);

		laowang.show();
		System.out.println("买单，老王总共消费：" + laowang.cost());

	}

}
