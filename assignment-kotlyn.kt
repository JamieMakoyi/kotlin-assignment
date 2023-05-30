fun main(){


    var time = 13

    if (time >=0 && time <=12){
        println("Good Morning")
    }else if (time >=12 && time <=18){
        println("Good Afternoon")
    }else if(time >=18 && time <=21) {
        println("Good Evening")
    }else if (time >=21 && time <=24){
        println("Good Night")
    }else{
        print("INVALID INPUT")
    }
}
