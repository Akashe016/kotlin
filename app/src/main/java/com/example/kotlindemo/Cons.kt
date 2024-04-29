package com.example.kotlindemo



import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate

data class Car (
    var cost: Double,
    var make: String,
    var mfg: LocalDate
)

@RequiresApi(Build.VERSION_CODES.O)
fun main() {

    val cr = Car(23.8, "Abc", LocalDate.now())
    println(cr)

}

