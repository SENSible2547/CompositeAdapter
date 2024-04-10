package Tienda2;
import java.util.ArrayList;

public class Composite extends Component{
	public ArrayList<Component> childrens = new ArrayList<>();
	
	public Composite(String n) {
		// TODO Auto-generated constructor stub
		name=n;
	}
	
	
	@Override
	public void printName(String depth) {
		// TODO Auto-generated method stub
		System.out.println(depth + name);
	    for (int i = 0; i < childrens.size(); i++) {
	      childrens.get(i).printName(depth + "  "); 
		
	    }
	}
}	
