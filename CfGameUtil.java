package cn.xyh.game;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.nio.Buffer;
import javax.imageio.ImageIO;

public class CfGameUtil {
	private CfGameUtil() {
	}
	
	public static Image getImage(String path) {
		BufferedImage bi = null;
		try {
			URL u = CfGameUtil.class.getClassLoader().getResource(path);
			bi = ImageIO.read(u);
		}catch(IOException e) {
			e.printStackTrace();
		}
		return bi;
	}
}
