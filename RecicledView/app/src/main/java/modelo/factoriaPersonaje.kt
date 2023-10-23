package modelo

object factoriaPersonaje {
    fun generaPersonaje() : personaje {
        var nombres = listOf<String>("Gandalf", "Frodo", "Legolas", "Aragorn", "Sauron")
        var razas = listOf<String>("Orco", "Hombre", "Hobbit", "Elfo")
        var imagenes = listOf<String>("https://loremflickr.com/g/320/240/paris","https://loremflickr.com/320/240/dog","https://loremflickr.com/320/240","https://loremflickr.com/320/240/brazil,rio", "https://loremflickr.com/320/240/paris,girl/all");
        var nombrePersonaje = nombres[(nombres.indices).random()]
        var p = personaje(nombrePersonaje, razas[(razas.indices).random()],imagenes[(imagenes.indices).random()])
        if (p.nombre.equals("Gandalf")) p.imagen="gandalf"

        return p
    }
}