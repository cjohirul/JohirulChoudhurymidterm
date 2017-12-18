package design;

public abstract class EmployeeAbstClass implements Employee{
      public static String christmas = "December 25";
    //employee paid time off
    public abstract void paidoff ();

    //employee paid holidays
    public abstract void paidholidys ();

    //non-abstract method
    public void employeeGarage(){
        System.out.println("employee can park");
    }
    //non-abstract method
    public void employeeBreakRoom(){
        System.out.println("employee can make own coffee");
    }
}
