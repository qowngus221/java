package CH35;

public class Factory extends Buliding implements IcanFly{
	
	AddOn addOn;
	
	Factory(){
		
	}
	void setAddOn(AddOn addOn) {
		this.addOn=addOn;
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Land() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void BuildStructure() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Underattack(Unit unit) {
		// TODO Auto-generated method stub
		
	}

}
