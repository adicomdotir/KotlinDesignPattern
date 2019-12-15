package ir.adicom.app.cretional.builder

class Hero(private val heroBuilder: HeroBuilder) {
    private val weapon: String = heroBuilder.weapon
    private val color: String = heroBuilder.color

    override fun toString(): String {
        return "Hero[$weapon, $color]"
    }
}
