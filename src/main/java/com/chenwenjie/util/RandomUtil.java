package com.chenwenjie.util;

import java.util.HashSet;
import java.util.Random;

import org.junit.Test;

public class RandomUtil {

	//方法1：返回min-max之间的随机整数
	
	public static int random(int min,int max) {
		
		Random r = new Random();
		
		int num = r.nextInt(max-min+1)+min;
//		System.out.println(num);
		return num;
	}
	
	//方法2：在最小值min与最大值max之间截取subs个不重复的随机数。
	public static int[] subRandom (int min,int max,int subs) {
		
		int[] x = new int[subs];
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		while(set.size()!=subs) {
			set.add(random(min, max));
		}
		
		int i = 0;
		for (Integer integer : set) {
			x[i] = integer;
			i++;
		}
		return x;
	}
	
	//方法3：返回1个1-9,a-Z之间的随机字符
	 public static char randomCharacter() {
		 
		 String str = "123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
		 
		 return str.charAt(random(0, str.length()-1));
		 
	 }
	
	//方法4：返回参数length个字符串(5分)，方法内部要调用randomCharacter()方法
	 public static String randomString(int length) {
		 
		 String str = "";
		 for (int i = 0; i<length ; i++) {
			
			 str += randomCharacter();
		}
		 
		 return str;
	 }
	 
}
