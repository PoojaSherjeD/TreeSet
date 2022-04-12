
public class Emp implements Comparable<Emp>{
	int id;
	String name;
	public Emp()
	{
	}
	public Emp(int id,String name)
	{
		this.id=id;
		this.name=name;
		
	}
	@Override
	public String toString(){
		return "Employee{"+"id="+id+",name="+name +"}";
	}
	public int compareTo(Emp e) {
		if(e.id==this.id)
			return 0;
		else if(e.id>this.id)
			return -1;
		else
			return 4;
	}
	
	
	

}
