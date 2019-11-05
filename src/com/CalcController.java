package com;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;  

@Controller
public class CalcController 
{
	@RequestMapping("/calc")
	public ModelAndView Calc(HttpServletRequest request, HttpServletResponse res) {
		String a =  request.getParameter("t1");
		String b = request.getParameter("t2");
		String button = request.getParameter("b1");
		
		if(button.equals("add")) {
			int x =  Integer.parseInt(a) + Integer.parseInt(b);
			String message ="The sum is "+x;
			return new ModelAndView("calcpage","message",message);
		
		}
		
		else if(button.equals("sub")) {
			int y =  Integer.parseInt(a) - Integer.parseInt(b);
			String message ="The sub is "+y;
			return new ModelAndView("calcpage","message",message);
		
		}
		
		else if(button.equals("mul")) {
			int z =  Integer.parseInt(a) * Integer.parseInt(b);
			String message ="The mul is "+z;
			return new ModelAndView("calcpage","message",message);
		
		}
		
		else if(button.equals("div")) {
			int i =  Integer.parseInt(a) / Integer.parseInt(b);
			String message ="The div is "+i;
			return new ModelAndView("calcpage","message",message);
		
		}
		
		else {
			return new ModelAndView("errorpage","message","Sorry, wrong username or password");
		}
	}
}

	