package demo.sanguo.util;

import demo.sanguo.dao.HeroDao;
import demo.sanguo.dao.impl.HeroDaoImpl;

/**
 * DAO¹¤³§
 * @author Administrator
 * 
 */
public class DaoFactory {
	public static HeroDao getHeroDao(){
		return new HeroDaoImpl();
	}
	//....
}
