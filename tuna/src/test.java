
import java.awt.*;
import java.applet.*;

public class test extends Applet {
	Button b1,b2;
	Label L1,L2;
	TextArea Field ;
	public void init()
	{
		L1 = new Label("Enter user name");
		L2 = new Label("Enter password");
		Component t1 = new TextField(20);
		Component t2 = new TextField(20);
		
		b1 = new Button("SUBMIT");
		b1 = new Button("CANCEL");
		add(L1);
		add(t1);
		add(L2);
		add(t2);
		add(b1);
		add(b2);
	}
}
