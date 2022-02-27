package NSE;
import java.util.Set;
import java.util.TreeSet;
import java.util.List;

class Emp extends Object {
    int empid;
    String name;
    String dept;

    public Emp() {
    }

    public Emp(int empid, String name, String dept) {
        super();
        this.empid = empid;
        this.name = name;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "employee [empid" + empid + ",name=" + name + ",dept=" + dept + "]";
    }

}
