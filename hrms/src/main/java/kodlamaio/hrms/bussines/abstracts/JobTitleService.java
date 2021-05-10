package kodlamaio.hrms.bussines.abstracts;

import java.util.List;

import kodlamaio.hrms.entities.concretes.JobTitle; 

public interface JobTitleService {
	
	List<JobTitle> getAll();
}
