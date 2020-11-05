import kareltherobot.*;

public class PyramidRunner
{
	public static void main(String[] args)
	{
		World.readWorld("pyramidWorld.kwld"); 
		World.setVisible(true);
		World.setDelay(30); 
	}
}