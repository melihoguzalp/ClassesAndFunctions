package com.melihoguzalp.classesandfunctions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    var name ="" // buna boyle deriz çünkü eğer name i birden fazla fonksiyonda kulnacaksak bunu bir nevi public tanımlama yapıyormuş gibi düşünmelisin
    //bu olay scope a giriyor. Global tanımlamış olduk. Scope Example da görebilirsin.

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        test()

        //mySum(3,4)
        //Void - Unit


        val result = myMultiply(5,6)
        //textView.text = "Result : ${result}"


        /*
        button.setOnClickListener {

            println("clicked")

        }



         */



        //CLASS


        val homer = Simpson("Melih",23,"Engineer")

        homer.hairColor = "Yellow"


        /*
        // Objects  && Instances
        homer.age = 40
        homer.job = "Nuclear"
        homer.name = "Homer Simpson"
        println(homer.age)


         */

        println(homer.hairColor)


        //Nullability
        // Null && Non Null
        // !! bu da kesin vardır demek. Null ın tam tersi
        //? var mı yok mu bilmiyorum demek. !! in tersi. Null demek zaten var mı yok mu bilmiyorum demek.


        var myString : String? = null //sadece  String yazıyorken hata alırız ama String? olunca nullable olmus olur.
        println(myString)


        var myAge : Int? = null

        //1) Null Safety
        if(myAge != null)
        {
            println(myAge * 10)
        }

        else{
            println("myAge is null")
        }


        //2)safe call
        println(myAge?.compareTo(2))

        //3)Elvis

        val myResult = myAge?.compareTo(2) ?: -100 //?:(Elvis operator) demek oluyor ki :eğer ki bu operatörün sol tarafı null çıkarsa sağdaki değeri eşitle myResuta.
        println(myResult)






    }




    fun test(){

        println("test function")

    }

    //Input && Return

    fun mySum(a:Int,b:Int)
    {

        //textView.text = "Result : ${a+b}"
        //bunu çalıştırınca emülatörde a+b yi görürüz fakat program bir şey döndürmez. Void gibi düşün

    }

    fun myMultiply(x:Int , y:Int) : Int //burdaki int in amacı geriye sayı döndür mesi
    {

        return x*y
    }


    fun helloKotlin(view : View){
        println("hello kotlin")
        //textView.text = " Hello Kotlin "
    }



    fun makeSimpson(view: View){

        name = nameText.text.toString()
        var age = ageText.text.toString().toIntOrNull() // int ya da null döndürsün istiyoruz.
        val job = jobText.text.toString()


        if(age == null)
        {
            age = 0
        }

        val simpson = Simpson(name,age,job)
        resultText.text = "Name : ${simpson.name} , Age : ${simpson.age } , Job : ${simpson.job}"

        //second way
        // val simpson = Simpson(name,age,job) bunu yazmandan yapabilirdik.
        //resultText.text = "Name : ${name} , Age : ${age} , Job : ${job}" . Ancak bu method da age*2 vs olmaz



    }


    fun scopeExample(view: View){


        println(name)



    }









}
