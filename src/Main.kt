fun main() {
    print(growingPlant(100,10,910))
}

fun growingPlant(upSpeed: Int, downSpeed: Int, desiredHeight: Int):Int{
    var upSpeed1=upSpeed
    var downSpeed1=downSpeed
    var dayCount=1
    while(upSpeed1<desiredHeight){
        downSpeed1=upSpeed1-downSpeed
        upSpeed1=downSpeed1+upSpeed
        dayCount++}

    return dayCount
}