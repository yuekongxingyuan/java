package FactoryPatterns;
/**
 * 
 */

/**
 * @author wfguo
 *
 */
public class FactoryTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				//SendFactory fac = new SendFactory();
				/*//单工厂
				Sender sender = fac.produce("sms");*/
				/*//多工厂
				Sender sender = fac.produceMail();*/
				//抽象工厂
				SmsSenderFactory fac1 = new SmsSenderFactory();
				Sender sender = fac1.produce();
				sender.Send();
	}

}


