package modelo

object factoriaListaPersonaje {
    fun generaLista(cant:Int):ArrayList<personaje> {
        var lista = ArrayList<personaje>(1)
        for(i in 1..cant){
            lista.add(factoriaPersonaje.generaPersonaje())
        }
        return lista
    }
}