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

public class ShangpinAdd extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String dazhe=request.getParameter("dazhe");
		String yuanjia=request.getParameter("yuanjia");
		System.out.println(name+dazhe+yuanjia);
		if (name!=""&&dazhe!=""&&yuanjia!=""&&name!=null&&dazhe!=null&&yuanjia!=null) {
			ShangpinServers sp = new SpServersimpl();
			Shangpin ss = new Shangpin();
			ss.setName(name);
			ss.setDazhe(dazhe);
			ss.setYuanjia(yuanjia);
			if (sp.addsp(ss) > 0) {
				System.out.println("添加成功!");
				request.getRequestDispatcher("/servlet/Shangpin").forward(request, response);
			} 
		}else{
			response.getWriter().print("<script>alert('添加信息失败');window.location='/Phone/addSp.jsp'</script>");
		}
	}
}
