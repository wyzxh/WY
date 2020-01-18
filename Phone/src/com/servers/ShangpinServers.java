package com.servers;

import java.util.List;

import com.dao.ShangpinDao;
import com.entity.Shangpin;

//客户需求
public interface ShangpinServers {
	//查看所有商品列表
	public List<Shangpin> getall();
	//添加商品信息
	public int addsp(Shangpin people);
	//删除商品信息
	public int shanchu(Shangpin people);
	//修改商品信息
	public int xiugai(Shangpin people);
	//修改  根据id(先查询) 找到id再修改
	public Shangpin gai(Shangpin people);
	//分页操作
	public List<Shangpin> yeshu(int pageno,int pagesize);
	//获取总数居
	public int count();
	//根据id查询商品
	public List<Shangpin> gouwuche(Shangpin people);
}
