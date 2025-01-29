package nov23;

class DatabaseConnection{
	
	private static DatabaseConnection databaseConnection;
	private DatabaseConnection() {
		
	}
	
	public static DatabaseConnection getObject() {
		if(databaseConnection ==null)
			databaseConnection = new DatabaseConnection();
		return databaseConnection;
	}
	public void displayData() {
		System.out.println("Display Data ");
	}
	public void insertData() {
		System.out.println("insert Data ");
	}
	
	
}
public class MainApp {
	public static void main(String args[]) {
		DatabaseConnection databaseConnection = DatabaseConnection.getObject();
		databaseConnection.displayData();
		databaseConnection.insertData();
		
	}

}
