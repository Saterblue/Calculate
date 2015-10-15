import java.util.*;
import java.text.*;
import java.util.regex.*;

public class SameWorlds {
	/**
	@param 
	String[] a 
	an array witch need dispel the same elements and padding with the behind elements
	return a new array 
	*/
	public String[] foo(String[] a) {
		String[] temp = a;
		int length = a.length;
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (temp[i].equals(temp[j])) {
		//if find the same elements change the local and return the worth length
					length = disSamWods(temp, i, j, length);
				}
			}
		}
		//final String[] array
		String[] fin = new String[length];
		for (int i = 0; i < length; i++) {
			fin[i] = temp[i];
		}
		return fin;
	}
	/**
	@param 
	String[] a  which sequence of array need remove the same words
	int m   the index first occur in the array
	int n   the index next time occur in the array
	int length which length of array you wanna remove
	*/
	private int disSamWods(String[] a, int m, int n, int leng) {
		//when remove succese,the length will decrease 1
		int length = leng;
		//the length between m-n
		int x = n - m;
		// temp array to restore the among elements
		String[] temp = new String[n - m - 1];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = a[m + 1 + i];
		}
		//change the among elements intead of elements behind n
		for (int i = 0; i < length - n; i++) {
			a[m + i] = a[n + i];
		}
		// append the temp behind the latest worth element
		int start = length - x;
		for (int i = 0; i < temp.length; i++) {
			a[start + i] = temp[i];
		}
		length--;
		// return the worth length
		return length;
	}

	//Just for test
	public static void main(String[] arg) throws Exception {
		//a situation about the below String
		String s="programming is hard but enjoy but I enjoy it is hard";
		//Split the String into an array
		String[] arr=s.split(" ");
		SameWorlds sw=new SameWorlds();
		arr=sw.foo(arr);
		S(arr);
	}	
	public static void S(Object[] obj) {
		System.out.println(Arrays.toString(obj));
	}
}
