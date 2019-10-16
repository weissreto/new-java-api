package java9.api.changes.awt;

import java.awt.Desktop;
import java.awt.desktop.AboutEvent;
import java.awt.desktop.AboutHandler;
import java.awt.desktop.AppForegroundEvent;
import java.awt.desktop.AppForegroundListener;
import java.awt.desktop.AppHiddenEvent;
import java.awt.desktop.AppHiddenListener;
import java.awt.desktop.AppReopenedEvent;
import java.awt.desktop.AppReopenedListener;
import java.awt.desktop.OpenFilesEvent;
import java.awt.desktop.OpenFilesHandler;
import java.awt.desktop.OpenURIEvent;
import java.awt.desktop.OpenURIHandler;
import java.awt.desktop.PreferencesEvent;
import java.awt.desktop.PreferencesHandler;
import java.awt.desktop.PrintFilesEvent;
import java.awt.desktop.PrintFilesHandler;
import java.awt.desktop.QuitEvent;
import java.awt.desktop.QuitHandler;
import java.awt.desktop.QuitResponse;
import java.awt.desktop.QuitStrategy;
import java.awt.desktop.ScreenSleepEvent;
import java.awt.desktop.ScreenSleepListener;
import java.awt.desktop.SystemSleepEvent;
import java.awt.desktop.SystemSleepListener;
import java.awt.desktop.UserSessionEvent;
import java.awt.desktop.UserSessionListener;
import java.io.File;

import javax.swing.JMenuBar;

public class DesktopChanges
{
  private final Desktop desktop = Desktop.getDesktop();

  public void addAppEventListener()
  {
    desktop.addAppEventListener(new AppForegroundListener()
      {

        @Override
        public void appRaisedToForeground(AppForegroundEvent e)
        {

        }

        @Override
        public void appMovedToBackground(AppForegroundEvent e)
        {

        }
      });

    desktop.addAppEventListener(new AppHiddenListener()
      {

        @Override
        public void appHidden(AppHiddenEvent e)
        {
        }

        @Override
        public void appUnhidden(AppHiddenEvent e)
        {
        }
      });

    desktop.addAppEventListener(new AppReopenedListener()
      {

        @Override
        public void appReopened(AppReopenedEvent e)
        {

        }
      });

    desktop.addAppEventListener(new ScreenSleepListener()
      {

        @Override
        public void screenAboutToSleep(ScreenSleepEvent e)
        {

        }

        @Override
        public void screenAwoke(ScreenSleepEvent e)
        {

        }
      });

    desktop.addAppEventListener(new SystemSleepListener()
      {

        @Override
        public void systemAwoke(SystemSleepEvent e)
        {

        }

        @Override
        public void systemAboutToSleep(SystemSleepEvent e)
        {

        }
      });

    UserSessionListener userSessionListener = new UserSessionListener()
      {

        @Override
        public void userSessionDeactivated(UserSessionEvent e)
        {

        }

        @Override
        public void userSessionActivated(UserSessionEvent e)
        {

        }
      };
    desktop.addAppEventListener(userSessionListener);
    desktop.removeAppEventListener(userSessionListener);
  }

  public void files()
  {
    File file = new File("c:\\temp\\help.txt");
    desktop.browseFileDirectory(file);
    desktop.moveToTrash(file);
  }

  public void suddenTermination()
  {
    desktop.disableSuddenTermination();
    desktop.enableSuddenTermination();
  }

  public void helpViewer()
  {
    desktop.openHelpViewer();
  }

  public void requestForeground()
  {
    boolean allWindows = true;
    desktop.requestForeground(allWindows);
  }

  public void handlers()
  {
    desktop.setAboutHandler(new AboutHandler()
      {

        @Override
        public void handleAbout(AboutEvent e)
        {
        }
      });

    desktop.setOpenFileHandler(new OpenFilesHandler()
      {

        @Override
        public void openFiles(OpenFilesEvent e)
        {
        }
      });

    desktop.setOpenURIHandler(new OpenURIHandler()
      {

        @Override
        public void openURI(OpenURIEvent e)
        {
        }
      });

    desktop.setPreferencesHandler(new PreferencesHandler()
      {

        @Override
        public void handlePreferences(PreferencesEvent e)
        {
        }
      });

    desktop.setPrintFileHandler(new PrintFilesHandler()
      {

        @Override
        public void printFiles(PrintFilesEvent e)
        {
        }
      });

    desktop.setQuitHandler(new QuitHandler()
      {

        @Override
        public void handleQuitRequestWith(QuitEvent e, QuitResponse response)
        {
          boolean shouldQuit = true;
          if (shouldQuit)
          {
            response.performQuit();
          }
          else
          {
            response.cancelQuit();
          }
        }
      });
  }

  public void quitStrategy()
  {
    desktop.setQuitStrategy(QuitStrategy.CLOSE_ALL_WINDOWS);
    desktop.setQuitStrategy(QuitStrategy.NORMAL_EXIT);
  }

  public void toolbarMenu()
  {
    JMenuBar menuBar = new JMenuBar();
    desktop.setDefaultMenuBar(menuBar);
  }
}
