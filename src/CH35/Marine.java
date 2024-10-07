package CH35;

public class Marine extends Unit{
	
	
	public int dagameVal;
	public Gun myGun;
	
	Marine(){
		myGun = new Rifle();
	}
	public void setMyGun(Gun gun){ //총을 교체하기 위해 사용
		this.myGun = gun;
	}
	
	
	@Override
	void move() {
		
		
	}

	@Override
	void underAttack(int dmage) {
		
		
	}
	void attack(Unit unit) {
		
	}
	
}
