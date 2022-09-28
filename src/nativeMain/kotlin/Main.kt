import platform.posix.system

fun main() {
//    println("Hello, Kotlin/Native!")

    // __ INIT APP __
    SortemasApp()

    readln()
}

//var kotlinLang = mapOf<String, Any>("Fluxo de Controlo" to listOf<String>("Expresão if else"))

fun menuProgramationScreen() {
    println("====================================")
    println("             Menu Programação")
    println("====================================")
    println(" Linguagens:")
    println("  1- Kotlin")
    println("  2- Python")
    println("  3- javascript")
    print("  Escolhe uma opção: ")
    try {
        val option = readln().toInt()
        system("cls")
        //Callback
        KotlinLang.allTemas()
//        KotlinLang.escolhaTemas("Funções kotlin")
    }catch (e: Exception){
        system("cls")
        println("«« Upsss... Escolha uma das opções! »»")
        menuProgramationScreen()
    }
}

// Display Menu Inicial
fun menuInicialScreen(callback: (option: Int) -> Unit) {
    println("====================================")
    println("             Menu Incial")
    println("====================================")
    println("  1- Programação")
    println("  2- Matemática")
    println("  3- Física")
    print("  Escolhe uma opção: ")
    try {
        val option = readln().toInt()
        system("cls")
        callback(option)
    }catch (e: Exception){
        system("cls")
        println("«« Upsss... Escolha uma das opções! »»")
        SortemasApp()
    }
}

// app
fun SortemasApp() {
    menuInicialScreen {
        when (it) {
            1 -> menuProgramationScreen()
            2 -> println("vece escolheu programação")
            3 -> println("vece escolheu programação")
            else -> SortemasApp()
        }
    }
}

