package com.haev;

import java.util.ArrayList;

import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.festivalDAO.FestivalDAO;
import com.festivalVO.FestivalVO;

public class FestivalHaevGetAllInfo implements FestivalHaevImpl {
	public void haev(HttpServletRequest request,  HttpServletResponse response) throws NamingException, Exception{
		FestivalDAO snsdao1=new FestivalDAO();
		ArrayList <FestivalVO> alist1=snsdao1.getAllInfo();
		
		request.setAttribute("alist1", alist1);
		
	}

}
