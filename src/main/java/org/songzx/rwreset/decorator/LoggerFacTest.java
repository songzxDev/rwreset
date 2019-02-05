package org.songzx.rwreset.decorator;

import org.apache.log4j.Logger;

public class LoggerFacTest {

	public static void main(String[] args) {
		String str = " {\"code\": 0, \"data\": {\"status\": 1,\"number\": \"215646454\",\"account_name\": \"吴系挂\",\"type\":\"中国银行\" ,\"address\": \"某某支行\",\"icon\": \"http://xxx.xxx.xx\"}}";

		// 此处可以写成类静态变量
		Logger logger = MyLoggerFactory
				.getLogger(LoggerFacTest.class.getName());
		// 实际开发时，可以传入对象，在装饰类中将对象转换成json字符串。此处只是测试所以直接传入json字符串
		logger.error(str);
	}

}
