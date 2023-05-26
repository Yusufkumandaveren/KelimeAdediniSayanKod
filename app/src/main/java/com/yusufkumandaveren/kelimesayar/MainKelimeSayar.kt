package com.yusufkumandaveren.kelimesayar

fun kelimeSayisi(metin: String): Int {
    val kelimeler = metin.trim().split("\\s+".toRegex())
    return kelimeler.size // kelimelerim dizisinin uzunluğunu yani kelime sayısını ifade eder.
}

fun main(){

    val metin = "Umarım Fenerbahçe bu sene şampiyon olacak."
    val kelimeSayisi = kelimeSayisi(metin)
    println("Metindeki kelime sayısı: $kelimeSayisi")

}
/* 'trim()' fonksiyonu, cümlenin başındaki ve sonundaki boşlukları kaldırır.
split("\\s +".toRegex()) fonksiyonu kullanılarak cümle boşluk karakterlerine göre bölünür ve bu bölmeler bir diziye dönüştürülür.
Burada kullanılan "\\s +" ifadesi, boşluk karakterlerini ifade eden bir düzenli ifade (regular expression) kullanır.*/

