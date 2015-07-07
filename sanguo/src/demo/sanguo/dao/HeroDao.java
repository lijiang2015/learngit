package demo.sanguo.dao;

import java.util.List;

import demo.sanguo.model.Hero;

/**
 * 英雄的操作接口
 * @author Administrator
 *
 */
public interface HeroDao {
	/**
	 * 保存
	 * @param hero
	 */
	void save(Hero hero);
	
	/**
	 * 通过id删除英雄
	 * @param id
	 */
	void deleteById(int id);

	/**
	 * 根据英雄对象的id修改其他属性
	 * @param hero
	 */
	void update(Hero hero);
	
	/**
	 * 通过id查询英雄
	 * @param id
	 * @return
	 */
	Hero findById(int id);
	
	/**
	 * 查询所有英雄
	 * @return
	 */
	List<Hero> findAll();
}
