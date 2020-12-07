import static java.lang.System.*;

public class Chunk
{
	/*
	 *method getFirstChunk() should return
	 *all letters up to the first @ sign
	 *if there is no @ return "aplus"
	 *if the string starts with an @, return "APLUS"
	 */
	public static String getFirstChunk( String line )
	{
		int locOfAt = line.indexOf('@');
		if(locOfAt==0) {
			return "APLUS";
		} else if(locOfAt==-1) {
			return "aplus";
		} else {
			return line.substring(0,locOfAt);
		}
	}

   public static void main( String args[] )
   {
		System.out.println( getFirstChunk("elephants@are@big") );    //outs elephants
		System.out.println( getFirstChunk("computer@science") );    //outs computer
		System.out.println( getFirstChunk("dogs@are@smarte@than@cats") );   //outs dogs
		System.out.println( getFirstChunk("chickens@are@kewl") );   //outs chickens
		System.out.println( getFirstChunk("dogscats") );   			//outs aplus
		System.out.println( getFirstChunk("funny@@@") );   		//outs funny
		System.out.println( getFirstChunk("@@@@funny@@@") );   		//outs APLUS		
   }
}