/*
    Create two interfaces named Camera and MusicPlayer.

    1. Camera Interface

    Declare an abstract function takePhoto().
    Create a function showDeviceInfo() with a default implementation that prints "Camera is ready".

    2. MusicPlayer Interface

    Declare an abstract function playMusic().
    Create a function showDeviceInfo() with a default implementation that prints "Music player is ready".

    3. SmartPhone Class

    Create a class named SmartPhone that implements both Camera and MusicPlayer. 
*/

interface Camera {
    fun takePhoto()
    fun showDeviceInfo() {
        println("Camera is ready")
    }
}

interface MusicPlayer {
    fun playMusic()
    fun showDeviceInfo() {
        println("Music Player is ready")
    }
}

class SmartPhone : Camera, MusicPlayer {
    override fun takePhoto() {
        println("Photo captured")
    }

    override fun playMusic() {
        println("Playing music")
    }

    override fun showDeviceInfo() {
        super<Camera>.showDeviceInfo()
        super<MusicPlayer>.showDeviceInfo()
    }
}

fun main() 
{
    val smartPhone = SmartPhone()
    val camera: Camera = smartPhone
    val musicPlayer: MusicPlayer = smartPhone

    camera.takePhoto()
    musicPlayer.playMusic()
    camera.showDeviceInfo()
}