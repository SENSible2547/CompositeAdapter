package Tienda2;

public class Leaf extends Component{
	public Leaf(String n) {
		  name = n;
		}
	  
		@Override
		public void printName(String depth) {
			System.out.println(depth+name);
		}
}

