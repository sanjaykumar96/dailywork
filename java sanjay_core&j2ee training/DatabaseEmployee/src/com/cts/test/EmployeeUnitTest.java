package com.cts.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.cts.training.bean.Employee;
import com.cts.training.dao.EmployeeDAO;
import com.cts.training.dao.impl.EmployeeDAOImpl;
import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;

public class EmployeeUnitTest {
	private static EmployeeDAO employeeDAO;
	private static Employee employee;

	@BeforeClass
	public static void init() {
		employee = new Employee();
		employeeDAO = new EmployeeDAOImpl();

	}

	@Ignore
	@Test
	public void test_add_employee_success() {
		Employee emp = new Employee(415, "nimish", "mumbai", 25, 789965412);
		assertEquals(true, employeeDAO.saveEmployee(emp));
	}
@Ignore
	@Test()
	public void test_add_employee_fail() {
		Employee emp = new Employee(415, "nimish", "mumbai", 25, 789965412);
		assertEquals(true, employeeDAO.saveEmployee(emp));
	}

	@Ignore
	@Test
	public void test_get_employee_By_id_Success() {
		Employee emp = employeeDAO.getEmployeeById(1);
		assertEquals("vijay", emp.getName());
	}

	@Ignore
	@Test(expected = NullPointerException.class)
	public void test_get_employee_By_idSuccess() {
		Employee emp = employeeDAO.getEmployeeById(100);
		assertEquals("vijay", emp.getName());
	}

	@Ignore
	@Test
	public void test_get_all_employee_success() {
		List<Employee> list = employeeDAO.getAllEmployees();
		assertEquals(7, list.size());
	}

	@Ignore
	@Test
	public void test_get_allemployee_success() {
		List<Employee> list = employeeDAO.getAllEmployees();
		assertEquals("sanju", list.get(4).getName());
	}

	@Ignore
	@Test
	public void test_update_employee_success() {
		Employee emp1 = employeeDAO.getEmployeeById(45);
		emp1.setName("sanju2");
		employeeDAO.updateEmployee(emp1);
		assertEquals("sanju2", emp1.getName());
	}
	@Ignore
	@Test
	public void test_delete_employee_success() {
		Employee emp1=employeeDAO.getEmployeeById(415);
		boolean emmp=employeeDAO.deleteEmployee(emp1);
		assertEquals(true,emmp);
	}
	@Ignore
	@Test(expected = NullPointerException.class)
	public void test_delete_mployee_fail() {
		Employee emp1=employeeDAO.getEmployeeById(6);
		boolean emmp=employeeDAO.deleteEmployee(emp1);
		assertEquals(true,emmp);
	}
}
