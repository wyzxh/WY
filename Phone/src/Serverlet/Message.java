package Serverlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.Xinxi;
import com.impl.Serversimpl;
import com.servers.RegisterServes;

public class Message extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String name=request.getParameter("name");
		String age=request.getParameter("age");
		String phone=request.getParameter("phone");
		Xinxi xx=new Xinxi();
		xx.setName(name);
		xx.setAge(Integer.parseInt(age));
		xx.setPhone(phone);
		System.out.println(name+age+phone);
		RegisterServes ri=new Serversimpl();
		if(ri.add(xx)>0){
			System.out.println("信息添加成功!");
			request.getRequestDispatcher("/messger.jsp").forward(request, response);
		}else{
		}
	}

}
