package Serverlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.Register;
import com.impl.Serversimpl;
import com.servers.RegisterServes;

public class Denglu extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String usename=request.getParameter("usename");
		String pwd=request.getParameter("pwd");
		Register ri=new Register();
		ri.setUsename(usename);
		ri.setPwd(pwd);
		RegisterServes re=new Serversimpl();
		if(re.jian(ri)){
			System.out.println("µÇÂ½³É¹¦!");
			request.getRequestDispatcher("/addmassger.jsp").forward(request, response);
		}else{
			request.getRequestDispatcher("/Shibai.jsp").forward(request, response);
		}
	}

}
