package com.servers;

import java.util.List;

import com.entity.Gouwuche;

public interface GouwucheServes {
	public int jia(Gouwuche people);
	//查看购物车
	public List<Gouwuche> getall();
	//删除商品
	public int shan(Gouwuche people);
}
