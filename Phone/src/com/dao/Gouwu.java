package com.dao;

import java.util.List;

import com.entity.Gouwuche;

public interface Gouwu {
	//添加进购物车的方法
	public int jia(Gouwuche people);
	//显示购物车的列表
	public List<Gouwuche> getall();
	//删除商品,根据id
	public int shan(Gouwuche people);
}
