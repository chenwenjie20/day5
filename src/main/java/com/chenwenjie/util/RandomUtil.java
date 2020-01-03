package com.chenwenjie.util;

import java.util.HashSet;
import java.util.Random;

import org.junit.Test;

public class RandomUtil {

	//����1������min-max֮����������
	
	public static int random(int min,int max) {
		
		Random r = new Random();
		
		int num = r.nextInt(max-min+1)+min;
//		System.out.println(num);
		return num;
	}
	
	//����2������Сֵmin�����ֵmax֮���ȡsubs�����ظ����������
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
	
	//����3������1��1-9,a-Z֮�������ַ�
	 public static char randomCharacter() {
		 
		 String str = "123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
		 
		 return str.charAt(random(0, str.length()-1));
		 
	 }
	
	//����4�����ز���length���ַ���(5��)�������ڲ�Ҫ����randomCharacter()����
	 public static String randomString(int length) {
		 
		 String str = "";
		 for (int i = 0; i<length ; i++) {
			
			 str += randomCharacter();
		}
		 
		 return str;
	 }
	 
}
