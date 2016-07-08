public class MySystem{
	
	protected int value;
	
	public void setValue(int i){
		value = i;
	}
	public void showLog(){
		System.out.println("MySystem:"+String.valueOf(value));
	}
}