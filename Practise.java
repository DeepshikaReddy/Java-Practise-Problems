package com.example.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.*;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.example.model.Client;

public class Practise {

	public static void main(String[] args) {
//		sortByName();
//		numDupCharacters();
//		reverseStringMethods();
//		fibSeries();
//		swapNumbers();
//		fact();
//		revrseLinkedlist();
//		secondLargest();
		// removeStringList();
//		arraySameCharcaters();
//		removeDupliArrayList();
//		oddNumberFreq();
//		missingNumber();
//		dupNumberArray();
//		sumElements();
//		findCommonElements();
//		sortHashMap();
//		streamExamples();

	}

	// Sort by Name
	static void sortByName() {
		List<Client> list = new ArrayList<>();
		Client c1 = new Client();
		c1.setFirstName("Deepshik");
		c1.setCountry("USA");
		Client c2 = new Client();
		c2.setFirstName("Reddy");
		c2.setCountry("India");
		list.add(c1);
		list.add(c2);
		Collections.sort(list, Comparator.comparing(Client::getCountry));
		System.out.println(list);
	}

	// Find num of duplicate chracters with count.
	static void numDupCharacters() {
		Scanner sc = new Scanner(System.in);
		String stringVal = sc.next();
		System.out.println(stringVal);
		HashMap<Character, Integer> hp = new HashMap<>();
		char[] charArray = stringVal.toCharArray();

		for (Character ch : charArray) {
			if (hp.containsKey(ch)) {
				hp.put(ch, hp.get(ch) + 1);
			} else {
				hp.put(ch, 1);
			}
		}
		System.out.println(hp);
		sc.close();
	}

	// Reverse an string
	static void reverseStringMethods() {
		String name = "Deepshika";
		char[] arr = name.toCharArray();
		StringBuffer sb = new StringBuffer();
		for (int i = arr.length - 1; i >= 0; i--) {
			sb.append(arr[i]);
		}

		System.out.println(sb);
	}

	// fib series
	static void fibSeries() {
		int i1 = 0, i2 = 1, n = 10;
		int sum = 0;
		List<Integer> ls = new ArrayList<>();
		ls.add(i1);
		ls.add(i2);
		for (int index = 0; index <= n; index++) {
			sum = i1 + i2;
			ls.add(sum);
			i1 = i2;
			i2 = sum;
			sum = 0;
		}
		System.out.println(ls);

	}

	// swap numbers
	static void swapNumbers() {

		int a = 3;
		int b = 5;

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.print(a);
		System.out.print(b);

	}

	// factorial
	static void fact() {
		int n = 3;
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}

	// TReverse Linkelist,
	static void revrseLinkedlist() {
		List<Integer> ls = new ArrayList<>();
		ls.add(9);
		ls.add(4);
		ls.add(5);

		ListIterator<Integer> li = ls.listIterator();

		while (li.hasNext()) {
			System.out.println(li.next());
		}
		Collections.reverse(ls);
		System.out.println(ls);

	}

	// Find second largest element in array.
	static void secondLargest() {
		int[] arra = { 1, 8, 5, 7, 10, 9 };
		Arrays.sort(arra);
		for (int a : arra) {
			System.out.println(a);
		}
		System.out.println(arra[arra.length - 2]);
	}

	// Remove string from List
	static void removeStringList() {
		List<String> ls = new ArrayList<>();
		ls.add("BAC");
		ls.add("bye");
		ls.add("hi");

		if (ls.contains("hi")) {
			ls.remove("hi");
		}

		System.out.println(ls.toString());
	}

	// Check if strings have same character.
	static void arraySameCharcaters() {
		String s1 = "Deeps";
		String s2 = "dSiee";
		if (s1.length() != s2.length()) {
			System.out.println("not equal;");
			return;
		} else {
			char[] s1char = s1.toLowerCase().toCharArray();
			char[] s2char = s2.toLowerCase().toCharArray();
			Arrays.sort(s1char);
			Arrays.sort(s2char);
			if (Arrays.equals(s1char, s2char)) {
				System.out.println("equal;");
			} else {
				System.out.println("not equal;;");
			}
		}

	}

	// Remove duplicates from Arraylist.
	static void removeDupliArrayList() {
		List<String> ls = new ArrayList<>();
		ls.add("BAC");
		ls.add("bye");
		ls.add("hi");
		ls.add("hi");
		Set<String> set = new TreeSet<>(ls);
		System.out.println(set);
		ls.clear();
		ls.addAll(set);
//		System.out.println(ls);

		// Without using Set.
		List<String> unique = new ArrayList<>();
		for (int i = 0; i < ls.size(); i++) {
			if (!unique.contains(ls.get(i))) {
				unique.add(ls.get(i));
			}

			System.out.println(unique);

		}
	}

