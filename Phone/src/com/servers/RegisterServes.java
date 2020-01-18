package com.servers;

import java.util.List;

import com.entity.Register;
import com.entity.Xinxi;

public interface RegisterServes {
	//客户添加账号的方法
	public int add(Register peopel);
	//检查客户登陆信息的方法
	public boolean jian(Register peopel);
	//客户添加个人信息
	public int add(Xinxi people);
	//查看所有会员的方法
	public List<Xinxi>getxx();
	//根据id查看信息的方法
	public Xinxi update(Xinxi xx);
	//修改信息
	public int gai(Xinxi xx);
	//客户删除信息的方法
	public int dele(Xinxi xx);
	//分页
	public List<Xinxi> getfen(int pageno, int pagesize) ;
	//获取总数据
	public int getcount() ;
}
