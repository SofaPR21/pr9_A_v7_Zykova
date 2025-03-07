open class Dog (
    var name: String,  //Кличка
    var breed: String,  //порода
    var height: Double,  //рост по холке
    var age: Double, //возраст собаки

    var color: String,  //окрас шерсти
    var weight: Double,  //вес
    var temperament: String  //характер
) {

    //соответсвие веса и возраста собаки
    fun AgeAndWeight(){

    }

    //изменение веса собаки
    fun  ChangeWeight(newWeight: Double){
        weight = newWeight
        println("$name теперь весит $weight кг.")
    }

    //вывод информации о собаке
    fun InfoForDog() {
        println("кличка: $name")
        println("порода: $breed")
        println("рост по холке: $height см")
        println("окрас шерсти: $color")
        println("вес: $weight кг")
        println("характер: $temperament")
    }


}


