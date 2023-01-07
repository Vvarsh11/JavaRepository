import java.util.ArrayList;
import java.util.List;

public class Source1 {

	public static void main(String[] args) {
		List<Employee>lstemp=new ArrayList<Employee>();
		Employee emp1=new Employee(102,"xxx","developer",21,23000,'F');
		lstemp.add(emp1);
		lstemp.add(new Employee(103,"yyy","java developer",22,24000,'M'));
		lstemp.add(new Employee(101,"vvv","Sr.developer",23,27000,'F'));
		lstemp.add(new Employee(104,"zzz","Analyst",22,24000,'M'));
		System.out.println("=================display Female developer==========");
		lstemp.stream()
		.filter((t)->t.getGender().equals('F'))
		.filter((t)->t.getDesignation().equalsIgnoreCase("developer"))
		.forEach((t)->System.out.println(t));
		
	}

}
