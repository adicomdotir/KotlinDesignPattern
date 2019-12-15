package ir.adicom.app.cretional.builder

class HeroBuilder {
    var weapon: String = ""
    var color: String = ""

    fun addWeapon(weapon: String): HeroBuilder {
        this.weapon = weapon
        return this
    }

    fun addColor(color: String): HeroBuilder {
        this.color = color
        return this
    }

    fun build(): Hero {
        return Hero(this)
    }
}
