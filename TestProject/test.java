import java.util.ArrayList;
public class test{
    public static void main(String[] args){
        

    }
}
public class OB{
    protected int a = 0;
    public OB(){
        a = 1;
    }
    public int add(){
        a+=10;
        return a;
    }
}
public class obj extends OB{
    public obj(){
        super();
    }
    public int add(){
        a+=12;
        return a;
    }
}