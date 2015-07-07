package demo.sanguo.test;

import demo.sanguo.dao.HeroDao;
import demo.sanguo.dao.impl.HeroDaoImpl;
import demo.sanguo.model.Hero;
import demo.sanguo.util.DaoFactory;



public class Test {

	public static void main(String[] args) {
		//��һ��������Ӣ�۶���
		Hero h1 = new Hero("����", 3000, 3000, 450, 26, 370);
		Hero h2 = new Hero("�ŷ�", 3500, 600, 326, 32, 360);
		Hero h3 = new Hero("����", 2400, 1100, 380, 17, 380);
		Hero h4 = new Hero("��", 3100, 2500, 370, 28, 370);
		Hero h5 = new Hero("����", 2300, 2300, 320, 20, 360);

		//Ӣ�۲����ӿ�
		HeroDao dao = DaoFactory.getHeroDao();
		
		//dao.save(h1);
		//dao.save(h2);
		//dao.save(h3);
		//dao.save(h4);
		//dao.save(h5);
		
		Hero gy = dao.findById(3);//���3��Ӣ��
		System.out.println("3�ŵ����֣�"+gy.getName());
		
		//����2900��2900��460��30,360
		
		gy.setHp(2900);
		gy.setHpmax(2900);
		gy.setAtk(460);
		gy.setDef(30);
		gy.setSpeed(360);
		
		//���µ����ݿ���
		dao.update(gy);
		
	}

}
