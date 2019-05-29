package LurkInTheShadow;

import java.awt.image.BufferedImage;

public class Ally extends Character {
	int faction;

	public Ally(Model m, int x, int y, int w, int h, float scale, BufferedImage sprite, int rows, int col, int id_x,
			boolean show, int HP, int intensity) {
		super(m, x, y, w, h, scale, sprite, rows, col, id_x, show, HP, intensity);
		this.faction = 0;
	}
}