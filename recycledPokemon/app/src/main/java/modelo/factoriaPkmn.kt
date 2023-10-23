package modelo

object factoriaPkmn {

    fun generaPkmn() : pokemon{
        var nombres = listOf<String>("Mewtwo","Blastoise","Tangela","Muk","Pinsir","Pikachu","Aerodactyl","Alakazam","Machamp","Arcanine")
        var tipo = listOf<String>("Psiquico","Agua","Planta","Veneno","Bicho","Eléctrico","Roca","Lucha","Lucha","Fuego")
        var imagenes = listOf<String>
        var nombrePkmn = nombres[(nombres.indices).random()]
        var p = pokemon(nombrePkmn, tipo[(tipo.indices).random()],imagenes[(imagenes.indices).random()])
        if(p.nombre.equals("Mewtwo")) p.imagen="mewtwo"
        if(p.nombre.equals("Blastoise")) p.imagen="blastoise"
        if(p.nombre.equals("Tangela")) p.imagen="tangela"
        if(p.nombre.equals("Muk")) p.imagen="muk"
        if(p.nombre.equals("Pinsir")) p.imagen="pinsir"
        if(p.nombre.equals("Pikachu")) p.imagen="pikachu"
        if(p.nombre.equals("Aerodactyl")) p.imagen="aerodactyl"
        if(p.nombre.equals("Alakazam")) p.imagen="alakazam"
        if(p.nombre.equals("Machamp")) p.imagen="machamp"
        if(p.nombre.equals("Arcanine")) p.imagen="arcanine"

        return p
    }
}