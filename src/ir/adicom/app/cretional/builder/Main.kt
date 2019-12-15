package ir.adicom.app.cretional.builder

fun main() {
    val hero: Hero = HeroBuilder()
        .addColor("Red")
        .addWeapon("Sword")
        .build()
    println(hero)
}
