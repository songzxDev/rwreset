package org.songzx.rwreset.decorator;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class MyLoggerFactory {
	public static Logger getLogger(String name) {
		// 此处可以进行多层装饰，给日志增加多个功能
		return new JsonFormatLoggerDecorator(LogManager.getLogger(name));
	}
}
