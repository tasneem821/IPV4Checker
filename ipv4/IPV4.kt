import javax.swing.text.Segment

fun main(){
    println(isIPV4("125.222.222.222"))
}

fun isIPV4(input:String):Boolean{
    val segments = mutableListOf<String>()
    var segment=""

    for(char in input){
        if(char=='.'){
            segments.add(segment)
            segment=""
        }
        else{
            segment+=char
        }
    }
    segments.add(segment)

if(segments.size!=4){
    return false
}
    segments.forEach{
        segment->
        if(segment.isEmpty()){
            return false
        }
        if(!isDigit(segment)){
            return false
        }
        if(segment.length>1&&segment.startsWith('0')){
            return false
        }
        if(!validRange(segment)){
            return false
        }
    }
return true
}


fun isDigit(segment:String):Boolean{
    segment.forEach {char->
        if(!(char>='0'&&char<='9')){
            return false
        }
    }
    return true
}

fun validRange(segment: String):Boolean{
    val number = segment.toInt()
    if(number<0||number>255){
        return false
    }
    return true
}