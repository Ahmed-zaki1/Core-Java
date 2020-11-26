public class Singleton{
	private static Singleton single;
	private Singleton()
	{

	}
	public static Singleton getInstance()
	{
		if(null ==single)
		{
		 Singleton single=null;
		}
		return single;
	}
}