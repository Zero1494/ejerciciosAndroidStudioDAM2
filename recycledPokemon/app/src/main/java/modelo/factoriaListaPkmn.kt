package modelo

object factoriaListaPkmn {
    fun generaLista(cant:Int):ArrayList<pokemon> {
        var lista = ArrayList<pokemon>(1)
        for(i in 1..cant){
            lista.add(factoriaPkmn.generaPersonaje())
        }
        return lista
    }
}