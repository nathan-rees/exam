package main;

import java.util.ArrayList;

public class OfflineExercises {

	// Given a string, return a string where
	// for every char in the original string,
	// there are three chars.

	// multChar("The") → "TTThhheee"
	// multChar("AAbb") → "AAAAAAbbbbbb"
	// multChar("Hi-There") → "HHHiii---TTThhheeerrreee"

	public String multChar(String input) {
		char[] arr=input.toCharArray();
		String str="";
		for(int i=0;i<arr.length;i++)
		{
			str=str+arr[i];
			str=str+arr[i];
			str=str+arr[i];
		}
		return str;
	}
	
	// Return the string (backwards) that is between the first and last appearance
	// of "bert"
	// in the given string, or return the empty string "" if there is not 2
	// occurances of "bert" - Ignore Case

	// getBert("bertclivebert") → "evilc"
	// getBert("xxbertfridgebertyy") → "egdirf"
	// getBert("xxBertfridgebERtyy") → "egdirf"
	// getBert("xxbertyy") → ""
	// getBert("xxbeRTyy") → ""

	public String getBert(String input) {
		String lol=input.toLowerCase();
		String str="";
		char[] ar=input.toCharArray();
		int a=lol.indexOf("bert");
		int b=lol.lastIndexOf("bert");
		for(int i=a+4;i<b;i++)
		{
			str=str+ar[i];
		}
		return str;
	}

	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large. Do not assume the ints will come to you in a reasonable
	// order.

	// evenlySpaced(2, 4, 6) → true
	// evenlySpaced(4, 6, 2) → true
	// evenlySpaced(4, 6, 3) → false
	// evenlySpaced(4, 60, 9) → false

	public boolean evenlySpaced(int a, int b, int c) {
//		int[] arr= {a,b,c};
		
		int x,xx,xxx;
		x=Math.abs(a-b);
		xx=Math.abs(b-c);
		xxx=Math.abs(a-c);
		if(x==xx||x==xxx||xx==xxx)
		{
			return true;
		}
		
		return false;
	}

	// Given a string and an int n, return a string that removes n letters from the 'middle' of the string.
	// The string length will be at least n, and be odd when the length of the input is odd.

	// nMid("Hello", 3) → "Ho"
	// nMid("Chocolate", 3) → "Choate"
	// nMid("Chocolate", 1) → "Choclate"

	public String nMid(String input, int a) {
		
		ArrayList<String> haha=new ArrayList<String>();
		int mid=(input.length()-1)/2;
		ArrayList<Integer> lol=new ArrayList<Integer>();
		lol.add(mid);//lol is the list of chars going to be ignored
		for(int i=0;i<a-1/2;i++) {
			lol.add(mid+1);
			lol.add(mid-i);
		}
		
		for(int i=0;i<input.length();i++)
		{
			boolean ignored=false;
			for(int j=0;j<lol.size();j++)
			{
				if(i==lol.get(i))//if it is going to be ignored
				{
					ignored=true;
				}
			}
			if(!ignored)
			{
				haha.add(input.substring(i, i));
			}
		}
		
		
		return "";
		
	}

	// Given a string, return true if it ends in "dev". Ignore Case

	// endsDev("ihatedev") → true
	// endsDev("wehateDev") → true
	// endsDev("everoyonehatesdevforreal") → false
	// endsDev("devisnotcool") → false

	public boolean endsDev(String input) {
		String s=input.toLowerCase();
		if(s.endsWith("dev"))
		{
			return true;
		}
		return false;
	}

	// Given a string, return the length of the largest "block" in the string.
	// A block is a run of adjacent chars that are the same.
	//
	// superBlock("hoopplla") → 2
	// superBlock("abbCCCddDDDeeEEE") → 3
	// superBlock("") → 0

	public int superBlock(String input) {
		int count=1;
		char[] s=input.toCharArray();
		int temp=1;
		if(input.equals(""))
		{
			return 0;
		}
		for(int i=0;i<s.length-1;i++)
		{
			if(temp>count)
			{
				count=temp;
			}
			if(s[i]==s[i+1])
			{
				temp++;
				continue;
			}else
			{
				
				temp=1;
			}
			
			
			
		
			
		}
		return count;

	}
	
	//given a string - return the number of times "am" appears in the String ignoring case -
	// BUT ONLY WHEN the word "am" appears without being followed or proceeded by other letters
	//
	//amISearch("Am I in Amsterdam") → 1
	//amISearch("I am in Amsterdam am I?") → 2
	//amISearch("I have been in Amsterdam") → 0

	public int amISearch(String arg1) {
		String ss=arg1.toLowerCase();
		char[] s=ss.toCharArray();
		int count=0;
		if(s[0]=='a'&&s[1]=='m'&&s[2]==' ')
		{
			count++;
		}
		for(int i=2;i<s.length-3;i++)
		{
			
			if (s[i-1]==' '&&s[i]=='a'&&s[i+1]=='m'&&s[i+2]==' ')			
			{
				count++;
			}
			
		}
		return count;
		
	}
	
	//given a number 
	// if this number is divisible by 3 return "fizz"
	// if this number is divisible by 5 return "buzz"
	// if this number is divisible by both 3  and 5return "fizzbuzz"
	//
	//fizzBuzz(3) → "fizz"
	//fizzBuzz(10) → "buzz"
	//fizzBuzz(15) → "fizzbuzz"
	
	public String fizzBuzz(int arg1) {//---------------------------------------------------------------
		if(arg1%3==0&&arg1%5==0) 
		{
			return "fizzbuzz";
		}
		if(arg1%3==0)
		{
			return "fizz";
		}
		if(arg1%5==0)
		{
			return "buzz";
		}
		return null;
		
	}
	
	//Given a string split the string into the individual numbers present
	//then add each digit of each number to get a final value for each number
	// String example = "55 72 86"
	//
	// "55" will = the integer 10
	// "72" will = the integer 9
	// "86" will = the integer 14
	//
	// You then need to return the highest vale
	//
	//largest("55 72 86") → 14
	//largest("15 72 80 164") → 11
	//largest("555 72 86 45 10") → 15
	
	public int largest(String arg1) {
		String[] arr=arg1.split(" ", 0);//splits to 55 72 86
		ArrayList<Integer> ar = new ArrayList<Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=0;j<arr[i].length();j++)
			{
			count+=Integer.valueOf(arr[i]);	
			}
			
			ar.add(count);
			count=0;
		}
		int max=0;
		for(int a:ar)
		{
			if (a>max)
			{
				max=a;
			}
		}
		return max;
		
	}
	
	
}
