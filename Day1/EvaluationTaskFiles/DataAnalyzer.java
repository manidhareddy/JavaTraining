import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class DataAnalyzer{
	public static void main(String[] args){
		String path = "D:\\java\\JavaTraining\\src\\Day1\\EvaluationTaskFiles\\EmployeeData.csv";
		File file  = new File(path);
		Scanner sc = new Scanner(System.in);
		try(BufferedReader bufferReader = new BufferedReader(new FileReader(file))){
			//data structures to store csv file data
			Map<String,Double> totalSalary = new HashMap<>();//for average
			Map<String,Integer> countDept = new HashMap<>();//for countDept
			Map<String,Double> empSalary = new HashMap<>();//for salary
			//list of youngest and old employees
			List<String>youngestEmp = new ArrayList<>();
			List<String>oldEmp = new ArrayList<>();
			bufferReader.readLine();
			String line;
			while((line = bufferReader.readLine())!=null){
				String[] values = line.split(",");
				String department = values[2];
				double salary = Double.parseDouble(values[3]);
				String name = values[0];
				int age = Integer.parseInt(values[1]);
				if(totalSalary.containsKey(department)){
					totalSalary.put(department,totalSalary.get(department) + salary);
					countDept.put(department,countDept.get(department) + 1);
				}
				else{
					totalSalary.put(department,salary);
					countDept.put(department,1);
				}
				
				empSalary.put(name,salary);
				
				//get age
				if(age <= 24){
					youngestEmp.add(name);
				}
				else{
					oldEmp.add(name);
				}
			}
			//average salary based on department
			for(Map.Entry<String,Double> map : totalSalary.entrySet()){
				System.out.println("Average salary for "+map.getKey()+" = "+map.getValue()/countDept.get(map.getKey()));
			}
			
			//youngest vs oldest
			System.out.println("\nYoungest employees list: "+youngestEmp);
			System.out.println("oldest employees list: "+oldEmp);
			
			//top-earning
			System.out.print("\nEnter N to display top N earning : ");
			int n = sc.nextInt();
			empSalary.entrySet().stream().sorted((e1,e2) -> Double.compare(e2.getValue(),e1.getValue())).limit(n).forEach(e -> System.out.println(e.getKey()+" salary = "+e.getValue()));
		
		}catch(IOException e){
			System.out.println(e);
		}
		
	}
}