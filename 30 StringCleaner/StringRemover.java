public class StringRemover {
    private String remove;
    private String sentence;

	public StringRemover( String sen, String rem )
	{
        sentence = sen;
        remove = rem;
        System.out.println(sen+" - String to remove R-M");
	}

	public void removeStrings()
	{
        int loc = sentence.indexOf(remove);
        while(loc!=-1){
            if (loc>1){
                sentence = sentence.substring(0,loc-1)+sentence.substring(loc+remove.length());
            } else {
                sentence = sentence.substring(loc+remove.length());
            }
            loc = sentence.indexOf(remove);   
        }
	}

	public String toString()
	{
		return sentence;
	}
}
