import java.util.TreeMap;

//class GenericClass<T,U>{
//	T x;
//	U y;
//public void display() {
//	System.out.println("The values of x " + x + " and y"+ y);
//}
//
//}
public class GenericSource {

	public static void main(String[] args) {
//		GenericClass<Integer,String> obj= new GenericClass();
//		obj.x=79;
//		obj.y="Robot";
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();
		map.put(3, "Cool Weather");
		map.put(2, "Lazy day");
		map.put(1, "Sleepy");
		System.out.println(map);
				

	}

}
