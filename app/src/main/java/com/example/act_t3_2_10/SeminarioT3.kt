package com.example.act_t3_2_10

/** Ejercicio 1. Crea una función que obtenga el número máximo de una lista de números */
fun maxNum(lista: List<Int>): Int{
    var max = lista[0]
    for (i in 1  until  lista.size){
        if (lista[i]>max){
            max=lista[i]
        }
    }
    return max
}

/** Ejercicio 2. Crea una función que obtenga la sumatoria de una lista de números */
fun sumatoria(lista: List<Int>): Int{
    var res:Int=0
    for (i in 1  until  lista.size){
        res+=lista[i]
    }
    return res
}

/** Ejercicio 3. Crea una función que dada una distancia en millas calcule su correspondiente en kms */
fun milKm(distancia:Double):Double{
    var res:Double=distancia*1.6093
    return res
}

/** Ejercicio 4. Crea una función que determine si una cadena de texto es un palíndromo. */
fun palin(cadena:String):Boolean{
    var res: Boolean
    var transfor : String=""
    var array=cadena.split(" ").reversed()
    for(i in 0 .. array.size-1){
        transfor+=array[i]
    }
    if(transfor.equals(cadena)){
        res=true
    }else{
        res=false
    }
    return res
}

fun main(){
/** 4 */
    print(palin("amar"))
}