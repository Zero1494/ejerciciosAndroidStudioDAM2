package modelo

object almacenPersonas {

    var personas = ArrayList()<persona>()
    fun aniadirPersona(p:persona){
        personas.add(p)
    }
}