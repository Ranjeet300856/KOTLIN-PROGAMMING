//Question 8: Media Player System
abstract class MediaPlayer(val mediaName: String) {
    abstract fun play()
    open fun stop() {
        println("$mediaName Stopped")
    }
}

class AudioPlayer(mediaName: String) : MediaPlayer(mediaName) {
    override fun play() {
        println("$mediaName is playning...")
    }
}

class VideoPlayer(mediaName: String) : MediaPlayer(mediaName) {
    override fun play() {
        println("$mediaName is playning...")
    }
}

class PodcastPlayer(mediaName: String) : MediaPlayer(mediaName) {
    override fun play() {
        println("$mediaName is playning...")
    }
}

fun playMedia(player: MediaPlayer) {
    player.play()
    player.stop()
    println()
}

fun main()
{
    val audioPlayer = AudioPlayer("Song.mp3")
    val videoPlayer = VideoPlayer("Movie.mp4")
    val podcastPlayer = PodcastPlayer("TechTalk")

    val players = listOf(audioPlayer, videoPlayer, podcastPlayer)
    for(player in players) {
        playMedia(player)
    }
}