
public class Appp {
	String appName;
	boolean fav;
	boolean currentApp;
  
  public Appp(String appName, boolean fav, boolean currentApp) {
	this.appName=appName;
	this.fav=fav;
	this.currentApp=currentApp;
		
	}
public String toString()
	
	{
		 return appName+" "+fav +" "+currentApp;	
	}
   public String getAppName()
   {
	   return appName;
   }
   public boolean getFav()
   {
	   return fav;
   }
   public boolean getCurrentApp()
   
   {
	   return currentApp;
   }
  


}
