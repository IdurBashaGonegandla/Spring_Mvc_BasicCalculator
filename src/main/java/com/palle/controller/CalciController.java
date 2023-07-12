package com.palle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalciController 
{
	@RequestMapping(value="calci", params="btnAdd")
	public ModelAndView getAdd(String tbFn, String tbSn)
	{
		
		ModelAndView mv = new ModelAndView();
		// Convert the String to Integer
		int fn = Integer.parseInt(tbFn);
		int sn = Integer.parseInt(tbSn);
		
		
		// Add the above two number and store it in a variable
		int res = fn + sn ;
		
		//put the result in ModelAndView 
		mv.addObject("result", res);
		
		//Redirect user to display.jsp
		mv.setViewName("display.jsp");
		
		return mv;
		
	}
	@RequestMapping(value="calci", params="btnSub")
	public ModelAndView getSub(String tbFn, String tbSn)
	{
		
		ModelAndView mv = new ModelAndView();
		// Convert the String to Integer
		int fn = Integer.parseInt(tbFn);
		int sn = Integer.parseInt(tbSn);
		
		
		// Sub the above two number and store it in a variable
		int res = fn - sn ;
		
		//put the result in ModelAndView 
		mv.addObject("result", res);
		
		//Redirect user to display.jsp
		mv.setViewName("display.jsp");
		
		return mv;
		
	}
	@RequestMapping(value="calci", params="btnMult")
	public ModelAndView getMult(String tbFn, String tbSn)
	{
		
		ModelAndView mv = new ModelAndView();
		// Convert the String to Integer
		int fn = Integer.parseInt(tbFn);
		int sn = Integer.parseInt(tbSn);
		
		
		// Multiple the above two number and store it in a variable
		int res = fn * sn ;
		
		//put the result in ModelAndView 
		mv.addObject("result", res);
		
		//Redirect user to display.jsp
		mv.setViewName("display.jsp");
		
		return mv;
		
	}
	@RequestMapping(value="calci", params="btnDiv")
	public ModelAndView getDiv(String tbFn, String tbSn)
	{
		
		ModelAndView mv = new ModelAndView();
		// Convert the String to Integer
		int fn = Integer.parseInt(tbFn);
		int sn = Integer.parseInt(tbSn);
		
		
		// Div the above two number and store it in a variable
		
		int res = fn/sn ;
		
		//put the result in ModelAndView 
		mv.addObject("result", res);
		
		//Redirect user to display.jsp
		mv.setViewName("display.jsp");
		
		return mv;
		
	}


}
