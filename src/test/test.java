package test;

import javax.swing.UIManager;

import view.QLSVview;

public class test {

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName() );
			new QLSVview();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
