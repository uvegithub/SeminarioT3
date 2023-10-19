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

    var array = texto.split(subcadena)
    return array.size-1
}

/** Ejercicio 7. Crea una función que pone en mayúscula la primera letra de cada
palabra de un texto. */
fun mayus(texto:String):String{
    var array=texto.split(" ")
    var arrayMutable = mutableListOf<String>()
    array = array.toMutableList()
    println(array)
    var res: String=""
    for(palabra in  array){
        arrayMutable.add(palabra.replaceFirstChar { char -> char.uppercase() })
    }

    println(arrayMutable)
    return res
}

/** Ejercicio 8. Crea una función que sume los dígitos de un número. Ejemplo:
sumaDigitos(245) = 2 + 4 + 5 = 11. */
fun sumaDigitos(numero:Int):Int{
    var suma:Int=0
    var n = numero
    while(n>0){
        suma+=n%10
        n/=10
    }

    return suma
}

/** Ejercicio 9. Crea una función que calcule el máximo común divisor de dos números
naturales */
fun mcd(n1:Int, n2:Int):Int{
    var aux:Int
    var numero1 = n1
    var numero2 = n2
    while(numero2 != 0){
        aux=numero2
        numero2 = numero1 % numero2
        numero1= aux
    }
    return numero1
}

/** Ejercicio 10. Crea una función que calcule el término n-ésimo de la sucesión de Finbonacci. Se introduce la posición en la serie y devuelve el numero de la serie que corresponde*/
fun fibo(n:Int):Int{
    var a=0
    var b=1
    var res:Int=0
    for (i in 3 .. n){
        res=a+b
        a=b
        b=res
    }
    return res
}

/** Ejercicio 11. Crea una función que determine si dos números son primos relativos. */
fun primRel(n1:Int, n2:Int):Boolean{
    var res:Boolean=false
    var arrayn1= arrayListOf<Int>()
    var arrayn2= arrayListOf<Int>()
    var arrayaux= arrayListOf<Int>()
    for (i in 1 until n1){
        if(n1%i==0){
            arrayn1.add(i)
        }
    }
    for (i in 1 until n2){
        if(n2%i==0){
            arrayn2.add(i)
        }
    }

    for(elto1 in  arrayn1){
        for(elto2 in arrayn2){
            if(elto1 == elto2){
                arrayaux.add(elto1)
            }
        }
    }

    if(arrayaux.size==1){
        res=true
    }

    return res
}

/** Ejercicio 12. Crea una función que determine si un número dado es capicúa. */

fun capicua(numero:Int): Boolean{
    var res: Boolean= false
    var aux:Int = numero
    var cifra:Int
    var inverso:Int=0
    while (aux!=0){
        cifra = aux % 10
        inverso = inverso * 10 + cifra;
        aux = aux / 10;
    }

    if(numero == inverso){
        res=true
    }

    return res
}

/** Ejercicio 13. Crea una función que dada una cadena de texto con formato Emmet
devuelva su correspondiente etiqueta HTML, teniendo en cuenta sólo los atributos
de clase e id. */
fun html(cadena: String):String{
    var res:String
    res="<$cadena>"+"</$cadena>"

    cadena.split(".")

    return res
}

/** Ejercicio 14. Crea una función que dado un número n imprima el siguiente ‘mosaico’ */
fun mosaico(n:Int):String{
    var res:String=""
    for (i in 1 until n){
        res+=i.toString()+"\n"
    }
    return res
}


fun main(){
/** 4 */
    println(palin("amar"))

    /** 5 */
    println(repLet("amar", 'a'))

    /** 7 */
    println(subca("la letra que leto leo let", "let"))

    /** 7
    println(mayus("la letra que leo"))*/

    /** 8 */
    println(sumaDigitos(245))

    /** 9 */
    println(mcd(18, 24))

    /** 10 */
    println(fibo(5))

    /** 11 */
    println(primRel(20, 33))

    /** 12 */
    println(capicua(242))

    /** 13 */

    /** 14 */
    println(mosaico(6))
}