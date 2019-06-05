package com.sz.ucar.访问者模式;

import java.util.List;

/**
 * 自然处理方案
 * @author rin
 *
 */
public class EmployeeUtils {
	
	public static void finance(List<IEmployee> employees) {
		
		for(IEmployee emp : employees) {
			if(emp instanceof PartTimeEmployee) {
				PartTimeEmployee employee = (PartTimeEmployee) emp;
				int workTime = employee.workTime;
		        double hourWage = employee.hourWage;
		        System.out.println("临时工 "+employee.name+" 实际工资为："+(workTime * hourWage)+" 元");
			}else {
				FullTimeEmployee employee = (FullTimeEmployee) emp;
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
		}
		
	}
	
	public static void hrd(List<IEmployee> employees) {
		for(IEmployee emp : employees) {
			if(emp instanceof PartTimeEmployee) {
				PartTimeEmployee employee = (PartTimeEmployee) emp;
				int workTime = employee.workTime;
				System.out.println("临时工 "+employee.name+" 实际工作时间为："+workTime+" 小时");
			}else {
				FullTimeEmployee employee = (FullTimeEmployee) emp;
				int workTime = employee.workTime;
				System.out.println("正式员工 "+employee.name+" 实际工作时间为："+workTime+" 小时");

		           if (workTime > 40)
		           {
		        	   System.out.println("正式员工 "+employee.name+" 加班时间为："+(workTime - 40)+" 小时");
		           }
		           else if (workTime < 40)
		           {
		        	   System.out.println("正式员工 "+employee.name+" 请假时间为："+(40 - workTime)+" 小时" );
		           }
			}
		}
	}
}
