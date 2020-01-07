package ir.adicom.app.cretional.builder

import java.util.*

fun main() {
    val hero: Hero = HeroBuilder()
        .addColor("Red")
        .addWeapon("Sword")
        .build()
    println(hero)
}
