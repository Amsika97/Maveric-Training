package com.practice;
import java.util.*;

public class HashmapExample {
	public static void main(String[] args) {
		int i=0,r=0;
		int j = 0;
		HashMap <Integer,String> example = new HashMap <Integer,String>();
		example.put(1, "My Name is Anurag and Anurag works for Maveric");
		String abc = example.get(1);
		//System.out.println(abc);
		String bucket[] = abc.split("\\s");
		int k = bucket.length;
		//System.out.println("k"+k);
		for(int w =0; w<k; w++)
		{ 
		if (bucket[w].equals("Anurag"))
		{
		j= j+1;
		r = w;
		}
		}
		System.out.println("No. of Anurag written=" + j);
		//System.out.println("No.::" + r);
		bucket[r] = "I";
		String xyz = Arrays.toString(bucket);
		//System.out.println("Sentence:"+ xyz);
		example.replace(1,xyz);
		System.out.println("Sentence:"+ example);
			}
		
}

