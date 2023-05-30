fun main(){

//    grade students

    var marks = 60

    if (marks >=0 && marks <=30){
        println("E")
    }else if (marks >=31 && marks <=40){
        println("D")
    }else if(marks >=41 && marks <=65){
        println("C")
    }
    else if (marks >=66 && marks <=75){
        println("B")
    }else if (marks >=76 && marks <=100){
        println("A")
    }else{
        print("unrecognized marks")
    }
}