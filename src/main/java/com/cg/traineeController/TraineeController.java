package com.cg.traineeController;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cg.admin.Admin;
import com.cg.traineeBean.Trainee;
import com.cg.traineeService.TraineeService;





@Controller
public class TraineeController {
	
	@ExceptionHandler(Exception.class)
	public void handelException(HttpServletResponse res)
	{
		try {
			res.sendRedirect("http://localhost:8080/traineeManagement/error");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Autowired
	TraineeService ts;
	@RequestMapping(method=RequestMethod.GET, path="/")
	public String login(@ModelAttribute("adm") Admin adm,BindingResult result) {
		if(result.hasErrors()) {
			return "errorPage";		
			}
			return "Login";
		}
			
	
	@RequestMapping(method=RequestMethod.POST, path="/display")
	public ModelAndView display(@ModelAttribute("adm") @Valid Admin adm,BindingResult result) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Login");
		if(result.hasErrors()) {
			return mv;		
			}
		
		if(adm.getUsername().equalsIgnoreCase("admin") && adm.getPassword().equalsIgnoreCase("admin")) {
			mv.setViewName("Display");
			return mv;
		}
		else {
			mv.setViewName("Login");
			return mv;
		}
	}
	
	@RequestMapping(method=RequestMethod.GET, path="/entryForm")
	public String entryForm(@ModelAttribute("t")  Trainee t, BindingResult result){
		
		if(result.hasErrors()) {
			return "entryForm";
		}
		
		return "entryForm";
		
	}
	
	
	@RequestMapping(method=RequestMethod.POST, path="/saveinfo")
	public ModelAndView saveTrainee(@ModelAttribute("t")  @Valid Trainee tr, BindingResult result) {
		ModelAndView mv = new ModelAndView();
		System.out.println(tr.getTraineeId() + "    " + tr.getTraineeName());
		
		mv.setViewName("Display");
		if(result.hasErrors()) {
			mv.setViewName("entryForm");
			return mv;
		}
		else
		{
		ts.addInfo(tr,result);
		mv.setViewName("Message");
		return mv;}
	}
	
	@RequestMapping(method=RequestMethod.GET, path="/deleteForm")
	public String deleteForm(@ModelAttribute("t") Trainee tr) {
		return "DeletePage";
	}
	
	@RequestMapping(method=RequestMethod.POST, path="/deleteInfo")
	public ModelAndView deleteTrainee(@ModelAttribute("t") Trainee tr, BindingResult result) {
		ModelAndView mv = new ModelAndView();
		System.out.println(tr.getTraineeId());
		
		mv.setViewName("DeletePage");
		Trainee tr1=ts.findInfo(tr.getTraineeId());
		mv.addObject("key", tr1);
		ts.deleteInfo(tr.getTraineeId());
		if(result.hasErrors()) {
			return mv;
		}
		mv.setViewName("DeletePage");
		return mv;
	}
	
	@RequestMapping(method=RequestMethod.GET, path="/updateBox")
	public String updatebox(@ModelAttribute("t") Trainee tr) {
		return "updateBox";
	}
	
	@RequestMapping(method=RequestMethod.POST, path="/updateForm")
	public ModelAndView updateTrainee(@ModelAttribute("t") Trainee tr, BindingResult result) {
		ModelAndView mv = new ModelAndView();
		System.out.println(tr.getTraineeId());
		
		mv.setViewName("updatebox");
		if(result.hasErrors()) {
			return mv;
		}
		mv.setViewName("updateForm");
		Trainee tr1=ts.findInfo(tr.getTraineeId());
		mv.addObject("key1", tr1.getTraineeId());
		mv.addObject("key2", tr1.getTraineeName());
		mv.addObject("key3", tr1.getTraineeDomain());
		mv.addObject("key4", tr1.getTraineeLocation());
		ts.deleteInfo(tr.getTraineeId());
		return mv;
	}
	
	@RequestMapping(method=RequestMethod.GET, path="/postupdate")
	public String postupdate(@ModelAttribute("t") Trainee tr, BindingResult result ) {
		
		ts.addInfo(tr,result);
		return "Message";
	}

	@RequestMapping(method=RequestMethod.GET, path="/showAll")
	public ModelAndView showAll(@ModelAttribute("t") Trainee tr, BindingResult result) {
		ModelAndView mv = new ModelAndView();
		System.out.println(tr.getTraineeId());
		mv.addObject("key1", ts.findAllInfo());
		mv.setViewName("Display");
		if(result.hasErrors()) {
			return mv;
		}
		mv.setViewName("allPage");
		return mv;
	}
	
	@RequestMapping(method=RequestMethod.GET, path="/error")
	public String error() {
		return "errorPage";
	}
	
	
	
}
