package com.frontController;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.haev.FestivalHaevDelete;
import com.haev.FestivalHaevGetAllInfo;
import com.haev.FestivalHaevImpl;
import com.haev.FestivalHaevInsert;
import com.haev.FestivalHaevSearchOne;
import com.haev.FestivalHaevUpdate;

/**
 * Servlet implementation class FestivalFrontController
 */
//@WebServlet("/FestivalFrontController")
@WebServlet("*.do")
public class FestivalFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FestivalFrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String c1 = request.getRequestURI().substring(request.getContextPath().length());
		FestivalHaevImpl scmd1 = null;
		String kaja = null;

		if (c1.equals("/getAllinfo.do")) {
			scmd1 = new FestivalHaevGetAllInfo();
			try {
				scmd1.haev(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			kaja = "getAllinfo.jsp";
		} else if (c1.equals("/keulWriting.do")) {
			scmd1 = new FestivalHaevInsert();
			try {
				scmd1.haev(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			kaja = "keulWriting.jsp";

		} else if (c1.equals("/keulSearchOne.do")) {
			scmd1 = new FestivalHaevSearchOne();
			try {
				scmd1.haev(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			kaja = "keulSearchOne.jsp";

		} else if (c1.equals("/keulBonaegi.do")) {
			scmd1 = new FestivalHaevSearchOne();
			try {
				scmd1.haev(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			kaja = "keulUpdate.jsp";

		} else if (c1.equals("/keulUpdating.do")) {
			scmd1 = new FestivalHaevUpdate();
			try {
				scmd1.haev(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			kaja = "getAllinfo.jsp";

		} else if (c1.equals("/keulDeleting.do")) {
			scmd1 = new FestivalHaevDelete();
			try {
				scmd1.haev(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			kaja = "getAllinfo.jsp";
		}

		RequestDispatcher rd1 = request.getRequestDispatcher(kaja);
		rd1.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
