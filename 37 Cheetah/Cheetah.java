public class Cheetah{
	private String name;
	private double speed;
	private int size;
	
	public Cheetah(String name, double speed, int size){
		this.name = name;
		this.speed = speed;
		this.size = size;
	}
	public void speedUp(double speed){
		this.speed+= speed;
	}
	public boolean isFast(){
		return speed>50;
	}
	public void getsBigger(int size){
		this.size += size;
	}
	public boolean isBig(){
		return size>=10;
	}
}

