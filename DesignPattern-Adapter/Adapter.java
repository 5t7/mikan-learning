public class Adapter extends MySystem{
	private MyLogSystem myLogSystem;
	public Adapter(){
		myLogSystem = new MyLogSystem();
	}
	public void showLog(){
		System.out.println(myLogSystem.getData(value));
	}
}