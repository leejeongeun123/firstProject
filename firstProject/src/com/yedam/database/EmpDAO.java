package com.yedam.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpDAO {
	
	//수정
	public void  changeEmp(Employee emp) {
		Connection conn = DBConnection.getConnection();
		String sql = "update emp_temp set salary = " + emp.getSalary()+ "where employee_id = "
				+ emp.getEmployeeId();
	try {
		PreparedStatement psmt = conn.prepareStatement(sql);
		int r = psmt.executeUpdate();
		System.out.println(r + " 건 수정되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	//삭제
	public void removeEmp (int empId) {
		Connection conn = DBConnection.getConnection();
		String sql = "delete from emp_temp where employee_id = "
				+ empId;
	try {
		PreparedStatement psmt = conn.prepareStatement(sql);
		int r = psmt.executeUpdate();
		System.out.println(r + " 건 삭제되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	//입력.
	public void addEmployee(Employee emp) {
		//add 의 기능은 emp 매개값으로 db에 연결
	 Connection conn = DBConnection.getConnection();
//	 insert into emp_temp(employee_id, last_name, email, hire_date, job_id)
//	 value(301, 'test', 'test', '2020-05-05', 'IT_PROG')
	 
	 String sql = "insert into emp_temp(employee_id, last_name, email, hire_date, job_id)"
	 + " values(" + emp.getEmployeeId() 
	 			  + ", \'"+ emp.getLastName()
	 			  + "\',\' " + emp.getEmail()
	 			  + "\',\' " + emp.getHireDate()
	 			  + "\',\' " + emp.getJobId()  
	  + "\' )";
	 System.out.println(sql);
	 try {
		 PreparedStatement psmt = conn.prepareStatement(sql);
		 int r = psmt.executeUpdate();
		 System.out.println(r + "건 입력되었습니다.");
	 } catch (SQLException e) {
		 e.printStackTrace();;
	 }
	}
	
	//조회.
	public Employee[] getEmpList() { //getEmpList()호출하면 Employee[]에 담김		
		Connection conn = DBConnection.getConnection();
		Employee[] employees = new Employee[100]; //배열은 변경불가능. 
		
		try {
			String sql = "select * from emp_temp";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery(); //pstmt.executeQuery()- 실행
			int idx = 0;
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getNString("first_Name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setPhoneNumber(rs.getString("phone_number"));
				emp.setHireDate(rs.getString("hire_date"));
				emp.setJobId(rs.getNString("job_id"));
				emp.setSalary(rs.getInt("salary"));
				
				employees[idx++] = emp;
			
			}
			System.out.println(" -- end of data --");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return employees; //반환

	} // end of getEmpList()

} // end of class
