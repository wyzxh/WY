package com.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.Gouwu;
import com.dao.Lianjie;
import com.entity.Gouwuche;

public class GouwucheImpl extends Lianjie implements Gouwu{

	@Override
	public int jia(Gouwuche people) {
		String sql="insert into gouwuche (name,huiyuan,putong) values (?,?,?)";
		Object[]shuju={people.getName(),people.getHuiyuan(),people.getPutong()};
		return gai(sql, shuju);
	}

	@Override
	public List<Gouwuche> getall() {
		String sql="select * from gouwuche";
		Object[]shuzu={};
		ResultSet res=cha(sql, shuzu);
		List<Gouwuche> list=new ArrayList<Gouwuche>();
		try {
			while(res.next()){
				Gouwuche people=new Gouwuche();
				people.setName(res.getString("name"));
				people.setHuiyuan(res.getString("huiyuan"));
				people.setPutong(res.getString("putong"));
				people.setId(res.getInt("id"));
				list.add(people);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	public static void main(String[] args) {
		GouwucheImpl gw=new GouwucheImpl();
		List<Gouwuche> list=gw.getall();
			System.out.println(list.get(1).getName()+list.get(1).getHuiyuan());
	}

	@Override
	public int shan(Gouwuche people) {
		String sql="delete from gouwuche where id=?";
		Object[]shuju={people.getId()};
		return gai(sql, shuju);
	}
}
