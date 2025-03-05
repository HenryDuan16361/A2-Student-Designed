/**
 * Build a task requiring at least two or more robots that uses the concepts of polymorphism and abstraction.
 */
import becker.robots.*;

public class RobotTask implements Runnable {

	public void run() {

		City field = new City(10,10);
		field.showThingCounts(true);

		// build a robot in the city waterloo starting at street 1,1 facing east with 100 things
		Minute rob = new Minute(field, 1, 1, Direction.EAST, 1000);
		

		rob.print_one();
		rob.print_eight();
		rob.print_five();
		rob.print_seven();



	}


}
