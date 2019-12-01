package ir.adicom.app.behavioral.state

fun main() {
    val player = Player(StatePlay())
    player.play()
    player.play()
    player.play()
}
