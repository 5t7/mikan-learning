public abstract class Robot{
	public abstract void openBox();
	public abstract void armDown();
	public abstract void grabObject();
	public abstract void armUp();
	public abstract void closeBox();
	
	public void pickUpObject(){
		openBox();
		armDown();
		grabObject();
		armUp();
		closeBox();
	}
}