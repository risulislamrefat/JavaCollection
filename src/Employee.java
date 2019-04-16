import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Employee {
	public String id;
	public String name;
	public String salary;
	public String dept;

	public void removeFromTo(int from, int to, LinkedList<String> list) {
		list.subList(from, to);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String[] data = { "1", "Refat", "200", "CSE" };
//		String[] data1 = { "2", "Ria", "300", "EEE" };
//		String[] data2 = { "1", "Refat", "200", "CSE" };
//		ArrayList EmployeeList = new ArrayList<>();
//
//		/*
//		 * EmployeeList.add("Kamrul"); EmployeeList.add("23"); EmployeeList.add("100");
//		 * EmployeeList.add(data[3]);
//		 */
//		for (int i = 0; i < data.length; i++) {
//			EmployeeList.add(data[i]);
//		}
//
//		ArrayList EmployeeList2 = new ArrayList<>();
//		for (int i = 0; i < data1.length; i++) {
//			EmployeeList2.add(data1[i]);
//		}
//		// EmployeeList.clear();
//
//		EmployeeList.addAll(2, EmployeeList2);
//
//		// Collections.reverse(EmployeeList);
//
//		System.out.println(EmployeeList);
//		List<String> list = new ArrayList<>();
//
//		LinkedList<String> lnkdList = new LinkedList<String>();
//		// lnkdList.add("Refat");
//		// lnkdList.add("Ana");
//		// lnkdList.add("Ria");
//		// lnkdList.add(2, "two");
//		// lnkdList.add("Three");
//
//		// lnkdList.addFirst("AddFirst");
//		// lnkdList.subList(2, 4).clear();
//
//		// System.out.println(lnkdList);
//		// removeFromTo(2,4,lnkdList);
//		String[] bKash = { "1", "2", "3", "4", "5" };
//		String[] payPal = { "6", "7", "8" };
//		for (String s : bKash)
//			lnkdList.add(s);
//		for (String s : payPal)
//			lnkdList.add(s);
//		
//		LinkedList<String> bKashList = new LinkedList<String>();
//		bKashList.addAll(lnkdList.subList(0, 5));
//		
//		LinkedList<String> payPalList = new LinkedList<String>();
//		payPalList.addAll(lnkdList.subList(5, 8));
//		
//		System.out.println("bKashList" + bKashList);
//		System.out.println("payPalList" + payPalList);
//		
//		String[] bKashGetArray= bKashList.toArray(new String[bKashList.size()] );
//		
//		for(String s: bKashGetArray)
//			System.out.println(s);
		
		Stack<String> stcList = new Stack<>();
		stcList.push("One");
		stcList.push("Two");
		stcList.push("Three");
		
		stcList.pop();
		System.out.println(stcList);
		
		

	}

}
