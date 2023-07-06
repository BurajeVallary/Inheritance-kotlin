fun main(){
val car=Car("subaru","nissan","black",30)
    car.carry(30)

    car.identity()

    car.calculateParkingFees(20)


}

 open class Car (var make:String,var model:String,var color:String,var capacity:Int){
    fun carry(people:Int){
        var x =(people-capacity)
        if (people==capacity){
            println("carrying $people passengers")
        }else if(people>capacity){
            println("Over capacity by $people")
        }



    }
    fun identity(){
        println("I am a $color subaru legacy")
    }

    fun calculateParkingFees(hours:Int):Int{
      val calculate=hours*20
        return calculate

    }
    class Bus ( make:String, model:String, color:String, capacity:Int):Car(make,model,color, capacity){

        fun maxTripFare(fare: Double):Double{
            val calc= capacity*fare
            return calc
        }


    }
     fun calculate(hours: Int): Int {
         val fees = hours*capacity
         return fees
     }
}