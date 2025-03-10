open class Dog(
    var name: String,  //Кличка
    var breed: String,  //порода
    var height: Double,  //рост по холке
    var age: Double, //возраст собаки

    var color: String,  //окрас шерсти
    var weight: Double,  //вес
    var temperament: String,  //характер
    var toy: String, //любимая игрушка
    var size: String //размер собаки
) {

    //рассчитывает идеальный вес на основе возраста и размера
    fun AgeAndWeight() {
        val idealWeight = when {
            size.lowercase() == "маленькая" -> when {
                age < 1 -> "до 5 кг"
                age < 7 -> "от 5 до 10 кг"
                else -> "от 5 до 8 кг"
            }

            size.lowercase() == "средняя" -> when {
                age < 1 -> "от 5 до 10 кг"
                age < 7 -> "от 10 до 20 кг"
                else -> "от 8 до 15 кг"
            }

            size.lowercase() == "большая" -> when {
                age < 1 -> "от 10 до 20 кг"
                age < 7 -> "от 20 до 40 кг"
                else -> "от 18 до 30 кг"
            }

            else -> "Неизвестный размер собаки"
        }

        println("На основании возраста ($age лет) и размера ($size), идеальный вес для вашей собаки: $idealWeight.")

    }
        //изменение веса собаки
        fun ChangeWeight(newWeight: Double) {
            weight = newWeight
            println("$name теперь весит $weight кг.")
        }

        //вывод информации о собаке
        fun InfoForDog() {
            println("кличка: $name")
            println("порода: $breed")
            println("рост по холке: $height см")
            println("возраст: $age")
            println("окрас шерсти: $color")
            println("вес: $weight кг")
            println("характер: $temperament")
            println("любимая игрушка: $toy")
        }


}