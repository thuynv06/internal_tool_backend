package Com.IFI.InternalTool.BS.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Com.IFI.InternalTool.BS.Service.EmployeeService;
import Com.IFI.InternalTool.DS.DAO.EmployeeDAO;
import Com.IFI.InternalTool.DS.Model.Employee;
import Com.IFI.InternalTool.DS.Model.Group_ifi;

@Service("EmployeeService")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDAO employeeDAO;
	@Override
	public List<Employee> getAllEmployee() {
		return employeeDAO.getAllEmployee();
	}
	@Override
	public boolean saveEmployee(Employee employee) {
		 return employeeDAO.saveEmployee(employee);
	}
	@Override
	public boolean deleteEmployee(long employee_id) {
		return employeeDAO.deleteEmployee(employee_id);
	}
	@Override
	public Employee getEmployeeById(long employee_id) {
		return employeeDAO.getEmployeeById(employee_id);
	}
	@Override
	public List<Group_ifi> getAllGroup() {
		// TODO Auto-generated method stub
		return employeeDAO.getAllGroup();
	}

}
