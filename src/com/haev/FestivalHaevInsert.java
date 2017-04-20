package com.haev;

import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.festivalDAO.FestivalDAO;

public class FestivalHaevInsert implements FestivalHaevImpl {
	public void haev(HttpServletRequest request,  HttpServletResponse response) throws NamingException, Exception{
		String fname=request.getParameter("fname");
		String city=request.getParameter("city");
		String sdate=request.getParameter("sdate");
		String edate=request.getParameter("edate");
		String capa=request.getParameter("capa");
		String ftel=request.getParameter("ftel");
		String home=request.getParameter("home");
		FestivalDAO snsdao1=new FestivalDAO();
		snsdao1.insert_fes(fname, city, sdate, edate, capa, ftel, home);
		
		
		
	}

}
