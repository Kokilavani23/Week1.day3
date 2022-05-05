package Week1.day2;

public class EmployeeDetails {
	public void EmployeeName(String employeeName,int employeeId) {
		System.out.println("enter the employeeName:"+employeeName);
		System.out.println("enter the empId:"+employeeId);
	}
	public void getEmployeeAddress(String employeeAddress) {
		System.out.println("enter the employee address:" +employeeAddress);
	
		
		}
	public static void main(String[] args) {
		EmployeeDetails emp=new EmployeeDetails();
		emp.EmployeeName("koki",23456);
		emp.getEmployeeAddress("chennai");
		// TODO Auto-generated method stub

	}

}
