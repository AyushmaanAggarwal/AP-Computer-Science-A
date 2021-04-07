public class CheetahRunner{
	public static void main(String[] args){
		Cheetah cat = new Cheetah( "kitty", 87.0, 8 );	//sets name, speed, and size
		cat.speedUp( 3 );						//increases speed by 3


		System.out.println( cat.isFast() );			//cat’s speed is greater than 50
																//returns true


		cat.getsBigger( 1 );					//adds one to size
		System.out.println( cat.isBig() );			//cat’s size if less than 10
																//returns false

	}
}
