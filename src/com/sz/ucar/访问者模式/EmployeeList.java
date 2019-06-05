package com.sz.ucar.访问者模式;

import java.util.ArrayList;
import java.util.List;

/**
 * 元素集合
 * @author rin
 *
 */
public class EmployeeList {
	private List<IEmployee> empList = new ArrayList<IEmployee>();
	
	/**
	 * 添加元素
	 * @param emp
	 */
    public void addEmployee(IEmployee emp)
    {
        this.empList.add(emp);
    }
    
    /**
     * 用输入的访问者处理业务逻辑
     * @param visitor
     */
    public void allAccept(IVisitor visitor)
    {
        for(IEmployee emp : empList) {
        	emp.accept(visitor);
        }
    }
}
