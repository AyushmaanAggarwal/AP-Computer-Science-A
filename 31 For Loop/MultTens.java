public class MultTens{

    public static String go(int x){
        String tens = "";
        if(x>0){
            for(int i = x; i>0; i--){
                tens=(10*i)+tens;
            }
            return tens;
        } else {
            return "aplus";
        }
    }
}