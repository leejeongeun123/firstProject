package com.yedam.database;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EmpMain {
	public static void main(String[] args) {
		boolean run = true;
		Scanner scn = new Scanner(System.in);
		EmpService service = new EmpServiceImpl();
		while (run) {
			System.out.println("----------------------------------");
			System.out.println("1.리스트  2.입력  3.수정  4.삭제  9.종료");
			System.out.println("----------------------------------");
			System.out.print("선택 > ");
			
			int selectNo;
			try {
				 selectNo = scn.nextInt();
				} catch(InputMismatchException e) {
					System.out.println("숫자를 입력하세요.");
					String a = scn.nextLine();
					continue;
				}
			
			if (selectNo == 1) {
//				EmpDAO dao = new EmpDAO(); //리스트를 누르면 dao.getEmpList() 값을 반환 해서 emps에 저장
				Employee[] emps = service.showList();
				for (Employee emp : emps) {
					if (emp != null)
						System.out.println(emp.toString());
				}
			} else if (selectNo == 2) { // 사용자로부터 입력
				System.out.print("사원번호 입력>");
				int empId = scn.nextInt();
				System.out.print("이름입력> ");
				String empName = scn.next();
				System.out.print("이메일 입력> ");
				String empEmail = scn.next();
				System.out.print("입사일  >  ");
				String emphire = scn.next();
				System.out.print("부서번호 > ");
				String empjob = scn.next();

				EmpDAO dao = new EmpDAO();

				Employee emp = new Employee(empId, empName, empEmail, emphire, empjob);
				dao.addEmployee(emp);

			} else if (selectNo == 3) {
				System.out.println("사원번호 >");
				int eId = scn.nextInt();
				System.out.println("급여입력 : ");
				int salary = scn.nextInt();
//				Employee emp = new Employee();
//				EmpDAO dao = new EmpDAO();
//				service.modEmp(emp); //dao.changeEmp(eId, salary);

			} else if (selectNo == 4) {
				System.out.println("삭제할 사원번호 입력 : ");
				int delId = scn.nextInt();
				scn.hasNext();

//				EmpDAO dao = new EmpDAO();
//				Employee emp = new Employee();
//				emp.setEmployeeId(delId);

				service.delEmp(delId); // dao.removeEmp(delId);

			} else if (selectNo == 9) {
				run = false;
			}
		}
		System.out.println("프로그램 종료.");
	} // end of main
}
