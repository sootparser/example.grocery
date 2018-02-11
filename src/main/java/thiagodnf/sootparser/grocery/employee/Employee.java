package thiagodnf.sootparser.grocery.employee;

import java.util.List;

import thiagodnf.sootparser.grocery.order.Order;
import thiagodnf.sootparser.grocery.report.ComplexReport;
import thiagodnf.sootparser.grocery.report.SimpleReport;
import thiagodnf.sootparser.grocery.util.UUIDUtil;

public class Employee {
	
	public long employeeId;
	
	protected String name;
	
	public Employee(String name){
		this.employeeId = UUIDUtil.getId();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void printSimpleReports(List<Order> orders){
		System.out.println(new SimpleReport().print(orders));
	}
	
	public void printComplexReports(List<Order> orders){
		System.out.println(new ComplexReport().print(orders));
	}
}
