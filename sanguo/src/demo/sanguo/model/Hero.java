package demo.sanguo.model;
/**
 * 实体模型
 * 英雄类
 * @author Administrator
 *
 */
public class Hero {
	private int id;
	private String name;
	private double hp;
	private double hpmax;
	private double atk;
	private double def;
	private double speed;
	
	public Hero() {
		// TODO Auto-generated constructor stub
	}
	public Hero(String name, double hp, double hpmax, double atk, double def,
			double speed) {
		super();
		this.name = name;
		this.hp = hp;
		this.hpmax = hpmax;
		this.atk = atk;
		this.def = def;
		this.speed = speed;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHp() {
		return hp;
	}
	public void setHp(double hp) {
		this.hp = hp;
	}
	public double getHpmax() {
		return hpmax;
	}
	public void setHpmax(double hpmax) {
		this.hpmax = hpmax;
	}
	public double getAtk() {
		return atk;
	}
	public void setAtk(double atk) {
		this.atk = atk;
	}
	public double getDef() {
		return def;
	}
	public void setDef(double def) {
		this.def = def;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
}
