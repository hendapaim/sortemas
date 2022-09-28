import platform.posix.system
import kotlin.random.Random

class KotlinLang(escolha: String) {
    companion object {
        val kotlinLang = mapOf<String, List<String>>(
            "Básico" to listOf(
                "[x] Tipos de dados kotlin -> (https://www.geeksforgeeks.org/kotlin-data-types/)",
                "[x] Tipos de dados kotlin -> (https://www.geeksforgeeks.org/kotlin-data-types/)",
                "[x] Variáveis Kotlin -> (https://www.geeksforgeeks.org/kotlin-variables/)",
                "[x] Operadores Kotlin -> (https://www.geeksforgeeks.org/kotlin-operators/)",
                "[x] Entrada/saída padrão Kotlin -> (https://www.geeksforgeeks.org/kotlin-standard-input-output/)",
                "[x] Conversão do tipo Kotlin -> (https://www.geeksforgeeks.org/kotlin-type-conversion/)",
                "[x] Expressão, Declaração e Bloqueio de Kotlin -> (https://www.geeksforgeeks.org/kotlin-expression-statement-and-block/)",
                "[x] String Kotlin -> (https://www.geeksforgeeks.org/kotlin-string/)"
            ),
            "Fluxo de Controlo" to listOf<String>(
                "[x] Expresão if else - https://www.geeksforgeeks.org/kotlin-if-else-expression/",
                "[x] Kotlin while loop",
                "[x] Kotlin do-while loop",
                "[x] Kotlin for loop",
                "[x] Kotlin when expressão",
                "[x] Break sem rótulo de Kotlin",
                "[x] Break rotulada de Kotlin",
                "[x] Kotlin sem rótulos continuam",
                "[x] Kotlin rotulado continuar"
            ),
            "Funções kotlin" to listOf(
                "[x]  Funções kotlin -> (https://www.geeksforgeeks.org/kotlin-functions/)",
                "[x]  Kotlin Argumento padrão e nomeado -> (https://www.geeksforgeeks.org/kotlin-default-and-named-argument/)",
                "[x]  Recursão kotlin -> (https://www.geeksforgeeks.org/kotlin-recursion/)",
                "[x]  Recursão da Cauda kotlin -> (https://www.geeksforgeeks.org/kotlin-tail-recursion/)",
                "[x]  Expressões lambdas e funções anônimas -> (https://www.geeksforgeeks.org/kotlin-lambdas-expressions-and-anonymous-functions/)",
                "[x]  Kotlin Inline -> (https://www.geeksforgeeks.org/kotlin-inline-functions/)",
                "[x]  Notação da função de infixo Kotlin -> (https://www.geeksforgeeks.org/kotlin-infix-function-notation/)",
                "[x]  Kotlin Funções de Ordem Superior -> (https://www.geeksforgeeks.org/kotlin-higher-order-functions/)"
            ),
            "Coleções Kotlin" to listOf(
                "[x]  Coleções Kotlin -> (https://www.geeksforgeeks.org/kotlin-collections/)",
                "[x]  Lista Kotlin : Arraylist -> (https://www.geeksforgeeks.org/kotlin-list-arraylist/)",
                "[x]  Lista Kotlin : listOf() -> (https://www.geeksforgeeks.org/kotlin-list-listof/)",
                "[x]  Conjunto Kotlin : setOf() -> (https://www.geeksforgeeks.org/kotlin-set-setof/)",
                "[x]  Kotlin mutableSetOf() -> (https://www.geeksforgeeks.org/kotlin-mutablesetof-method/)",
                "[x]  Kotlin hashSetOf() -> (https://www.geeksforgeeks.org/kotlin-hashsetof/)",
                "[x]  Mapa de Kotlin : mapOf() -> (https://www.geeksforgeeks.org/kotlin-map-mapof/)",
                "[x]  Kotlin Hashmap -> (https://www.geeksforgeeks.org/kotlin-hashmap/)"
            ),
            "Conceito de OOPs" to listOf(
                "[x]  [Classe Kotlin e Objetos -> (https://www.geeksforgeeks.org/kotlin-class-and-objects/)",
                "[x]  Classe Kotlin Aninhada e Classe Interior -> (https://www.geeksforgeeks.org/kotlin-nested-class-and-inner-class/)",
                "[x]  Kotlin Setters e Getters -> (https://www.geeksforgeeks.org/kotlin-setters-and-getters/)",
                "[x]  Kotlin Propriedades de classe e acessórios personalizados -> (https://www.geeksforgeeks.org/kotlin-class-properties-and-custom-accessors/)",
                "[x]  Construtor Kotlin -> (https://www.geeksforgeeks.org/kotlin-constructor/)",
                "[x]  Modificadores de visibilidade kotlin -> (https://www.geeksforgeeks.org/kotlin-visibility-modifiers/)",
                "[x]  Herança Kotlin -> (https://www.geeksforgeeks.org/kotlin-inheritance/)",
                "[x]  Kotlin Interfaces -> (https://www.geeksforgeeks.org/kotlin-interfaces/)",
                "[x]  Classes de Dados Kotlin -> (https://www.geeksforgeeks.org/kotlin-data-classes/)",
                "[x]  Aulas seladas de Kotlin -> (https://www.geeksforgeeks.org/kotlin-sealed-classes/)",
                "[x]  Classe Abstrata Kotlin -> (https://www.geeksforgeeks.org/kotlin-abstract-class/)",
                "[x]  Aulas de enum em Kotlin -> (https://www.geeksforgeeks.org/enum-classes-in-kotlin/)",
                "[x]  Função de extensão Kotlin -> (https://www.geeksforgeeks.org/kotlin-extension-function/)",
                "[x]  Genéricos Kotlin -> (https://www.geeksforgeeks.org/kotlin-generics/)"
            ),
            "Tratamento de Exceção" to listOf("[x] Tratamento de exceção kotlin try, catch, throw e, finally -> (https://www.geeksforgeeks.org/kotlin-exception-handling-try-catch-throw-and-finally/)"),
            "Segurança Nula" to listOf(
                "[x]  Kotlin Segurança Nula](https://www.geeksforgeeks.org/kotlin-null-safety/)",
                "[x]  Kotlin Verificação de tipos e fundição inteligente](https://www.geeksforgeeks.org/kotlin-type-checking-and-smart-casting/)",
                "[x]  Elenco de tipo explícito](https://www.geeksforgeeks.org/kotlin-explicit-type-casting/)"
            ),
            "Regex & Ranges" to listOf(
                "[x]  Expressão Regular kotlin -> (https://www.geeksforgeeks.org/kotlin-regular-expression/)",
                "[x]  Cordilheiras Kotlin -> (https://www.geeksforgeeks.org/kotlin-ranges/)"
            ),
            "Variado" to listOf(
                "[x]  Anotações de Kotlin -> (https://www.geeksforgeeks.org/kotlin-annotations/)",
                "[x]  Reflexão kotlin -> (https://www.geeksforgeeks.org/kotlin-reflection/)",
                "[x]  Sobrecarga do operador Kotlin -> (https://www.geeksforgeeks.org/kotlin-operator-overloading/)",
                "[x]  Destruturação em Kotlin -> (https://www.geeksforgeeks.org/destructuring-declarations-in-kotlin/)",
                "[x]  Avaliação da igualdade em Kotlin -> (https://www.geeksforgeeks.org/equality-evaluation-in-kotlin/)",
                "[x]  Comparador em Kotlin -> (https://www.geeksforgeeks.org/comparator-in-kotlin/)",
                "[x]  Triplo em Kotlin -> (https://www.geeksforgeeks.org/triple-in-kotlin/)",
                "[x]  Par em Kotlin -> (https://www.geeksforgeeks.org/pair-in-kotlin/)",
                "[x]  Kotlin apply vs with -> (https://www.geeksforgeeks.org/kotlin-apply-vs-with/)"
            ),
        )

//        fun escolha(option: Int): Any {
//            var tema = when (option) {
//                1 -> "Básico"
//                2 -> "Fluxo de Controlo"
//                3 -> "Funções kotlin"
//                4 -> "Coleções Kotlin"
//                5 -> "Conceito de OOPs"
//                6 -> "Tratamento de Exceção"
//                7 -> "Segurança Nula"
//                8 -> "Regex & Ranges"
//                9 -> "Variado"
//                else -> allTemas()
//            }
//            return tema
//        }

        fun allTemas() {
            println("====================================")
            println("    Kotlin Programming Language")
            println("====================================")

            var n = 1
            for ((key, value) in kotlinLang) {
                println("$n - $key")
                for (item in value)
                    println("  $item")
                n++
            }
            print("  Escolhe uma opção [1-9], para escolhermos um tema para estudares: ")
            try {
                val option = readln().toInt()
                system("cls")
                val tema = when (option) {
                    1 -> "Básico"
                    2 -> "Fluxo de Controlo"
                    3 -> "Funções kotlin"
                    4 -> "Coleções Kotlin"
                    5 -> "Conceito de OOPs"
                    6 -> "Tratamento de Exceção"
                    7 -> "Segurança Nula"
                    8 -> "Regex & Ranges"
                    9 -> "Variado"
                    else -> allTemas()
                }
                escolhaTemas(tema as String)

            } catch (e: Exception) {
                system("cls")
                println("«« Upsss... Escolha uma das opções! »»")
                allTemas()
            }
        }

        fun escolhaTemas(escolha: String) {

            val temas = kotlinLang[escolha]

            val index = temas?.let { Random.nextInt(it.size) }
            println(index?.let { "=".repeat(temas[it].length) })
            println("${index?.let { " ".repeat(temas[it].length/2) }}$escolha")
            println(index?.let { "-".repeat(temas[it].length) })
            print("Tema Sugerido: ")
            println(index?.let { temas[it] })
            println(index?.let { "=".repeat(temas[it].length) })

        }
    }

}