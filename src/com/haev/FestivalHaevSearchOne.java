package com.haev;

import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.festivalDAO.FestivalDAO;
import com.festivalVO.FestivalVO;

public class FestivalHaevSearchOne implements FestivalHaevImpl {
	public void haev(HttpServletRequest request,  HttpServletResponse response) throws NamingException, Exception{
		String fnum=request.getParameter("fnum");
		
		FestivalDAO snsdao1=new FestivalDAO();
		FestivalVO sv1=snsdao1.search_fes(fnum);
		
		request.setAttribute("sv1", sv1);
		
	}

}
