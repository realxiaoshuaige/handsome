package facingTest;


//饿汉式单例类，在类初始化时，已经自行实例化
public class Singleton1 {
	//私有的默认构造
	
	private Singleton1(){}
	
	//已经自行实例化
	private static final Singleton1 single =new Singleton1();
	
	//静态工厂方法
	public static Singleton1 getInstance(){
		return single;
	}
}

//懒汉式单例类,在第一次调用的时候实例化
class Singleton2{
	
	//私有的默认构造
	private Singleton2(){}
	
	//注意,这里没有final
	private static Singleton2 single =null;
	
	//静态工厂方法
	public synchronized static Singleton2 getInstance(){
		if (single==null) {
			single=new Singleton2();
		}
		return single;
	}
}