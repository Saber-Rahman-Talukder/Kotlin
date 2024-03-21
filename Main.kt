//(Combine Multiple Branches)
fun main(array: Array<String>){
    print("Enter the Month: ")
    var monthOfyear = readln()!!.toString()
    when(monthOfyear){
        "Jan","Feb","Mar","Apr","May"-> print("Month Name")
        else-> "Not Month"
    }
}
