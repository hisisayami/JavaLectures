package Collections.ListInterface;

public  class Employee_CodeTest   {
    private int empID;
    private String empFullname;
    private String empaddress;
    private String empDepartmen;

    public Employee_CodeTest() {
    }


    public Employee_CodeTest(int empID, String empFullname, String empaddress, String empDepartmen) {
        this.empID = empID;
        this.empFullname = empFullname;
        this.empaddress = empaddress;
        this.empDepartmen = empDepartmen;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpFullname() {
        return empFullname;
    }

    public void setEmpFullname(String empFullname) {
        this.empFullname = empFullname;
    }

    public String getEmpaddress() {
        return empaddress;
    }

    public void setEmpaddress(String empaddress) {
        this.empaddress = empaddress;
    }

    public String getEmpDepartmen() {
        return empDepartmen;
    }

    public void setEmpDepartmen(String empDepartmen) {
        this.empDepartmen = empDepartmen;
    }
}
