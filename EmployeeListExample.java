package NSE;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class EmployeeListExample {
    public static void main(String[] args) {
        //TODO Auto-generated method stub
        List<Emp> ar = new LinkedList();
        Emp e1 = new Emp(1001, "sham", "IT");
        Emp e2 = new Emp(9821, "Sunita", "Marketing");
        Emp e3 = new Emp(5329, "Stark", "QA");
        Emp e4 = new Emp(2245, "Steven", "Operator");
        ar.add(e1);
        ar.add(e2);
        ar.add(e3);
        ar.add(e4);
        System.out.println(ar);
        Iterator itr = ar.iterator();
        while (itr.hasNext()) {
            Emp e = (Emp) itr.next();
            System.out.println(e.empid + "" + e.name + "" + e.dept);
        }
        //by useing the enhanced for loop
        System.out.println("By using for loop");
        for (Emp e : ar) {
            System.out.println(e.empid + "" + e.name + "" + e.dept);
        }
        ar.forEach(System.out::println);
    }
}
