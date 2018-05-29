
public class Singleton {
	//����˽�о�̬ʵ������ֹ�����ã��˴���ֵΪnull��Ŀ��ʱʵ���ӳټ���
	private static Singleton instance = null;
	//˽�й��췽������ֹ��ʵ����
	private Singleton() {}
	//��̬��������������ʵ��
	public static Singleton getInstance() {
		if(instance == null) {
			//�ڵ�һ�δ��������ʱ����Ҫ����
			synchronized(instance) {
				if(instance == null) {
					instance = new Singleton();
				}			
			}		
		}
		return instance;
	}
	//��������������л����Ա�֤���������л�ǰ�󱣳�һ��
	public Object readResolve() {
		return instance;
	}
}
