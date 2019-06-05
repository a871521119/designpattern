package com.sz.ucar.访问者模式;
//具体访问者，工作时间
public class HRDVisitor extends IVisitor {

	/**
	 * 临时工，输出所有工作时间
	 */
	@Override
	public void visit(PartTimeEmployee employee) {
		int workTime = employee.workTime;
		System.out.println("临时工 "+employee.name+" 实际工作时间为："+workTime+" 小时");

	}

	/**
	 * 全职工，大于40小时为加班时间，小于40小时为请假时间
	 */
	@Override
	public void visit(FullTimeEmployee employee) {
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
