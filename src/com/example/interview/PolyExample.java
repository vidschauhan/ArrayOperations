package com.example.interview;

import java.util.Map;
import java.util.TreeMap;

public class PolyExample {

	public static void main(String[] args) {
		/*
		 * Integer i = null; 
		 * int k = i; 
		 * System.out.println(k); // Runtime Exception.
		 */

		/*
		 * int x; 
		 System.out.println(x); Compilation error. You have to initialize the variable to sysout.
		 */

		/*
		 * MyThread th = new MyThread(); 
		   th.start();
		 */ // no output.

		/*
		 * Map<String,String> map = new TreeMap<String,String>(); 
		 * map.put("Vidit","Hi"); 
		 * map.put(null, "Hello");
		 * 
		 * System.out.println(map.size()); //NullPointer Exception
		 */

		/*
		 * ABC a = new ABC(); 
		 * a.m(10,10); // compilation error due to ambiguous method (int,double) and (double,int)
		 */

		/*
		 * Note note = new Book(); 
		 * note.show(10); compilation error as show(args) is not
		 * present in Note for overriding.
		 */

		/*
		 * StaticBlock st = new StaticBlock(); 
		 * st.show();
		 */

		/*
		 * Return rt = new Return(); 
		 * System.out.println(rt.returnVal()); // As return
		 * has already been executed so even if the value changes in finally block,no
		 * effect on hanged variable value.
		 */
		
		Checker check = new Checker();
		boolean result = check.isBalanced("([[[]]][]{{))((}})");
		System.out.println(result);

	}

}

class MyThread extends Thread {
}

class Return {
	public int returnVal() {
		int x = 2;
		try {
			return x;
		} catch (Exception ex) {
			x = 5;
		} finally {
			x = 10;
		}
		return x;
	}
}

class ABC {
	public void m(int x, double y) {
		System.out.println("int,double");
	}

	public void m(double x, double y) {
		System.out.println("double,double");
	}

	public void m(double x, int y) {
		System.out.println("double,int");
	}
}

class Note {
	public void show() {
		System.out.println("Note Show");
	}
}

class Book extends Note {
	public void show(int x) {
		System.out.println("Book Show" + x);
	}
}

class StaticBlock {
	static {
		System.out.println("1");
	}
	{
		System.out.println("2");
	}

	public void show() {
		System.out.println("3");
	}

	{
		System.out.println("4");
	}
}

class Checker{
	public boolean isBalanced(String str) {
	    if (str.length() == 0) {
	        return true;
	    }
	    if (str.contains("()")) {
	        return isBalanced(str.replaceFirst("\\(\\)", ""));
	    }

	    if (str.contains("[]")) {
	        return isBalanced(str.replaceFirst("\\[\\]", ""));
	    }
	    if (str.contains("{}")) {
	        return isBalanced(str.replaceFirst("\\{\\}", ""));
	    } else {
	        return false;
	    }
	}
}