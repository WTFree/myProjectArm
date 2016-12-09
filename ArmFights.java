import java.util.*;
import java.io.*;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ArmFights {

	public static void main(String[] args) {

		ArrayList<Ka4ok> fighter = new ArrayList<>();
		//f1 = fighter 1, f2 = -//- 2, .... fn = fighter n;
		Ka4ok f1 = new Ka4ok(); 
		Ka4ok f2 = new Ka4ok("Witaly", 22, 88);
		Ka4ok f3 = new Ka4ok("Anton", 20, 70, 25,55215);
		Ka4ok f4 = new Ka4ok("Petro",22,125,65,28);
		Ka4ok f5 = new Ka4ok("Ivan",51,52,21,15,51);
		Ka4ok f6 = new Ka4ok("Winner",25,80,54,64,1,700,244);
		Ka4ok f7 = new Ka4ok("Jan",25,90,64,125,64,21,100);
		
		fighter.add(f1);
		fighter.add(f2);
		fighter.add(f3);
		fighter.add(f4);
		fighter.add(f5);
		fighter.add(f6);
		fighter.add(f7);
		
		double max;
		max = -1.1;
	
		ArrayList<Double> TOP = new ArrayList<>();
		
		for (Ka4ok x : fighter){
			
			TOP.add(x.max());
			
		}
		
		Double Max[]=new Double[TOP.size()];
		TOP.toArray(Max);
		System.out.println();
		Arrays.parallelSort(Max);
		Ka4ok.maximum(Max);
		System.out.println(Max + "\n" + Ka4ok.maximum(Max));
		
		
		
		for ( Ka4ok x : fighter) {
			
			if(max < x.max()){
				max = x.max();
			}
	
			System.out.println(x.name + " has " +x.max());
			System.out.println(max);
		}
		
		ABC abc = new ABC();
		
	}

}
