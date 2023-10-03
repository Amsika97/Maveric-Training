package com.practice;
import java.util.Arrays; // for using Arrays.toString()

public class Occurence {

	public static void main(String[] args) {
        int i=0,r=0;
		int j = 0;
		String abc = "My Name is Anurag and Anurag works for Maveric";
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
		System.out.println("Sentence:"+ xyz);
			}

}
