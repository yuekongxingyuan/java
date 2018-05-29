package FactoryPatterns;

public class SendFactory {
	/*//普通工厂
	public Sender produce(String type) {
		if("mail".equals(type)) {
			return new MailSender();
		}else if("sms".equals(type)) {
			return new SmsSender();
		}else {
			System.out.println("pleas input the right type");
			return null;
		}
	}*/
	//多工厂
	public static Sender produceSms() {
		return new SmsSender();
	}
	public static Sender produceMail() {
		return new MailSender();
	}
}
