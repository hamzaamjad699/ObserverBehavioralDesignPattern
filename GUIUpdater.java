package ObserverDesignPattern;

public class GUIUpdater extends Observer{
	public GUIUpdater(Subject subject){
	      this.subject = subject;
	      this.subject.attach(this);
	   }

	   @Override
	   public void update() {
		     System.out.println( "Temperature "+ subject.getState() + " has been written in local database of GUIUpdater"); 
	   }
}
