package com.sz.ucar.访问者模式;
//具体元素，全职员工
public class FullTimeEmployee extends IEmployee{
	
	public String name;
	public double weeklyWage;
	public int workTime;
	
	  public FullTimeEmployee(String name, double weeklyWage, int workTime)
      {
          this.name = name;
          this.weeklyWage = weeklyWage;
          this.workTime = workTime;
      }
	
	@Override
	public void accept(IVisitor visitor) {
		//把数据传递给访问者，并执行访问者的业务逻辑
		visitor.visit(this);
	}

}
