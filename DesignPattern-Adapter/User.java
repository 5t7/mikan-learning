public class User{
	public static void main(String args[]){
		MySystem mySystem = new Adapter();
		mySystem.setValue(5);
		mySystem.showLog();
	}
}