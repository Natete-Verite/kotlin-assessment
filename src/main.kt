fun main(){
    such("codeHive")
    var c = modulus(10,3)
    println(c)
    identification("Natete",24)
    println(doreen("vous etes intelligente"))
}
fun such(name:String){
    var hey = "codeHive"
    println(hey.get(4))
    println(hey.get(5))
    println(hey.get(6))
    println(hey.get(7))
}
fun modulus(a:Int,b:Int):Int{
    var divide = a%b
    return divide
}
fun identification(p:String,z:Int){
    println("Hi, my name is $p and I am $z years old")
}
fun doreen(word:String):Int{
    var d = word.length
    return d
}
