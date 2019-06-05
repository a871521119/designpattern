package com.sz.ucar.访问者模式;
//具体元素，兼职员工
public class PartTimeEmployee extends IEmployee {
	
	public String name;
	public double hourWage;
	public int workTime;
	
	  public PartTimeEmployee(String name, double hourWage, int workTime)
      {
          this.name = name;
          this.hourWage = hourWage;
          this.workTime = workTime;
      }

	@Override
	public void accept(IVisitor visitor) {
		//把数据传递给访问者，并执行访问者的业务逻辑
		visitor.visit(this);
	}

}
