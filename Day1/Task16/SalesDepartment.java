import java.time.*;
import java.util.*;
import java.util.stream.Collectors;
class Sales{
	//sales class with required attributes
	private String product;
	private int amount;
	private LocalDate date;


	public Sales(String product, int amount, LocalDate date){
		this.product = product;
		this.amount = amount;
		this.date = date;
	}
	public void setProduct(String product){
		this.product = product;
	}
	public void setAmount(int amount){
		this.amount = amount;
	}
	public void setDate(LocalDate date){
		this.date = date;
	}
	public String getProduct(){
		return this.product;
	}
	public int getAmount(){
		return this.amount;
	}
	public LocalDate getDate(){
		return this.date;
	}
	@Override
	public String toString(){
		return "Product: "+this.getProduct()+", $ "+this.getAmount()+ ", Date: "+this.getDate();
	}
}
public class SalesDepartment{
	public static void main(String[] args){
		List<Sales> listOfSales = new ArrayList<>();
		
		//adding sales objects to the list
		listOfSales.add(new Sales("Laptop" , 20_000 ,LocalDate.of(2023,Month.JANUARY,1)));
		listOfSales.add(new Sales("Phone" , 10_000 , LocalDate.of(2023,Month.MARCH,19)));
		listOfSales.add(new Sales("Laptop" , 50_000 ,LocalDate.of(2023,Month.JUNE,19)));
		listOfSales.add(new Sales("HeadSet" , 10_000 ,LocalDate.of(2023,Month.APRIL,12)));
		listOfSales.add(new Sales("Phone" , 15_000 , LocalDate.of(2012,Month.MARCH,23)));
		listOfSales.add(new Sales("Keyboard" , 5_000 , LocalDate.of(2022,Month.DECEMBER,23)));
		listOfSales.add(new Sales("Mouse" , 2_000 , LocalDate.of(2023,Month.MAY,16)));
		listOfSales.add(new Sales("Phone" , 10_000 ,LocalDate.of(2023,Month.JANUARY,23)));
		listOfSales.add(new Sales("Phone" , 10_000 ,LocalDate.of(2023,Month.JANUARY,13)));

		//filter by sales after given date
		System.out.println("Filtered based on the given date ");
		listOfSales.stream().filter(sale -> sale.getDate().isAfter(LocalDate.of(2023,1,1))).forEach(sale -> System.out.println(sale));
		System.out.println("-----------------------------------------------------------");
		//group by product
		Map<String,List<Sales>>group = listOfSales.stream().filter(sale -> sale.getDate().isAfter(LocalDate.of(2023,1,1))).collect(Collectors.groupingBy(Sales::getProduct));
		for(Map.Entry<String,List<Sales>> value : group.entrySet()){
			System.out.println(value.getKey() +" :-");
			value.getValue().forEach(sale -> System.out.println(sale));
		}
		System.out.println("---------------------------------");
		Map<String,Integer> productSales = new HashMap<>();
		for(Map.Entry<String,List<Sales>> value : group.entrySet()){
			Integer totalAmount = value.getValue().stream().mapToInt(sale -> sale.getAmount()).sum();
			productSales.put(value.getKey(),totalAmount); 	
			System.out.println("Total amount of sales for "+value.getKey()+" product: "+totalAmount);
		}
		System.out.println("---------------------------------");
		System.out.println("Sort:- ");
		Map<String,Integer>sortedBasedOnSales =  productSales.entrySet()
			.stream()
			.sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
			.collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2) -> e1,LinkedHashMap::new));
		System.out.println(sortedBasedOnSales);
		System.out.println("---------------------------------");
		System.out.println("Top three sales");
		sortedBasedOnSales.entrySet().stream().limit(3).forEach(System.out::println);
		
		
	}
}