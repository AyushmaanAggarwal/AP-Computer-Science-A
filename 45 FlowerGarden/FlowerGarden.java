import java.util.Arrays;
import java.util.ArrayList;

public class FlowerGarden
{
	//create an arraylist instance variable
	ArrayList<String> flowers;
	//write a constructor 		
	public FlowerGarden(){
		flowers = new ArrayList<String>();
    }
	//write add flower
	public void addFlower(String f){
		int position = findFlower(f);
		if (position ==-1){
			flowers.add("01 "+ f);
    } else {
        int count = getCount(f);
        flowers.remove (position);
        count++;
        if (count<10){
            flowers.add("0"+count+" "+f);
        } else {
            flowers.add(""+count+" "+f);
        }
    }
}




	//write get count
	public int getCount(String f){
		int pos = findFlower(f);
		if( pos!=-1 ){
			return Integer.parseInt(flowers.get(pos).substring(0,2));
        }
		return  flowers.size();
    }
	//write get flower name
	public String getFlowerName(int pos){
		if (inRange(pos)){
			return flowers.get(pos).substring(3);
        }
        return "Out of Range";
    }
	//write in range
	public boolean inRange(int pos){
		return flowers.size()<pos;
    }
	//write find flower
    public int findFlower (String f){
        for (int i = 0; i<flowers.size(); i++){
            if(getFlowerName(i).equals(f))
                return i;
        }
        return -1;
    }




	//write max flower	
	public String maxFlower(){
		int maxValue = 0;
		String maxFlower = "";
        for (int i = 0; i<flowers.size(); i++){
			if(maxValue<getCount(getFlowerName(i))){
				maxValue = getCount(getFlowerName(i));
				maxFlower = getFlowerName(i);
            }
        }
        return maxFlower;
    }
	//write a toString
	public String toString(){
		return ""+flowers;
    }
}

