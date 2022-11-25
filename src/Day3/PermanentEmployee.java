package JavaBasics.src.Day3;

public class PermanentEmployee extends Employee {

    double cal;
    float pfPercent=12;

    public String getPermanentEmpSalary() {
        cal= (Salary*12)/100;
        netSalary=Salary-cal;
        return "net salary after pf deduction :"+netSalary;
    }
}


