package com.example.m5individual2


fun main() {
    var precio: Int
    println("------------------------------------------------------------")
    println("    Bienvenido al calculador de precios de entradas")
    println("------------------------------------------------------------")


    var user : Double = 0.0
    var dia : String=""
    var alerta: Boolean=true
    var alertadia: Boolean=false

//try catch
        while (alerta) {
            try {
                println("Ingresa tu edad en años (0 a 100)")
                user = readln().toDouble()
//            println("-----------------------------------------------")
//            println("Ingresaste $user años")
//            println("-----------------------------------------------")
                alerta = Alertaedad(user)
                if (alerta == true) {
                    println("------------------------------------------------------------")
                    println("****** LA EDAD INGRESADA ESTA FUERA DE LOS PARAMETROS ******")
                    println("------------------------------------------------------------")
                }


            } catch (e: NumberFormatException) {
                println("------------------------------------------------------------")
                println("****** INGRESA UN NUMERO VALIDO ******")
                println("------------------------------------------------------------")

            }
        }


while(!alertadia&&(user>=16&&user<60)){
    println("Ingresa el dia de la semana que deseas asistir:(Lu Ma Mi Ju Vi Sa Do)")
        dia = readln().toString()
    alertadia= ValidarDia(dia)

    if(!alertadia){
        println("------------------------------------------------------------")
        println("****** INGRESA UN DIA VALIDO ******")
        println("------------------------------------------------------------")
    }

}
    println()
    println("                            .                               ")
    println("------------------------------------------------------------")
    println("         El precio de tu entrada es: $${CostoPorEdad(user,dia)}")
    println("------------------------------------------------------------")
    println("                            .                               ")

}

fun CostoPorEdad(edad : Double,dia:String) : Int {

    if(edad<4){
        val precio=0
        return precio
    }

    if (edad >=4 && edad<16){
    val precio= 15000
    return precio
    }

    if (edad >=16 &&edad<=60){
        val precio= 30000
        return CostoPorDia(precio,dia)
    }

    if(edad>60){
        val precio=20000
        return precio
    }
    else{
        return 0
    }
}

fun CostoPorDia(precio:Int, dia: String) : Int {
    if(dia=="Lu"|| dia=="Ma"){
        val precio = precio-5000
        return precio
    }
    else { return precio }
}



fun Alertaedad(edad: Double) :Boolean {
    return edad < 0 || edad > 100
}

fun ValidarDia(dia: String):Boolean {
    return dia == "Lu" || dia == "Ma" || dia == "Mi" || dia == "Ju" || dia == "Vi" || dia == "Sa" || dia == "Do"
}
