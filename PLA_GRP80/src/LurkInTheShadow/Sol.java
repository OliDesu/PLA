package LurkInTheShadow;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;

public class Sol extends Component {
	

	public Sol(Model model, int no, BufferedImage sprite, int rows, int columns, int x, int y, float scale,int screen) {
		super(model, no, sprite, rows, columns, x, y, sprite.getHeight(), sprite.getWidth(), scale,screen);
		m_idx = 0;
		m_show = true;
		splitSprite();
	}

	public void paint(Graphics g) {

		Image img = m_sprites[m_idx];
		int w = (int) (m_scale * m_w);
		int h = (int) (m_scale * m_h);
		g.drawImage(img, m_x, m_y, w, h, null);
	}

}