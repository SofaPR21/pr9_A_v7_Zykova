class Labrador : Dog {

    var favoriteToy: String

    constructor(
        name: String,  //Кличка
        height: Double,  //рост по холке
        age: Double, //фозраст собаки
        color: String,  //окрас шерсти
        weight: Double,  //вес
        temperament: String, //характер
        toy: String
    ) : super(name, "Лабрадор", height, age, color, weight, temperament) {
        favoriteToy = toy
    }


    fun Fun() {
        println("$name любит играть!")
    }

    fun Toys() {
        println("$name любит приносить игрушку: $favoriteToy!")
    }

}