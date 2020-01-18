package Serverlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.ShangpinDao;
import com.entity.Fenye;
import com.impl.SpServersimpl;
import com.servers.ShangpinServers;

public class Shangpin extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pageno=request.getParameter("pageno");
		if(pageno==null||pageno.equals("")){
			pageno="1";
		}
		int pageno1=Integer.parseInt(pageno);
		int pagesize=2;
		ShangpinServers sp=new SpServersimpl();
		int datacount=sp.count();
		Fenye fy=new Fenye();
		fy.setPageno(pageno1);
		fy.setPagesize(pagesize);
		fy.setDatacount(datacount);
		int pagecount=fy.getPagecount();
		List<com.entity.Shangpin> list=sp.yeshu(pageno1, pagesize);
		request.setAttribute("pageno", pageno1);
		request.setAttribute("pagesize", pagesize);
		request.setAttribute("datacount", datacount);
		request.setAttribute("pagecount", pagecount);
		request.setAttribute("list", list);
		request.getRequestDispatcher("/shangpin.jsp").forward(request, response);
	}
}
