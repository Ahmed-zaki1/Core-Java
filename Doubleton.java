public class Doubleton{
	private static Doubleton doublet;
	private static Doubleton doublet1;
	private Singleton()
	{

	}
	public static Doubleton getInstance()
	{
		if(null == doublet)
		{
		 Doubleton doublet=null;
		}
		return doublet;
	
	if (null == doublet1) {
		Doubleton doublet1=null;
	}
	return doublet1;
}
}