package com.dao;

import java.util.List;

import com.entity.Register;
import com.entity.Xinxi;

//�ӿ�  ��ɾ�Ĳ�ķ���
public interface RegisterDao {
	//����˺���Ϣ
	public int add(Register peopel);
	//����½��Ϣ
	public boolean jian(Register peopel);
	//��Ӹ�����Ϣ
	public int add(Xinxi people);
	//��ʾ��Ϣ
	public List<Xinxi>getxx();
	//����id�鿴��Ϣ
	public Xinxi update(Xinxi xx);
	//�޸���Ϣ
	public int gai(Xinxi xx);
	//ɾ����Ϣ
	public int dele(Xinxi xx);
	//��ҳ��ʾ
	public List<Xinxi> getfen(int pageno,int pagesize);
	//���������
	public int getcount();
}
