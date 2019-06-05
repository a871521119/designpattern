package com.sz.ucar.访问者模式;
//具体访问者，工资计算
public class FinanceVisitor extends IVisitor {
	
	/**
	 * 全职工，加班50加元，请假扣80.
	 */
	@Override
	public void visit(FullTimeEmployee employee) {
		 int workTime = employee.workTime;
         double weekWage = employee.weeklyWage;

         if (workTime > 40)
         {
             weekWage = weekWage + (workTime - 40) * 50;
         }
         else if (workTime < 40)
         {
             weekWage = weekWage - (40 - workTime) * 80;
             if (weekWage < 0)
             {
                 weekWage = 0;
             }
         }
         System.out.println("正式员工 "+employee.name+" 实际工资为："+weekWage+" 元");

	}
	
	/**
	 * 临时工，工资计算
	 */
	@Override
	public void visit(PartTimeEmployee employee) {
		int workTime = employee.workTime;
        double hourWage = employee.hourWage;
        System.out.println("临时工 "+employee.name+" 实际工资为："+(workTime * hourWage)+" 元");
	}

}
