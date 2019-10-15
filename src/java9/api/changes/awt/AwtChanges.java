package java9.api.changes.awt;

import java.awt.AWTException;
import java.awt.Image;
import java.awt.PopupMenu;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Taskbar;
import java.awt.Window;
import java.awt.image.BaseMultiResolutionImage;
import java.awt.image.MultiResolutionImage;

public class AwtChanges 
{
	public void images() 
	{
		Image imageHighDpi = null, imageNormal = null;
		MultiResolutionImage mri = new BaseMultiResolutionImage(imageHighDpi, imageNormal); 
	}
	
	public void robot() throws AWTException
	{
		new Robot().createMultiResolutionScreenCapture(new Rectangle(0,0, 1000, 600));
	}
	
	public void taskbar()
	{
		Taskbar.isTaskbarSupported();
		Taskbar taskbar = Taskbar.getTaskbar();
		
		taskbar.setIconBadge("badge");
		
		Image image = null;
		taskbar.setIconImage(image);
		taskbar.getIconImage();
		
		taskbar.setMenu(new PopupMenu());
		taskbar.getMenu();
		
		taskbar.setProgressValue(50);
		
		Window window = null;
		Image badgeImage = null;
		taskbar.setWindowIconBadge(window, badgeImage);
		taskbar.setWindowProgressState(window, Taskbar.State.PAUSED);
		taskbar.setWindowProgressValue(window, 50);
		
		taskbar.isSupported(Taskbar.Feature.PROGRESS_STATE_WINDOW);
		
		boolean enabled = true;
		boolean critical = true;
		taskbar.requestUserAttention(enabled, critical );
		taskbar.requestWindowUserAttention(window);
	}
}
