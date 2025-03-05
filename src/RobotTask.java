/**
 * Build a task requiring at least two or more robots that uses the concepts of polymorphism and abstraction.
 */

import becker.robots.*;

public class RobotTask implements Runnable {

	public void run() {

		City field = new City(10,10);
		field.showThingCounts(true);

		// build a robot in the city waterloo starting at street 1,1 facing east with 100 things
		Clock rob = null;
		rob = new Hour(field, 1, 1, Direction.EAST, 1000);
		rob.print_time();
		rob.colon();
		rob = new Minute(field, rob.getStreet(), rob.getAvenue(), Direction.EAST, 1000);
		rob.print_time();
		rob.colon();
		rob = new Second(field, rob.getStreet(), rob.getAvenue(), Direction.EAST, 1000);
		rob.print_time();
		


		rob = new Years(field, 9, 1, Direction.EAST, 1000);
		rob.print_time();
		rob.slash();

		rob = new Month(field, rob.getStreet(), rob.getAvenue(), Direction.EAST, 1000);
		rob.print_time();
		rob.slash();

		rob = new Date(field, rob.getStreet(), rob.getAvenue(), Direction.EAST, 1000);
		rob.print_time();

		



	}


}
