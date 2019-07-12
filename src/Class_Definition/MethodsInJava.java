package Class_Definition;

import java.util.Arrays;

public class MethodsInJava {
    int empID;
    int empSalary;
    String empName;
    String empAddress;

    int weekHours[];

    public static void main(String[] args) {

        //calling default constructor
        MethodsInJava obj = new MethodsInJava();

        obj.setEmpID(11);
        obj.getEmpID(11);

        int hours[] = {8,9,8,9,9};
        obj.getWeekHours(hours);

    }

    public int setEmpID(int empID){
        this.empID =empID;
        return empID;
    }

    public int getEmpID(int empID){
        System.out.println(empID);
        return empID;

    }

    int[] getWeekHours(int [] arr){

        weekHours = arr;
        //Converting array to string
        System.out.println(Arrays.toString(weekHours));

        return weekHours;

    }
}
