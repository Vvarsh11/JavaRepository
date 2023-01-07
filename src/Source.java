
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Source {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Nandini","Varshitha","Alekhya","Kusuma","Xxx","Siri","Zzzz","Varsha","Robot","Human");
		names.stream()
		.forEach((t)->System.out.println(t));
		System.out.println("=========display names start with V============");
		names.stream()
		.filter((t)->t.startsWith("V"))
		.forEach((t)->System.out.println(t));
		System.out.println("=========display names on length==================");
		names.stream()
		.filter((t)->t.length()<=6)
		.forEach((t)->System.out.println(t));
		System.out.println("=====================display first name============");
		Optional<String>str=names.stream()
		.findFirst();
		System.out.println(str.get());
		List<Integer> numbers = Arrays.asList(5,7,9,3,8,34,67,89,67,6,5);
		System.out.println("=========display by distinct numbers==============");
		numbers.stream()
		.distinct()
		.forEach((t)->System.out.println(t));
		System.out.println("===========display by even numbers================");
		numbers.stream()
		.filter((t)->t%2==0)
		.forEach((t)->System.out.println(t));
		Stream<String> names1 = Stream.of("Nandini","Varshitha","Alekhya","Kusuma","Xxx","Siri","Zzzz","Varsha","Robot","Human");
		System.out.println("=============display name containE===================");
		List<String> containE=names.stream()
		.filter((t)->t.contains("e"))
		.collect(Collectors.toList());
		 System.out.println(containE);
		 Stream<Integer> values=Stream.of(3,5,6,8,11,17);
		 System.out.println("================diplay square of every value================");
		 values.distinct()
		 .sorted()
		 .map((sq)->sq*sq)
		 .forEach((sqnum)->System.out.println(sqnum));
		 

	}

}
