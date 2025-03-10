fun main(){
    try {
        println("Введите данные вашей собаки (порода, кличка, рост по холке(см), возраст, окрас, вес(кг), характер, любимую игрушку и размер (маленькая/средняя/большая):")
        val breed = readln() // сохраняем породу в переменной
        val name = readln() // сохраняем кличку
        val height = readln().toDouble() // сохраняем рост
        val age = readln().toDouble() // сохраняем возраст
        val color = readln() // сохраняем окрас
        val weight = readln().toDouble() // сохраняем вес
        val temperament = readln() // сохраняем характер
        val toy = readln() // сохраняем любимую игрушку
        val size = readln() //сохраняем раззмер собаки

        val dog: Dog = when (breed.lowercase()) {
            "лабрадор" -> Labrador(name, height, age, color, weight, temperament, toy, size)
            "бульдог" -> Bulldog()
            else -> Dog(breed, name, height, age, color, weight, temperament, toy, size)
        }

    //вывод информации о собаке
    dog.InfoForDog()

    //вывод размера
        dog.AgeAndWeight()

    //если порода собаки лабрадор, то выведутся функции, связанные только с этой породой
    if (dog is Labrador){
        dog.Fun()
        dog.Toys()
    }

    if (dog is Bulldog){
        dog.ShowTemperament()
        dog.FavoriteFood()
    }

    println("\nвы хотите изменить вес вашей собаки? (да/нет)")
    var otvet = readLine()?.lowercase()

    if (otvet == "да") {
        println("введите новый вес для собаки: ")
        val newWeight = readLine()!!.toDouble()
        dog.ChangeWeight(newWeight)
    }
    else if (otvet == "нет"){
        println("вес собаки не изменен")
    }
    else{
        println("некорректный ответ")
    }

    }
    catch (e: Exception) {
        println("Некорректный ввод")
    }
}