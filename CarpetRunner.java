import kareltherobot.*;

public class CarpetRunner
{
	public static void main(String[] args)
	{
		World.readWorld("carpetWorld.kwld"); 
		World.setVisible(true);
		World.setDelay(30); 
	}
}