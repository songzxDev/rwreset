package org.songzx.rwreset.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyTest {

	public static void main(String[] args) {
		try {
			TicketSell sell = new ProxyStation();
			sell.buyTicket();
			sell.buyTicket();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 动态代理
		try {
			Station station = new Station();
			InvocationHandler handler = new StockHandler(station);

			Class<?> cls = station.getClass();

			ClassLoader loader = cls.getClassLoader();

			TicketSell sell1 = (TicketSell) Proxy.newProxyInstance(loader,
					cls.getInterfaces(), handler);

			sell1.buyTicket();
			sell1.buyTicket();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}

}
