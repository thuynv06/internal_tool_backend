package Com.IFI.InternalTool.BS.Service;

import java.util.List;

import Com.IFI.InternalTool.DS.Model.Project;
import Com.IFI.InternalTool.DS.Model.Project_manager;

public interface ProjectService {
	List<Project> getAllProject();
	boolean saveProject(Project project);
	boolean deleteProject(long project_id);
	Project getProjectById(long project_id);
	List<Project_manager> getProjectManagerByEmp(long employee_id,long project_id);
	List<Long> getProjectByEmp(long employee_id);

}
