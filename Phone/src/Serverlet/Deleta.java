package Serverlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.Xinxi;
import com.impl.Serversimpl;
import com.servers.RegisterServes;

public class Deleta extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("id");
		Xinxi xx=new Xinxi();
		xx.setId(Integer.parseInt(id));
		RegisterServes ri=new Serversimpl();
		if(ri.dele(xx)>0){
			System.out.println("É¾³ý³É¹¦!");
			request.getRequestDispatcher("/servlet/getallxinxi").forward(request, response);
			
		}
	}

}
