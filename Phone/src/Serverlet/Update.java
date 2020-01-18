package Serverlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.Xinxi;
import com.impl.Serversimpl;
import com.servers.RegisterServes;

public class Update extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String age=request.getParameter("age");
		String phone=request.getParameter("phone");
		String id=request.getParameter("id");
		if (name!=null&&age!=null&&phone!=null&&id!=null&&name!=""&&age!=""&&phone!=""&&id!="") {
			Xinxi xx = new Xinxi();
			xx.setName(name);
			xx.setAge(Integer.parseInt(age));
			xx.setPhone(phone);
			xx.setId(Integer.parseInt(id));
			System.out.println(name + age + phone);
			RegisterServes ri = new Serversimpl();
			if (ri.gai(xx) > 0) {
				request.getRequestDispatcher("/servlet/getallxinxi").forward(request, response);
			} 
		}else{
			request.getRequestDispatcher("/xiugai.jsp").forward(request, response);
		}
		
	}
}
