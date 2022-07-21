import java.awt.*;
import java.awt.event.*;

class MouseEx2 extends from implements mouseListener{
	Label1();
	MouseEx2()
	{
		super("AWT Frame");
		1 = new Label();
		1.setBounds(25,60,250,30);
		1.setAlignment(Label.CENTER);
		this.add(1);
		this.setSize(300,300);
		this.setlayout(null);
		this.setvisible(true);
		this.addMouseListener(this);

		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) 
			{
				dispose();

			}
		});
	}
}

public static void main(String[] arhs){
	new MouseEx2();
}
@Override
public void mouseClicked(MouseEvent e) {
	1.setText("Mouse Clicked");

}
@Override
public void mouseEntered(MouseEvent e) {
	1.setText("Mouse Entered");
}
@Override
public void mouseExited(MouseEvent e) {
	1.setText("Mouse Exited");

}
}
