	package Serverlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.Fenye;
import com.entity.Xinxi;
import com.impl.Serversimpl;
import com.servers.RegisterServes;

public class getallxinxi extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RegisterServes ri=new Serversimpl();
		String pageno=request.getParameter("pageno");
		if(pageno==null||pageno.equals("")){
			pageno="1";
		}
		int pageno1=Integer.parseInt(pageno);
		int pagesize=2;
		int datacount=ri.getcount();
		System.out.println(datacount);
		Fenye fe=new Fenye();
		fe.setPagesize(pagesize);
		fe.setDatacount(datacount);
		int pagecount=fe.getPagecount();
		System.out.println(pagecount);
		List<Xinxi> list=ri.getfen(pageno1, pagesize);
		request.setAttribute("pageno", pageno1);
		request.setAttribute("pagesize", pagesize);
		request.setAttribute("datacount", datacount);
		request.setAttribute("pagecount", pagecount);
		request.setAttribute("list",list);
		request.getRequestDispatcher("/cha.jsp").forward(request, response);
	}

}
