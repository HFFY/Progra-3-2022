package com.example.progra32022.dataClasses

data class Restaurante(
    val nombre: String,
    val direccion: String,
    var abierto: Boolean,
    var clientes: Int?,
    val aforo: Int,
    var comandas: Map<String, String>?
)

fun Restaurante.porcentajeOcupado(): Int {
    return ((this.clientes ?: 0) * 100) / this.aforo
}