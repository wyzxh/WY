package Serverlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.Gouwuche;
import com.impl.GwcServersImpl;
import com.servers.GouwucheServes;

public class ShanchuGWC extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("id");
		Gouwuche gw=new Gouwuche();
		gw.setId(Integer.parseInt(id));
		GouwucheServes gwc=new GwcServersImpl();
		if(gwc.shan(gw)>0){
			request.getRequestDispatcher("/servlet/ShouGWC").forward(request, response);
		}else{
			System.out.println("É¾³ýÊ§°Ü!");
		}
	}

}
