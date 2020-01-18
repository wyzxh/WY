package com.dao;

import java.util.List;

import com.entity.Fenye;
import com.entity.Shangpin;

//商品类的方法(增删改查)
public interface ShangpinDao {
	//查看所有商品的方法
	public List<Shangpin> getall();
	//增加商品信息的方法
	public int addsp(Shangpin people);
	//删除商品信息
	public int shanchu(Shangpin people);
	//修改商品
	public int xiugai(Shangpin people);
	//修改(传入对象)根据id查询,进行修改
	public Shangpin gai(Shangpin people);
	//分页操作 
	public List<Shangpin> yeshu(int pageno,int pagesize);
	//获得总数据
	public int count();
	//根据id查询商品信息
	public List<Shangpin> gouwuche(Shangpin people);
}
