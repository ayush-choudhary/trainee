package com.cg.traineeService;

import java.util.List;

import org.springframework.validation.BindingResult;

import com.cg.traineeBean.Trainee;
import com.cg.traineeDao.TraineeDao;


public class TraineeService {

	TraineeDao td=new TraineeDao();
	public TraineeService(TraineeDao td) {
		// TODO Auto-generated constructor stub
		super();
		this.td=td;
	}
	
	public void addInfo(Trainee tr, BindingResult result) {
	
		td.save(tr);
		
	}
	
	public void deleteInfo(int id) {
			td.delete(id);
	}
	
	public Trainee findInfo(int id) {
		return td.findTrainee(id);
	}
	
	public List findAllInfo() {
		return td.findAllTrainees();
	}
	
}
