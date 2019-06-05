package com.sz.ucar.访问者模式;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		 EmployeeList empList = new EmployeeList();
		 //姓名，周薪，工作时常
         IEmployee fteA = new FullTimeEmployee("梁思成", 3200.00, 45);
         IEmployee fteB = new FullTimeEmployee("徐志摩", 2000, 40);
         IEmployee fteC = new FullTimeEmployee("梁徽因", 2400, 38);
         //姓名，时薪，工作时常
         IEmployee fteD = new PartTimeEmployee("方鸿渐", 80, 20);
         IEmployee fteE = new PartTimeEmployee("唐宛如", 60, 18);
         
         //添加元素
         empList.addEmployee(fteA);
         empList.addEmployee(fteB);
         empList.addEmployee(fteC);
         empList.addEmployee(fteD);
         empList.addEmployee(fteE);

         //添加访问者并处理业务，
         //添加工作时常访问者
         //empList.allAccept(new HRDVisitor());
         //System.out.println();
         //添加工资访问者
         //empList.allAccept(new FinanceVisitor());
         //System.out.println();
         
         // 自然处理方案
         ArrayList<IEmployee> list = new ArrayList<IEmployee>();
         list.add(fteA);
         list.add(fteB);
         list.add(fteC);
         list.add(fteD);
         list.add(fteE);
         EmployeeUtils.hrd(list);
         System.out.println();
         EmployeeUtils.finance(list);
         
         
	}

}
