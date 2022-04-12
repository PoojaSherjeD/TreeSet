import java.util.TreeSet;

public class TreeSetSorting {

	public static void main(String[] args) {
		IdComparator idc=new IdComparator();
		NameCompartor nc=new NameCompartor();
		TreeSet ts=new TreeSet(nc);
		TreeSet ts1= new TreeSet(idc);
		Emp e1=new Emp(30,"BBB");
		Emp e2=new Emp(50,"DDD");
		Emp e3=new Emp(70,"CCC");
		Emp e4=new Emp(10,"AAA");
		ts1.add(e1);
		ts1.add(e2);
		ts1.add(e3);
		ts1.add(e4);
		System.out.println(ts1);
		
		
		

	}

}
