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

public class Shanchushangpin extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("id");
		Shangpin sp=new Shangpin();
		sp.setId(Integer.parseInt(id));
		ShangpinServers ss=new SpServersimpl();
		if(ss.shanchu(sp)>0){
		request.getRequestDispatcher("/servlet/Shangpin").forward(request, response);
		}	
	}
}
