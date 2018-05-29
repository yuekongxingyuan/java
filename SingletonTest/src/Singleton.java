
public class Singleton {
	//创建私有静态实例，防止被引用，此处赋值为null，目的时实现延迟加载
	private static Singleton instance = null;
	//私有构造方法，防止被实例化
	private Singleton() {}
	//静态工厂方法，创建实例
	public static Singleton getInstance() {
		if(instance == null) {
			//在第一次创建对象的时候需要上锁
			synchronized(instance) {
				if(instance == null) {
					instance = new Singleton();
				}			
			}		
		}
		return instance;
	}
	//如果对象被用于序列化可以保证对象在序列化前后保持一致
	public Object readResolve() {
		return instance;
	}
}
