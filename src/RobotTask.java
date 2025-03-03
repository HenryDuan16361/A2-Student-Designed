/**
 * Build a task requiring at least two or more robots that uses the concepts of polymorphism and abstraction.
 */
import becker.robots.*;

public class RobotTask {

	public void run() {

		// build a random city called waterloo
		City waterloo = new City(10, 10);

		// build a robot in the city waterloo starting at street 1,1 facing east with 100 things
		Robot rob = new Robot(waterloo, 1, 1, Direction.EAST, 100);



	}


}
