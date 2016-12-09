import java.util.*;

abstract class Athlete {
	
	protected String name;
	protected double weight;
	protected double age;
	
	Athlete(){
		
		String name = "name not identify";
		double age = -1;
		double weight = -1;
		
		this.name = name;
		this.age = age;
		this.weight = weight;
		
	}	
	
	Athlete(String name, double age,double weight){
		
		this.name = name;
		this.age = age;
		this.weight = weight;
		
	}
	
	String person(){
		return "name = "+name+" , age = " +age+ " , weight = " +weight; 
	}
	
}

abstract class Armwrestler extends Athlete{
	
	protected double biceps,triceps,start,verx,kruk;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(biceps);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(kruk);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(start);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(triceps);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(verx);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Armwrestler other = (Armwrestler) obj;
		if (Double.doubleToLongBits(biceps) != Double.doubleToLongBits(other.biceps))
			return false;
		if (Double.doubleToLongBits(kruk) != Double.doubleToLongBits(other.kruk))
			return false;
		if (Double.doubleToLongBits(start) != Double.doubleToLongBits(other.start))
			return false;
		if (Double.doubleToLongBits(triceps) != Double.doubleToLongBits(other.triceps))
			return false;
		if (Double.doubleToLongBits(verx) != Double.doubleToLongBits(other.verx))
			return false;
		return true;
	}

	Armwrestler(){
		super();
	}
	
	Armwrestler(String name,double age,double weight){
		super(name,age,weight);
	}
	
	Armwrestler(String name, double age,double weight,double biceps,double triceps){
		super(name,age,weight);
		this.biceps = biceps;
		this.triceps = triceps;
		this.start = -1;
		this.verx = -1;
		this.kruk = -1;
	}
	
	Armwrestler(String name, double age,double weight,double biceps,double triceps,
			double start){
		super(name,age,weight);
		this.biceps = biceps;
		this.triceps = triceps;
		this.start = start;
		this.verx = -1;
		this.kruk = -1;
	}
	
	Armwrestler(String name, double age,double weight,double biceps,double triceps,
			double start,double verx){
		super(name,age,weight);
		this.biceps = biceps;
		this.triceps = triceps;
		this.start = start;
		this.verx = verx;
		this.kruk = -1;
	}
	
	Armwrestler(String name, double age,double weight,double biceps,double triceps,
			double start,double verx,double kruk){
		super(name,age,weight);
		this.biceps = biceps;
		this.triceps = triceps;
		this.start = start;
		this.verx = verx;
		this.kruk = kruk;
	}
	
	//ex => exercies
	
	abstract double ex1() ;
	abstract double ex2() ;
	abstract double ex3() ;
	abstract double ex4() ;
	abstract double ex5() ;
	abstract double ex6() ;
	abstract double ex7() ;
	abstract double ex8() ;
}

class Ka4ok extends Armwrestler{
	double rang;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(rang);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ka4ok other = (Ka4ok) obj;
		if (Double.doubleToLongBits(rang) != Double.doubleToLongBits(other.rang))
			return false;
		return true;
	}

	Ka4ok(){
		super();
	}
	
	Ka4ok(String name,double age,double weight){
		super(name,age,weight);
	}
	
	Ka4ok(String name, double age,double weight,double biceps,double triceps){
		super(name,age,weight);
		this.biceps = biceps;
		this.triceps = triceps;
		this.start = -1;
		this.verx = -1;
		this.kruk = -1;
	}
	
	Ka4ok(String name, double age,double weight,double biceps,double triceps,
			double start){
		super(name,age,weight);
		this.biceps = biceps;
		this.triceps = triceps;
		this.start = start;
		this.verx = -1;
		this.kruk = -1;
	}
	
	Ka4ok(String name, double age,double weight,double biceps,double triceps,
			double start,double verx){
		super(name,age,weight);
		this.biceps = biceps;
		this.triceps = triceps;
		this.start = start;
		this.verx = verx;
		this.kruk = -1;
	}
	
	Ka4ok(String name, double age,double weight,double biceps,double triceps,
			double start,double verx,double kruk){
		super(name,age,weight);
		this.biceps = biceps;
		this.triceps = triceps;
		this.start = start;
		this.verx = verx;
		this.kruk = kruk;
	}
	
	double ex1(){
		if(biceps >0){
		return biceps;}
		else{return -1;}
	}
	
	double ex2(){
		if(triceps >0){ 
		return triceps;}
		else{ return -1;}
	}
	
	double ex3(){
		double bt;
		bt = biceps +triceps;
		if(bt>0){
		return (biceps+triceps)/2;}
		else{return -1;}
	}
	
	double ex4(){
		double bt = biceps*1.5 +triceps*0.5;
		if (bt>0){		
		return (biceps*1.5 +triceps*0.5)/2;}
		else{return -1;}
	}
	
	double ex5(){
		double bt = biceps*start;
		if(bt>0){
		return biceps*start;}
		else return -1;
	}
	
	double ex6(){
		if (triceps*start>0){
		return triceps*start;}
		else return -1;
	}
	
	double ex7(){
		if(verx>0){
		return verx;}
		else return -1;
	}
	
	double ex8(){
		if(kruk>0){
		return kruk;}
		else return -1;
	}
	
	static Double maximum(Double[] A){
		Arrays.parallelSort(A);
		return A[0];
	}
	
	double max(){	
		double[] Ex = {ex1(),ex2(),ex3(),ex4(),ex5(),ex6(),ex7(),ex8()};
		Arrays.parallelSort(Ex);
		return Ex[0]; 
	}
}



