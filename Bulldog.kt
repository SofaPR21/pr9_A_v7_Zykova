class Bulldog : Dog {

    constructor(
        name: String = "Босс",  //Кличка
        height: Double = 35.0,  //рост по холке
        age: Double = 7.0, //возраст песика
        color: String = "белый",  //окрас шерсти
        weight: Double = 10.5,  //вес
        temperament: String = "спокойный", //характер
        toy: String = "косточка" , //любимая игрушка
        size: String = "средняя"//размер

    ) : super("Босс", "Бульдог", 35.0, 7.0, "белый", 10.5, "спокойный", "косточка", "средняя")

    // Метод, чтобы показать, какой характер у бульдога
    fun ShowTemperament() {
        println("$name имеет характер: $temperament")
    }

    // Метод, чтобы отобразить любимую еду
    fun FavoriteFood() {
        println("$name любит кушать куриные грудки и собачьи лакомства!")
    }

}