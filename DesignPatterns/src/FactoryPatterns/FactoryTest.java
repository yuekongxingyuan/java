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
				/*//������
				Sender sender = fac.produce("sms");*/
				/*//�๤��
				Sender sender = fac.produceMail();*/
				//���󹤳�
				SmsSenderFactory fac1 = new SmsSenderFactory();
				Sender sender = fac1.produce();
				sender.Send();
	}

}


