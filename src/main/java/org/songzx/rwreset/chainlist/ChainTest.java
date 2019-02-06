package org.songzx.rwreset.chainlist;

public class ChainTest {

	public static void main(String[] args) {
		// 创建责任对象
		PostHandler adHandler = new AdHandler();
		PostHandler yellowHandler = new YellowHandler();
		PostHandler swHandler = new SensitiveWordsHandler();

		// 形成责任链
		yellowHandler.setSuccessor(swHandler);
		adHandler.setSuccessor(yellowHandler);

		Post post = new Post();
		post.setContent("我是正常内容，我是广告，我是涉黄，我是敏感词，我是正常内容");

		System.out.println("过滤前的内容为：" + post.getContent());

		adHandler.handlerRequest(post);

		System.out.println("过滤后的内容为：" + post.getContent());
	}

}
