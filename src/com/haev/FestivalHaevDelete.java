package com.haev;

import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.festivalDAO.FestivalDAO;


public class FestivalHaevDelete implements FestivalHaevImpl {
	public void haev(HttpServletRequest request,  HttpServletResponse response) throws NamingException, Exception{
		String fnum=request.getParameter("fnum");
		FestivalDAO snsdao1=new FestivalDAO();
		snsdao1.delete_fes(fnum);		
	}

}
