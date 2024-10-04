package CH34;

@CustomAnnotation(value="HELL WORLD",number=5)
class Simple{
	String value;
	int num;
	
	Simple(){
		CustomAnnotation ref = this.getClass().getAnnotation(CustomAnnotation.class);
		System.out.println("Values : " + ref.value());
		System.out.println("number : " + ref.number());
		this.value = ref.value();
		this.num = ref.number();
	}
	
	//toString();
	@Override
	public String toString() {
		return "Simple [value=" + value + ", num=" + num + "]";
	}
	
}

public class implementMain {

	public static void main(String[] args) {
		
		Simple obj = new Simple();
		System.out.println(obj);
	}

}
