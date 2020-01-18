package Serverlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.impl.GwcServersImpl;
import com.servers.GouwucheServes;

public class ShouGWC extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		GouwucheServes gwc=new GwcServersImpl();
		List<com.entity.Gouwuche> list=gwc.getall();
		request.setAttribute("list", list);
		request.getRequestDispatcher("/show.jsp").forward(request, response);
	}

}
