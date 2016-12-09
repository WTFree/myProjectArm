import java.util.Arrays;
import java.io.*;
import java.util.*;

final class ABC{
	
	ABC(){
		System.out.println("allo ja tyt");
	}
}

class Testy{
	
	Testy(){System.out.println("Object was creating");}
	
	public boolean isUniqueChars(String str){     //унікальні символи в стрінгу ASCII Lakman
		if(str.length()>256) return false;
		
		boolean[] char_set = new boolean[256];
		for (int i = 0; i<str.length();i++){
			int val = str.charAt(i);
			if(char_set[val]){
				return false;
			}
			char_set[val] = true;
		}
		return true;
	}
	
	public boolean unikalniy(String str){        // -// - // - // - // - // - // - // MINE
		
		int count = 0;
		
		for(int i=0; i<str.length()-1;i++ ){
		
			char str1 = str.charAt(i);
			
			for (int j = i+1; j < str.length(); j++){
				
				char str2 = str.charAt(j);
				
				System.out.println("char1 " + str1 + " char2 " + str2 + " i = " + i + " j = " + j);
				
				if(str1 == str2){	
					count++;
				}
			
			} 
			
		}
		
		if (count==0)return true;
		else return false;	
	
	}//end my cycle 	

	

	public String sortes(String st){
		char[] str = st.toCharArray();
		Arrays.parallelSort(str);
		return new String(str);
	}
	
	public boolean permutation(String s, String t){
		
		if(s.length() != t.length()){
			return false;		
		}
		
		else return sortes(s).equals(t);	
	}
	
}



public class Testoviy {
	public static void main(String[] args)throws IOException{
	
		
		StringBuffer buffer = new StringBuffer();
		try(	
				FileInputStream myFile = new FileInputStream("that.txt");
				InputStreamReader inputStreamReader = new InputStreamReader(myFile, "UTF8");
				Reader reader = new BufferedReader(inputStreamReader);){
				
				int ch;
				while((ch = reader.read())>-1){
					buffer.append((char)ch);
				}
				
				String result = buffer.toString();
				
			}
			
			catch(IOException e){
				System.out.println("Your exeption its - " + e.toString());
			}
		
		
		Map<Ka4ok,Ka4ok> abc = new HashMap<>();
		Ka4ok f1 = new Ka4ok();
		abc.put(f1, null);
		HashMap<Integer,Ka4ok> cba = new HashMap<>();
		for(int i=0; i<100; i++){
			cba.put(i, new Ka4ok());
		}
		
		cba.forEach((k,v)->System.out.println("key "+k+" Value "+ v));
		
		Testy ob = new Testy();
		
		System.out.println("slovo abcdefa  " + ob.isUniqueChars("abcdefa") + 
				"  slovo abcdlox  " + ob.isUniqueChars("abcdlox") );
		System.out.println("slovo aa " + ob.unikalniy("aa") + 
				"  slovo abc  " + ob.unikalniy("abc") );
	
	}
	
}
