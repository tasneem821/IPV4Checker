fun check(name:String,result:Boolean , correctResult:Boolean){
    if(result==correctResult){
        println("sucess - ${name}")
    }
    else{
        println("Failed - $name")
    }
}

fun main(){
    //region theLeastValidIP
check(
    name="Given 0.0.0.0, When checked, Then returns true",
    result = isIPV4("0.0.0.0"),
    correctResult = true
)
    //endregion

    //region theMaxIPValid
    check(
        name="Given 255.255.255.255, When checked, Then returns true",
        result = isIPV4("255.255.255.255"),
        correctResult = true
    )
    //endregion

    //region ValidIP
    check(
        name=" Given 192.168.1.1, When checked, Then returns true",
        result = isIPV4("192.168.1.1"),
        correctResult = true
    )
    //endregion

    //region emptyIP
    check(
        name="Given empty string, When checked, Then returns false",
        result = isIPV4(""),
        correctResult = false
    )
    //endregion

    //region InvalidNumberOfSegmants
    check(
        name="Given 192.168.1, When checked, Then returns false",
        result = isIPV4("192.168.1"),
        correctResult = false
    )
    //endregion

    //region withMoreSegmants
    check(
        name="Given 10.0.0.1.5, When checked, Then returns false",
        result = isIPV4("10.0.0.1.5"),
        correctResult = false
    )
    //endregion

    //region InvalidSperators
    check(
        name = "Given 192-168-1-1, When checked, Then returns false",
        result = isIPV4("192-168-1-1"),
        correctResult = false
    )
    //endregion

    //region GreaterSegmant
    check(
        name = "Given 256.1.1.1, When checked, Then returns false",
        result = isIPV4("256.1.1.1"),
        correctResult = false
    )
//endregion



}