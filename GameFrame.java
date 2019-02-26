package cn.xyh.game;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

/**
 * 游戏主窗口
 * @author yheng.x
 * 
 * */
public class GameFrame extends JFrame{

	/**
	 * 初始化窗口
	 */
	public void launchFrame() {
		this.setTitle("打飞机小游戏");
		this.setVisible(true);
		this.setSize(750,750);
		this.setLocation(500,200);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		GameFrame f = new GameFrame();
		f.launchFrame();
	}
}
