package game.engine.titans;

public class TitanRegistry {

	private final int code;
	private int baseHealth;
	private int baseDamage;
	private int heightInMeters;
	private int speed;
	private int resourcesValue;
	private int dangerLevel;

	public TitanRegistry(int code, int baseHealth, int baseDamage, int heightInMeters, int speed, int resourcesValue,
			int dangerLevel) {

		this.code = code;
		this.baseHealth = baseHealth;
		this.baseDamage = baseDamage;
		this.heightInMeters = heightInMeters;
		this.speed = speed;
		this.resourcesValue = resourcesValue;
		this.dangerLevel = dangerLevel;
	}

	public int getCode() {
		return code;
	}

	public int getBaseHealth() {
		return baseHealth;
	}

	public int getBaseDamage() {
		return baseDamage;
	}

	public int getHeightInMeters() {
		return heightInMeters;
	}

	public int getSpeed() {
		return speed;
	}

	public int getResourcesValue() {
		return resourcesValue;
	}

	public int getDangerLevel() {
		return dangerLevel;
	}
	public Titan spawnTitan(int distanceFromBase) {
		if (this.code == 1) {
			PureTitan t = new PureTitan(baseHealth, baseDamage, heightInMeters, distanceFromBase, speed, resourcesValue, dangerLevel);
			return t;
		}else if(this.code==2){
			AbnormalTitan t=new AbnormalTitan(baseHealth, baseDamage, heightInMeters, distanceFromBase, speed, resourcesValue, dangerLevel);
			return t;
		}else if(this.code==3) {
			ArmoredTitan t = new ArmoredTitan(baseHealth, baseDamage, heightInMeters, distanceFromBase, speed, resourcesValue, dangerLevel);
			return t;
		}else if(this.code==4){
			ColossalTitan t=new ColossalTitan(baseHealth, baseDamage, heightInMeters, distanceFromBase, speed, resourcesValue, dangerLevel);
			return t;
		}
		return null;
	}

}
