package Control;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import Presentation.MarwanWindow;

public class Mousee implements MouseListener{
MarwanWindow s;
	
	public Mousee (MarwanWindow e) {
		
		s=e;
	}
	
	
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
		while (s.lab1.getText().equals("Tape Your Login"))
			s.lab1.setText(null);
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
