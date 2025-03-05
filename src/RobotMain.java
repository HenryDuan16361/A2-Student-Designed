
public class RobotMain {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		RobotTask task = new RobotTask();
		Thread count = new Thread((Runnable)task);
		System.out.println("Starting Project ...");
		
		for(int i = 0; i < 100; i++) {
			count.run();
		}


		System.out.println("Project Completed!!!");
		
	}

}
