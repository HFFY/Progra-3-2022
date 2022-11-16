package com.example.progra32022.dataClasses

data class Estudiante(
    val primerNombre: String,
    val segundoNombre: String?,
    val apellidoPaterno: String,
    val apellidoMaterno: String,
    val fechaNacimiento: String,
    var edad: Int,
    val codigo: String
)

fun Estudiante.nombreCompleto(): String {
    return "${this.primerNombre} ${this.segundoNombre ?: ""} ${this.apellidoPaterno} ${this.apellidoMaterno}"
}
