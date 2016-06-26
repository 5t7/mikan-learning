public class Adapter extends Phone{
	private Display display;
	public Adapter(){
		display = new Display();
	}
	public void showDataFromPhone(String str){
		display.showDataOnDisplay(str);
	}
}