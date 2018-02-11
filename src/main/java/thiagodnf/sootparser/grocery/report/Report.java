package thiagodnf.sootparser.grocery.report;

import java.util.List;

import thiagodnf.sootparser.grocery.order.Order;

public abstract class Report {

	public abstract String print(List<Order> orders);
}
