package com.dao;

import java.util.List;

import com.entity.Fenye;
import com.entity.Shangpin;

//��Ʒ��ķ���(��ɾ�Ĳ�)
public interface ShangpinDao {
	//�鿴������Ʒ�ķ���
	public List<Shangpin> getall();
	//������Ʒ��Ϣ�ķ���
	public int addsp(Shangpin people);
	//ɾ����Ʒ��Ϣ
	public int shanchu(Shangpin people);
	//�޸���Ʒ
	public int xiugai(Shangpin people);
	//�޸�(�������)����id��ѯ,�����޸�
	public Shangpin gai(Shangpin people);
	//��ҳ���� 
	public List<Shangpin> yeshu(int pageno,int pagesize);
	//���������
	public int count();
	//����id��ѯ��Ʒ��Ϣ
	public List<Shangpin> gouwuche(Shangpin people);
}
