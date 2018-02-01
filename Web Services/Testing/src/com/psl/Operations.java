package com.psl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Operations {

	public boolean isOdd(int number) {
		return number % 2 == 1;
	}

	public boolean isEven(int number) {
		return number % 2 == 0;
	}

	public int sumOfList(List<Integer> list) {
		int returnSum = 0;
		for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
			returnSum += (Integer) iterator.next();
		}
		return returnSum;
	}

	public int productOfList(List<Integer> list) {
		int returnProduct = 1;
		for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
			returnProduct *= (Integer) iterator.next();
		}
		return returnProduct;
	}

	public ArrayList<Integer> oddNumbers(List<Integer> list) {
		ArrayList<Integer> returnList = new ArrayList<Integer>();
		for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
			Integer i = (Integer) iterator.next();
			if (isOdd(i))
				returnList.add(i);
		}
		return returnList;
	}

	public ArrayList<Integer> evenNumbers(List<Integer> list) {
		ArrayList<Integer> returnList = new ArrayList<Integer>();
		for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
			Integer i = (Integer) iterator.next();
			if (isEven(i))
				returnList.add(i);
		}
		return returnList;
	}

	public ArrayList<Integer> divisibleBy(List<Integer> list, int divisor) {
		ArrayList<Integer> returnList = new ArrayList<Integer>();
		if (divisor > 0)
			for (Iterator<Integer> iterator = list.iterator(); iterator
					.hasNext();) {
				Integer i = (Integer) iterator.next();
				if (i > 0 && i % divisor == 0)
					returnList.add(i);
			}
		else return null;
		return returnList;
	}

	public ArrayList<Integer> multiplesOf(List<Integer> list, int divisor) {
		ArrayList<Integer> returnList = new ArrayList<Integer>();
		if (divisor > 0)
			for (Iterator<Integer> iterator = list.iterator(); iterator
					.hasNext();) {
				Integer i = (Integer) iterator.next();
				if (i > 0 && i % divisor == 0)
					returnList.add(i);
			}
		return returnList;
	}

}
//	public void foobar(List<Integer> list) {
//		ArrayList<Integer> listOf3 = divisibleBy(list, 3);
//		ArrayList<Integer> listOf5 = divisibleBy(list, 5);
//		for (int i = 0; i <= 100; i++) {
//			boolean flag = false;
//			if (listOf3.contains(i)) {
//				System.out.print("foo ");
//				flag = true;
//			}
//			if (listOf5.contains(i)) {
//				System.out.print("bar ");
//				flag = true;
//			}
//			if (!flag)
//				System.out.print(i);
//			System.out.println();
//		}
//	}
//
//	public void planets(List<Integer> list) {
//		ArrayList<Integer> listOf3 = divisibleBy(list, 3);
//		ArrayList<Integer> listOf5 = divisibleBy(list, 5);
//		ArrayList<Integer> listOf9 = divisibleBy(list, 9);
//		for (int i = 0; i <= 100; i++) {
//			boolean flag = false;
//			if (listOf3.contains(i)) {
//				System.out.print("Earth ");
//				flag = true;
//			}
//			if (listOf5.contains(i)) {
//				System.out.print("Jupiter ");
//				flag = true;
//			}
//			if (listOf9.contains(i)) {
//				System.out.print("Pluto ");
//				flag = true;
//			}
//			if (!flag)
//				System.out.print(i);
//			System.out.println();
//		}
//	}



//public static void main(String[] args) {
//Operations operations = new Operations();
//
//operations.isOdd(1);
//operations.isOdd(2);
//List<Integer> list = new ArrayList<Integer>();
//list.add(0);
//list.add(1);
//list.add(2);
//list.add(3);
//list.add(4);
//list.add(5);
//list.add(6);
//list.add(7);
//list.add(8);
//list.add(9);
//list.add(15);
//list.add(27);
//list.add(45);
//System.out.println(0%3);
//System.out.println("Is 10 odd? "+ operations.isOdd(10));
//System.out.println("Is 11 odd? "+ operations.isOdd(11));
//System.out.println("Is 10 even? "+ operations.isEven(10));
//System.out.println("Is 11 even? "+ operations.isEven(11));
//
//System.out.println("Total in list is "+operations.sumOfList(list));
//System.out.println("Total in (1,2,3,4,5) is "+operations.sumOfList(1,2,3,4,5));
//
//System.out.println("Product in list is "+operations.productOfList(list));
//System.out.println("Product in (1,2,3,4,5) is "+operations.productOfList(1,2,3,4,5));
//
//System.out.println("Odd in list "+operations.oddNumbers(list));
//System.out.println("Odd in (1,2,3,4,5) is "+operations.oddNumbers(1,2,3,4,5));
//
//System.out.println("Even in list "+operations.evenNumbers(list));
//System.out.println("Even in (1,2,3,4,5) is "+operations.evenNumbers(1,2,3,4,5));
//
//System.out.println("Divisible by 3 in list "+operations.divisibleBy(list,3));
//System.out.println("Divisible by 3 in (1,2,3,4,5) "+operations.divisibleBy(3,1,2,3,4,5));
//
//System.out.println("Multiples of 7 in list "+operations.multiplesOf(list,7));
//System.out.println("Multiples of 7 in (1,2,3,4,5,6,7,8) "+operations.multiplesOf(7,1,2,3,4,5,6,7,8));
//
//System.out.println("Divisible by 3 and odd in list "+operations.oddAndDivisibleBy(list,3));
//System.out.println("Divisible by 3 and odd in (1,2,3,4,5,6,7,8) "+operations.oddAndDivisibleBy(3,1,2,3,4,5,6,7,8));
//
//System.out.println("Divisible by 3 and even in list "+operations.evenAndDivisibleBy(list,3));
//System.out.println("Divisible by 3 and even in (1,2,3,4,5,6,7,8) "+operations.evenAndDivisibleBy(3,1,2,3,4,5,6,7,8));
//
//System.out.println("Foo-Bar Test");
//operations.foobar(list);
//System.out.println();
//
//System.out.println("Planet Test");
//operations.planets(list);
//System.out.println();
//}
