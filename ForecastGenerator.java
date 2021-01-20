package ObserverDesignPattern;

public class ForecastGenerator extends Observer{
	public ForecastGenerator(Subject subject){
	      this.subject = subject;
	      this.subject.attach(this);
	   }

	   @Override
	   public void update() {
		     System.out.println( "Temperature "+ subject.getState() + " has been written in local database of ForeCastGenerator"); 
	   }
}
