package demo.sanguo.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import demo.sanguo.dao.HeroDao;
import demo.sanguo.model.Hero;
import demo.sanguo.util.ConnUtil;

public class HeroDaoImpl implements HeroDao {

	@Override
	public void save(Hero hero) {
		Connection conn = ConnUtil.getConnection();
		String sql = "insert into sanguo values(?,?,?,?,?,?,?)";
		PreparedStatement pst = null;
		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, 0);
			pst.setString(2, hero.getName());
			pst.setDouble(3, hero.getHp());
			pst.setDouble(4, hero.getHpmax());
			pst.setDouble(5, hero.getAtk());
			pst.setDouble(6, hero.getDef());
			pst.setDouble(7, hero.getSpeed());
			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			ConnUtil.close(null, pst, conn);
		}
	}

	@Override
	public void deleteById(int hid) {
		Connection conn = ConnUtil.getConnection();
		String sql = "delete from sanguo where id=?";
		PreparedStatement pst = null;
		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, hid);
			pst.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			ConnUtil.close(null, pst, conn);
		}
	}

	@Override
	public void update(Hero hero) {
		Connection conn = ConnUtil.getConnection();
		String sql = "update sanguo set name=?,hp=?,hpmax=?,atk=?,def=?,speed=? where id=?";
		PreparedStatement pst = null;
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, hero.getName());
			pst.setDouble(2, hero.getHp());
			pst.setDouble(3, hero.getHpmax());
			pst.setDouble(4, hero.getAtk());
			pst.setDouble(5, hero.getDef());
			pst.setDouble(6, hero.getSpeed());
			pst.setInt(7, hero.getId());
			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			ConnUtil.close(null, pst, conn);
		}
		
	}

	@Override
	public Hero findById(int hid) {
		Connection conn = ConnUtil.getConnection();
		String sql="select * from sanguo where id=?";
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, hid);
			rs = pst.executeQuery();
			if(rs.next()){//至少找到一条记录
				Hero h = new Hero();
				h.setId(rs.getInt(1));
				h.setName(rs.getString(2));
				h.setHp(rs.getDouble(3));
				h.setHpmax(rs.getDouble(4));
				h.setAtk(rs.getDouble(5));
				h.setDef(rs.getDouble(6));
				h.setSpeed(rs.getDouble(7));
				return h;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			ConnUtil.close(rs, pst, conn);
		}
		return null;
	}

	@Override
	public List<Hero> findAll() {
		List<Hero> heroList = new ArrayList<Hero>();
		
		Connection conn = ConnUtil.getConnection();
		String sql="select * from sanguo";
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			while(rs.next()){//至少找到一条记录
				Hero h = new Hero();
				h.setId(rs.getInt(1));
				h.setName(rs.getString(2));
				h.setHp(rs.getDouble(3));
				h.setHpmax(rs.getDouble(4));
				h.setAtk(rs.getDouble(5));
				h.setDef(rs.getDouble(6));
				h.setSpeed(rs.getDouble(7));
				
				heroList.add(h);//把新拼出的hero放进集合中
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			ConnUtil.close(rs, pst, conn);
		}
		
		return heroList;
	}

}
