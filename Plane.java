package cn.xyh.game;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
 
public class Plane  extends GameObject {
    @Override
    public void drawMySelf(Graphics g) {
        super.drawMySelf(g);
        this.x +=3;//�ɻ�ˮƽ�ɣ�����Ҳ���Ե���x��y�㷨����������ָ����·������
    }
     
    public Plane(Image img, double x, double y) {
        super(img,x,y);
    }

	public void addDirection1(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void addDirection(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void minusDirection(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
