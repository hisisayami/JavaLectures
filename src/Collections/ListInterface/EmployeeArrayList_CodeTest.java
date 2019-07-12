package Collections.ListInterface;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeArrayList_CodeTest {

    public static void main(String[] args) {


        //POJO plain old java objects class
        //Adding employee info via setter
        ArrayList<Employee_CodeTest> emp = new ArrayList<>();
        Employee_CodeTest emp2 = new Employee_CodeTest();
        emp2.setEmpFullname("Hisi");
        emp2.setEmpaddress("2201 county rd");
        emp2.setEmpID(23);
        emp2.setEmpDepartmen("Office");

        //Adding employee info via calling constructor
        Employee_CodeTest newemp = new Employee_CodeTest(1222, "Maddy","234 st.","cashier");


        emp.add(emp2);
        emp.add(newemp);

        System.out.println(emp);

        Iterator<Employee_CodeTest> iterator = emp.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
