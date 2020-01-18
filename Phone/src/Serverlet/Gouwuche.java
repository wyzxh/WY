package Serverlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.Shangpin;
import com.impl.GwcServersImpl;
import com.impl.SpServersimpl;
import com.servers.GouwucheServes;
import com.servers.ShangpinServers;

public class Gouwuche extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("id");
		System.out.println(id);
		Shangpin sp=new Shangpin();
		sp.setId(Integer.parseInt(id));
		ShangpinServers ss=new SpServersimpl();
		List<Shangpin> list=ss.gouwuche(sp);
		request.setAttribute("list", list);
		for (Shangpin shangpin : list) {
			String name=shangpin.getName();
			String huiyuan=shangpin.getDazhe();
			String putong=shangpin.getYuanjia();
			com.entity.Gouwuche  gw=new com.entity.Gouwuche();
			gw.setId(Integer.parseInt(id));
			gw.setName(name);
			gw.setHuiyuan(huiyuan);
			gw.setPutong(putong);
			GouwucheServes gs=new GwcServersImpl();
			if(gs.jia(gw)>0){
				response.getWriter().print("<script>alert('商品添加成功!');window.location='/Phone/servlet/Shangpin'</script>");
			}
		}
		
		/*for (Shangpin shangpin : list) {
			System.out.println(shangpin.getYuanjia()+shangpin.getName());
		}*/
		
	}
}		
		
		
		
		
		
		
		
		
		/*	String name=request.getParameter("name");
		String huiyuan=request.getParameter("dazhe");
		String putong=request.getParameter("yuanjia");
		System.out.println(name);
		System.out.println(huiyuan);
		System.out.println(putong);
		com.entity.Gouwuche people=new com.entity.Gouwuche();
		people.setName(name);
		people.setHuiyuan(huiyuan);
		people.setPutong(putong);
		GouwucheServes go=new GwcServersImpl();
		if(go.jia(people)>0){
			System.out.println("添加成功!");
			request.getRequestDispatcher("/servlet/Shangpin").forward(request, response);
		}
		System.out.println("添加失败");
	*/


