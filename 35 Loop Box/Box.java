public class Box
{
	public static String go( int size )
	{
        String output="";
        for(int i = 1; i<= size; i++){
            for(int j1 = size-i; j1>=0;j1--){
                output+="*";
            }
            for(int j2 = 1; j2<=i; j2++){
                output+="#";
            }
            output+="\n";
        }
		return output+"\n";
	}
}