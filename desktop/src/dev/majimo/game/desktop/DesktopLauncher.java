package dev.majimo.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import dev.majimo.game.FlappyTuto;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		config.width = FlappyTuto.WIDTH;
		config.height = FlappyTuto.HEIGHT;
		config.title = FlappyTuto.TITLE;

		new LwjglApplication(new FlappyTuto(), config);
	}
}
