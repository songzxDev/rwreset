package org.songzx.rwreset.decorator;

import org.apache.log4j.Logger;

public class JsonFormatLoggerDecorator extends Logger {

	protected static Logger logger;

	public JsonFormatLoggerDecorator(Logger logger) {
		super(JsonFormatLoggerDecorator.class.getName());
		JsonFormatLoggerDecorator.logger = logger;
	}

	@Override
	public void error(Object message) {
		if (message instanceof String) { // 严格来说这里要判断是否是json格式
			logger.error("\n" + Json.format((String) message));
		} else {
			logger.error(message);
		}
	}

}
