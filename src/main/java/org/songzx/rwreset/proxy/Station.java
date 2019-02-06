package org.songzx.rwreset.proxy;

public class Station implements TicketSell {

	@Override
	public void buyTicket() {
		System.out.println("有人买了一张票");
	}

}
