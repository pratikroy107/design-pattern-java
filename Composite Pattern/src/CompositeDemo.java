import java.util.ArrayList;
import java.util.List;

//leaf 1
class FinancialDepartment implements Department {

	private Integer id;
	private String name;

	public void printDepartmentName() {
		System.out.println(getClass().getSimpleName());
	}

	public FinancialDepartment(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "FinancialDepartment [name = " + name + "]";
	}

	// standard constructor, getters, setters
}

//leaf 2
class SalesDepartment implements Department {

	private Integer id;
	private String name;

	public void printDepartmentName() {
		System.out.println(getClass().getSimpleName());
	}

	public SalesDepartment(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "SalesDepartment [name = " + name + "]";
	}

	// standard constructor, getters, setters
}

//composite element
class HeadDepartment implements Department {
	private Integer id;
	private String name;

	private List<Department> childDepartments;

	public HeadDepartment(Integer id, String name) {
		this.id = id;
		this.name = name;
		this.childDepartments = new ArrayList<>();
	}

	public void printDepartmentName() {
		System.out.print(getClass().getSimpleName() + " : ");
		for (Department cd : childDepartments) {
			System.out.print(" " + cd.toString());
		}
		System.out.println();
	}

	public void addDepartment(Department department) {
		childDepartments.add(department);
	}

	public void removeDepartment(Department department) {
		childDepartments.remove(department);
	}
}

//main class
public class CompositeDemo {
	public static void main(String args[]) {
		Department salesDepartment = new SalesDepartment(1, "Sales department");
		Department financialDepartment = new FinancialDepartment(2, "Financial department");

		HeadDepartment headDepartment = new HeadDepartment(3, "Head department");

		headDepartment.addDepartment(salesDepartment);
		headDepartment.addDepartment(financialDepartment);

		headDepartment.printDepartmentName();

		headDepartment.removeDepartment(financialDepartment);
		headDepartment.printDepartmentName();

	}
}