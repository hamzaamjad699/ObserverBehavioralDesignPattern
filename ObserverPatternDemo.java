package ObserverDesignPattern;

import java.util.Scanner;

public class ObserverPatternDemo {
	public static void main( String[] args ) {
        Subject sub = new Subject();

        new DataRecorder (sub);
        new ForecastGenerator (sub);
        new DataAnalyzer (sub);
        new GUIUpdater (sub);
        new NewsGenerator(sub);
        new GraphsUpdater(sub);


        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("\nEnter a temperature you want to notify to all Applications: ");
            sub.setState(scan.nextFloat());
        }
    }

}