	// Odd numbers and their frequency?
	static void oddNumberFreq() {
		// Return ArrayList with OddNumber and their count
		List<Integer> ls = new ArrayList<>();
		ls.add(1);
		ls.add(3);
		ls.add(9);
		ls.add(2);
		ls.add(0);

		ListIterator<Integer> li = ls.listIterator();
		List<Integer> newLs = new ArrayList<>();

		int count = 0;

		while (li.hasNext()) {
			int ele = li.next();
			if (ele % 2 != 0) {
				count = count + 1;
				newLs.add(ele);

			}
		}
		System.out.println(newLs);
		System.out.println(count);

	}

	// Misisng number in array?
	static void missingNumber() {
		int[] a = { 1, 3, 4, 5, 6, 7, 8 };
		int sum = 0;
		int sum1 = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		for (int i = 0; i <= a.length + 1; i++) {
			sum1 = sum1 + i;
		}

		int diff = sum1 - sum;
		System.out.println(diff);
	}

	// Remove duplicate elements in Array.
	static void dupNumberArray() {
		int[] arr = { 1, 2, 3, 3, 4, 45, 1, 2, 1, 1, 1, 1, 1, 11 };
		List<Integer> arrDup = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];

			if (!arrDup.contains(num)) {
				System.out.println(arr[i]);
				arrDup.add(arr[i]);
			}
		}
		System.out.println(arrDup.toString());

	}

	// all pairs of numbers whose sum is equal to given number.
	static void sumElements() {
		int[] arr = { 1, 3, 5, 7, 9 };
		int sum = 10;
		List<Integer> arrList = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == sum) {
					arrList.add(arr[i]);
					arrList.add(arr[j]);
				}
			}

		}
		arrList.stream().forEach(System.out::println);

	}

	static void findCommonElements() {
		int[] arr1 = { 1, 5, 10, 20, 40, 80 };
		int[] arr2 = { 6, 7, 20, 80, 100 };
		int[] arr3 = { 3, 4, 15, 20, 30, 70, 80, 120 };

		int i = 0, j = 0, k = 0;
		while (i < arr1.length && j < arr2.length && k < arr3.length) {
			if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
				System.out.print(arr1[i] + " ");
				i++;
				j++;
				k++;
			} else if (arr1[i] < arr2[j])
				i++;
			else if (arr2[j] < arr3[k])
				j++;
			else
				k++;
		}
	}

	// Stort Hashmap by keys and values.
	static void sortHashMap() {

		Map<String, Integer> hp = new HashMap<String, Integer>();
		hp.put("ABC", 2);
		hp.put("ABCF", 1);
		hp.put("DEF", 2);

		// Sort by Keys?
		Map<String, Integer> treemap = new TreeMap<String, Integer>(hp);
		treemap.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + ":" + entry.getValue()));

		// Sort by Values ?
		LinkedHashMap<String, Integer> sortedMap = hp.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue,
						LinkedHashMap<String, Integer>::new));
		System.out.println("\nSort by Values\n");
		sortedMap.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + ":" + entry.getValue()));

	}
	
	//Binary Search on Sorted Array
	 public static int binarySearch(int[] arr, int x) {
    	//Your code goes here
        int start =0;
        int end = arr.length-1;
        int mid =0;
        //x=12
        while(start<= end){
            mid = (start+end)/2;
            // System.out.println("<<>>>>");
            // System.out.println(mid);
            // System.out.println(start);
            // System.out.println(end);
            // System.out.println("<<>>>>");
                if(arr[mid]==x){
                    return mid;
                }else if(arr[mid]<x){
                   start = mid+1; 
                }else if(arr[mid] > x){
                    end = mid -1;
                }
        }

        return -1;


    }

	static void streamExamples() {


    List<Integer> al = Arrays.asList(10,15,20,11);
    
    //find even numbers 
    al.stream().filter(n-> n % 2 !=0).forEach(System.out::println);

    //numbers starting with 1
    al.stream().map(s-> s+"").filter(s-> s.startsWith("1")).forEach(System.out::println);

    //duplicate elements in list ?
    Set<Integer> set = new HashSet<>();
    al.stream().map( n -> !set.add(n)).forEach(System.out::println);
    al.stream().findFirst().orElse(null);
    al.stream().count();
    al.stream().max(Integer::compare).get();
    
  //find first non-repeated character in String.
    String str = "Hello World"; 
            str.chars()
    	    .mapToObj(n -> (char)n) //similar to map but is used for chracters .
    	    .filter(c -> str.indexOf(c) == str.lastIndexOf(c))
    	    .findFirst().orElse(null);

	//first repeated characters
	//str.indexOf(c) != str.lastIndexOf(c);
	
	//Sort all values
	al.stream().sorted().forEach(System.out::println);
	
	//Sort by descending order
	al.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
	
	//Convert List of String into Integers
	List<String> stringList = Arrays.asList("1", "2", "3", "4", "5");
	stringList.stream()
            .map(Integer::parseInt)
            .collect(Collectors.toList()).forEach(System.out::println);

	  }
	


}
