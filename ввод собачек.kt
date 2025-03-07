fun main(){
    println("пожалуйста, введите данные о своей собаке: ")

    println("порода: ")
    val breed = readLine() ?: "Неизвестная порода"

    println("кличка: ")
    val name = readLine() ?: "Без имени"

    println("Рост по холке (см): ")
    val height = readLine()!!.toDouble()

    println("Возраст собачки: ")
    val age = readLine()!!.toDouble()

    println("Окрас шерсти: ")
    val color = readLine()!!.toString()

    println("Вес (кг): ")
    val weight = readLine()!!.toDouble()

    println("Характер: ")
    val temperament = readLine() ?: "неизвестный характер"

    val dog: Dog = when(breed.lowercase()){
        "лабрадор" -> Labrador(readln(), readln().toDouble(), readln().toDouble(), readln(), readln().toDouble(), readln(), toy = "мячик")
        "бульдог" -> {
            Bulldog(name)
        }
        else -> Dog(name, breed, height, age, color, weight, temperament)
    }

    //вывод информации о собаке
    dog.InfoForDog()

    //если порода собаки лабрадор, то выведутся функции, связанные только с этой породой
    if (dog is Labrador){
       dog.Fun()
        dog.Toys()
    }

    if (dog is Bulldog){

    }

    println("\nвы хотите изменить вес вашей собаки? (да/нет)")
    var otvet = readLine()?.lowercase()


    if (otvet == "да") {
        println("введите новый вес для собаки: ")
        val newWeight = readLine()!!.toDouble() ?: weight
        dog.ChangeWeight(newWeight)
    }
    else if (otvet == "нет"){
        println("вес собаки не изменен")
    }
    else{
        println("некорректный ответ")
    }



}