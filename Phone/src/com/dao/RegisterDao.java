package com.dao;

import java.util.List;

import com.entity.Register;
import com.entity.Xinxi;

//接口  增删改查的方法
public interface RegisterDao {
	//添加账号信息
	public int add(Register peopel);
	//检查登陆信息
	public boolean jian(Register peopel);
	//添加个人信息
	public int add(Xinxi people);
	//显示信息
	public List<Xinxi>getxx();
	//根据id查看信息
	public Xinxi update(Xinxi xx);
	//修改信息
	public int gai(Xinxi xx);
	//删除信息
	public int dele(Xinxi xx);
	//分页显示
	public List<Xinxi> getfen(int pageno,int pagesize);
	//获得总数据
	public int getcount();
}
