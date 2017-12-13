package consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.onion.dubbo.provider.Userinfo;

public class Consumer {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("consumer.xml");
		app.start();
		Userinfo userinfo = (Userinfo)app.getBean("Userinfo");
		userinfo.DubboP();
	}
}
