package comp;

import java.util.Iterator;
import java.util.TreeSet;

public class TestComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Student> ts=new TreeSet<Student>();
		ts.add(new Student(1064, "rj", "dac"));
		ts.add(new Student(14, "rj2", "aac"));
		ts.add(new Student(164, "rj3", "ac"));
		//System.out.println(ts);
		Iterator<Student> it=ts.iterator();
		while(it.hasNext())
		{
		
			Student s = new Student();
			s=it.next();
			System.out.println(s.toString());
		}
	}

}
