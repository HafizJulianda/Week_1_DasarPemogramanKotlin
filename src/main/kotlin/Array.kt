fun main(args: Array<String>) {
    val myName: String = "M.Hafiz Julianda"
    for(chr in myName){
        print(chr)
    }
    print('\n')

    val s = "abc" + 1
    println(s + "def")

    var text = """ 
        for (c in "foo") 
            print(c) 
    """
    println(text)

    var text1 = """ 
            |Tell me and I forget. 
            |Teach me and I remember. 
            |Involve me and I learn. 
            |(Benjamin Franklin) 
            """.trimMargin()
    println(text1)
}
