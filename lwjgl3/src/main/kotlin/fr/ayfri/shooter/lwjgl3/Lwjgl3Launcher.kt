@file:JvmName("Lwjgl3Launcher")

package fr.ayfri.shooter.lwjgl3

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration
import fr.ayfri.shooter.Game

/** Launches the desktop (LWJGL3) application. */
fun main() {
	Lwjgl3Application(Game(), Lwjgl3ApplicationConfiguration().apply {
		setTitle("Shooter")
		setWindowedMode(640, 480)
		setWindowIcon(*(intArrayOf(128, 64, 32, 16).map { "libgdx$it.png" }.toTypedArray()))
	})
}
