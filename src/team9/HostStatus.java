package team9;

public class HostStatus {
	
	public HostStatus() {}
	
	public static void main(String[] args) throws Exception {
		
		Algorithm instance = new Algorithm("130.65.159.177","root","cmpe-ul4x");
		
		while (System.in.available() == 0) {
			System.out.print("\033[H\033[2J");
			System.out.flush();
			instance.printHostsAndVMs();
			System.out.println("\n\nHit ENTER to quit");
			Thread.sleep(20000);
		}
		
		instance.closeConnection();
	}


}
