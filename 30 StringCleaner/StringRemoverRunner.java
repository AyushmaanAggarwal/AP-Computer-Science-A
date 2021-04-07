public class StringRemoverRunner {
    public static void main( String args[] )
	{
        StringRemover sr = new StringRemover("dogdogcatddodogdogdoggog","dog");
        sr.removeStrings();
        System.out.println(sr.toString());											
	}
}
