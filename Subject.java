package ObserverDesignPattern;

import java.util.List;
import java.util.ArrayList;

public class Subject {
	private List<Observer> observers = new ArrayList<Observer>();
	   private float temperature;

	   public float getState() {
	      return temperature;
	   }

	   public void setState(float temperature) {
	      this.temperature = temperature;
	      notification();
	   }

	   public void attach(Observer observer){
	      observers.add(observer);		
	   }
	   

	   public void notification(){
	      for (Observer observer : observers) {
	         observer.update();
	      }
	   } 
}
