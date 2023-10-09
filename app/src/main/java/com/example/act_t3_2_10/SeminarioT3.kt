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

/** Ejercicio 5. Crea una función que cuenta cuántas veces aparece una letra en un
texto. */
fun repLet(cadena:String, letra:Char):Int{
    var res: Int=0
    for(i in 0 until cadena.length){
        if(cadena[i]==letra){
            res++
        }
    }
    return res
}

/** Ejercicio 6. Crea una función que cuenta cuántas veces aparece una subcadena en
un texto. */
fun subca(texto:String, subcadena:String):Int{
    var cont:Int=0
    for(i in 0 until texto.length){
        var char: Char=texto[i]
        var charcad: Char=subcadena[i]
        if(char==charcad){
            cont++
        }
    }
    return cont
}

/** Ejercicio 7. Crea una función que pone en mayúscula la primera letra de cada
palabra de un texto. */
fun mayus(texto:String):String{
    var array=texto.split(" ")
    var res: String=""
    for(i in 0 .. array.size-1){
        if(i==1){
            array[i].uppercase()
        }
        res+=array[i]
    }
    return res
}

fun main(){
/** 4 */
    println(palin("amar"))

    /** 5 */
    println(repLet("amar", 'a'))
}