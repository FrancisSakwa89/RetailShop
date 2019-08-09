package com.tutorial.filereader;

public class EmployeeInherit {
   public float salary = 40000;

    public static class Programmer {
        public String salary;
        public String bonus;
    }
}
class Programmer extends EmployeeInherit{
//    public String salary;
    public int bonus = 12000;
//    public String salary;
}