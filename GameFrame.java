package cn.xyh.game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

/**
 * 游戏主窗口
 * @author yheng.x
 * 
 * */
public class GameFrame extends JFrame{
	
	Image ball = CfGameUtil.getImage("images/ball.jpg");
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.drawLine(100, 100, 300, 300);
		g.drawRect(100, 100, 300, 300);
		g.drawOval(100, 100, 300, 300);
		g.fillRect(100, 100, 100, 100);
		g.drawString("kakaka", 650,600);
		g.setColor(Color.red);
		g.setFont(new Font("宋体",Font.BOLD,50));
		g.drawImage(ball, 350, 350, null);
	}
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
