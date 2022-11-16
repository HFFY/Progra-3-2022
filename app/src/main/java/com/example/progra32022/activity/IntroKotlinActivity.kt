package com.example.progra32022.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.progra32022.R
import com.example.progra32022.dataClasses.Estudiante
import com.example.progra32022.dataClasses.Persona
import com.example.progra32022.dataClasses.nombreCompleto

class IntroKotlinActivity : AppCompatActivity() {

    // Esta es nuestra Activity donde vimos la introducción a la materia
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro_kotlin)

        //Ejemplo de for iterando un String
        for(i in "Hola Mundo")
            print(i)
    }

    fun diaUno(){
        val nombre = "Hugo" // las variables y valores pueden inferir su tipo
        var apellido: String? = null // Una variable se declara como nuleable con "?"
        val numbero: Int = 2

        println("Hola Mundo")

        val persona = Persona("Hugo", "Flores") // Almacenar clases de tipo data en variables
        println(persona.primerNombre) // Podemos obtener datos sin necesidad de getters

        val nuevoNombre = "Fabian"
        persona.primerNombre = nuevoNombre // Podemos cambiar sus var sin necedidad de setters
        println(persona.primerNombre)

        val largo = apellido?.length ?: 0 // Podemos asignar valores por defecto si una variable puede ser nulleable
        println("${apellido ?: "Flores"} $largo") // Un ejemplo de como podemos dar un valor por defecto y concatenar variables en un String
    }

    fun suma(dato1: Int, dato2: Int): Int{
        return dato1 + dato2
    }

    fun mult(dato1: Int, dato2: Int): Int{
        return dato1 * dato2
    }

    fun nombreCompleto(estudiante: Estudiante): String{
        return "${estudiante.primerNombre} ${estudiante.segundoNombre ?: ""} ${estudiante.apellidoPaterno} ${estudiante.apellidoMaterno}"
    }

    fun parImpar(codigo: String): String {
        val codigoEnInt = codigo.toInt()
        return if (codigoEnInt.mod(2) == 0)
            "Es Par"
        else
            "Es Impar"
    }

    fun Int.parImpar() = this.mod(2) == 0


    fun claseDeLista() {

        var listS: List<String> = listOf("dato1", "dato2")
        var listM: MutableList<String> = listS.toMutableList()
        var listS2 = listM.toList()

        var mapS = mapOf<String, String>()
        var mapM = mapS.toMutableMap()

    }

    fun listaEstudiantes(): List<Estudiante> {
        val estudiante = Estudiante(
            "Nombre",
            null,
            "Apellido P",
            "Apellido M",
            "10/10/2000",
            22,
            "333333"
        )
        return mutableListOf(estudiante)
    }

    fun mapaEstudiantes(): Map<String, Estudiante> {
        val estudiante = Estudiante(
            "Nombre",
            null,
            "Apellido P",
            "Apellido M",
            "10/10/2000",
            22,
            "333333"
        )
        return mutableMapOf(estudiante.codigo to estudiante)
    }

    fun factorial(numero: Int): String {
        return if (numero < 0)
            "Los factoriales solo se definen sobre el conjunto de números naturales"
        else {
            var factorial: Long = 1
            for (i in numero downTo 1)
                factorial = factorial * i
            "El factorial de $numero es $factorial"
        }
    }

    fun fibonacci(cantidad: Int): String {
        return if (cantidad <= 2)
            "Ingrese una cantidad de digitos mayor a 2"
        else {
            val secuencia = mutableListOf<Long>(0, 1)
            for (i in 2 until cantidad step 1) {
                val fibonacciNumer = secuencia[i - 1] + secuencia[i - 2]
                secuencia.add(fibonacciNumer)
            }
            return "La secuencia de fibonacci es: ${secuencia.joinToString(" - ")}"
        }
    }

}
