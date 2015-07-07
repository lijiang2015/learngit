package demo.sanguo.test;

import demo.sanguo.dao.HeroDao;
import demo.sanguo.dao.impl.HeroDaoImpl;
import demo.sanguo.model.Hero;
import demo.sanguo.util.DaoFactory;



public class Test {

	public static void main(String[] args) {
		//第一步：构建英雄对象
		Hero h1 = new Hero("关羽", 3000, 3000, 450, 26, 370);
		Hero h2 = new Hero("张飞", 3500, 600, 326, 32, 360);
		Hero h3 = new Hero("赵云", 2400, 1100, 380, 17, 380);
		Hero h4 = new Hero("马超", 3100, 2500, 370, 28, 370);
		Hero h5 = new Hero("黄忠", 2300, 2300, 320, 20, 360);

		//英雄操作接口
		HeroDao dao = DaoFactory.getHeroDao();
		
		//dao.save(h1);
		//dao.save(h2);
		//dao.save(h3);
		//dao.save(h4);
		//dao.save(h5);
		
		Hero gy = dao.findById(3);//查出3号英雄
		System.out.println("3号的名字："+gy.getName());
		
		//关羽，2900，2900，460，30,360
		
		gy.setHp(2900);
		gy.setHpmax(2900);
		gy.setAtk(460);
		gy.setDef(30);
		gy.setSpeed(360);
		
		//更新到数据库中
		dao.update(gy);
		
	}

}
