package com.mygdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.game.DuckDuck;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = DuckDuck.WIDTH;
		config.height = DuckDuck.HEIGHT;
		config.title = DuckDuck.TITLE;
		new LwjglApplication(new DuckDuck(), config);
	}
}
