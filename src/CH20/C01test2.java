package CH20;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

class test2 extends JFrame{
	test2(){
		super("Chatting Server");
		setBounds(100,100,500,500);
		JPanel panel = new JPanel();
		
		JTextArea area = new JTextArea();
		
		
		
		add(panel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
	
	
	
}


public class C01test2 {

	public static void main(String[] args) {
		new test2();

	}

}
