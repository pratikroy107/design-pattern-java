import com.phone.*;

public class FactoryMain 
{
	public static void main(String[] args)
	{
		//factory design pattern -> used to hide object creation from user
		
		OperatingSystemFactory osf = new OperatingSystemFactory();
		OS obj = osf.getInstance("closed");
		obj.spec();
	}
}
