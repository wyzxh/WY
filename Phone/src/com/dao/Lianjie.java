package com.dao;
//���ݿ������    �Լ���ɾ�Ĳ�ķ���

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Lianjie {
	Connection con=null;
	PreparedStatement pre=null;
	ResultSet res=null;
	//�������ݿ�
	public Connection  lian(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/xuexi", "root", "123456");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	//��ɾ��
	public int gai(String sql,Object[]shuju){
		con=lian();
		int m=0;
		try {
			pre=con.prepareStatement(sql);
			for(int i=0;i<shuju.length;i++){
				pre.setObject(i+1, shuju[i]);
			}
			m=pre.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return m;
	}
	//�鿴������Ϣ�ķ���
	public ResultSet cha(String sql,Object[]shuzu){
		con=lian();
		try {
			pre=con.prepareStatement(sql);
			for(int i=0;i<shuzu.length;i++){
				pre.setObject(i+1, shuzu[i]);
			}
			res=pre.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}
	//�ر���Դ
	public void guan(){
		if(res!=null){
			try {
				res.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		if(pre!=null){
			try {
				pre.close();
			} catch (SQLException e) {
				e.printStackTrace();
				}
		if(con!=null){
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		Lianjie m=new Lianjie();
		String sql="insert into phonemessage (usename,pwd) values(?,?)";
		Object[]shuju={"���","����"};
		int i=m.gai(sql, shuju);
		if(i>0){
			System.out.println("��ӳɹ�!");
		}
	}
}
