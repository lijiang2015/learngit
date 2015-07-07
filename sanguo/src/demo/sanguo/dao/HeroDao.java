package demo.sanguo.dao;

import java.util.List;

import demo.sanguo.model.Hero;

/**
 * Ӣ�۵Ĳ����ӿ�
 * @author Administrator
 *
 */
public interface HeroDao {
	/**
	 * ����
	 * @param hero
	 */
	void save(Hero hero);
	
	/**
	 * ͨ��idɾ��Ӣ��
	 * @param id
	 */
	void deleteById(int id);

	/**
	 * ����Ӣ�۶����id�޸���������
	 * @param hero
	 */
	void update(Hero hero);
	
	/**
	 * ͨ��id��ѯӢ��
	 * @param id
	 * @return
	 */
	Hero findById(int id);
	
	/**
	 * ��ѯ����Ӣ��
	 * @return
	 */
	List<Hero> findAll();
}
