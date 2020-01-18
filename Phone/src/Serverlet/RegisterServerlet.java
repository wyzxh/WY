package Serverlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.Register;
import com.impl.Serversimpl;
import com.servers.RegisterServes;

public class RegisterServerlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String usename=request.getParameter("usename");
		String pwd=request.getParameter("pwd");
		Register re;
		if (usename!=""&&pwd!=""&&usename!=null&&pwd!=null) {
			re = new Register();
			re.setUsename(usename);
			re.setPwd(pwd);
			RegisterServes ri=new Serversimpl();
			if(ri.add(re)>0){	
				request.getRequestDispatcher("/MyJsp.jsp").forward(request, response);
				System.out.println("信息添加成功");
			}
		}else{
			response.getWriter().print("<script>alert('添加信息失败');window.location='/Phone/index.jsp'</script>");
		}
		
	}

}
