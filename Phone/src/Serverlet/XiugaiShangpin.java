package Serverlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.Shangpin;
import com.impl.SpServersimpl;
import com.servers.ShangpinServers;

public class XiugaiShangpin extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String dazhe=request.getParameter("dazhe");
		String yuanjia=request.getParameter("yuanjia");
		String id=request.getParameter("id");
		System.out.println(name+dazhe);
		if (name!=null&&dazhe!=null&&yuanjia!=null&&id!=null&&name!=""&&dazhe!=""&&yuanjia!=""&&id!="") {
			Shangpin sp = new Shangpin();
			sp.setName(name);
			sp.setDazhe(dazhe);
			sp.setYuanjia(yuanjia);
			sp.setId(Integer.parseInt(id));
			ShangpinServers ss = new SpServersimpl();
			if (ss.xiugai(sp) > 0) {
				request.getRequestDispatcher("/servlet/Shangpin").forward(request, response);
			} 
		}else{
			request.getRequestDispatcher("/XiugaiShangpin.jsp").forward(request, response);
		}
	}

}
