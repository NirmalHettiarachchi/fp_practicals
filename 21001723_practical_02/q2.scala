object Question_2 {
    def main(args: Array[String]) = {
        method_1()
    }

    def method_1() = {
        var a = 2; var b = 3; var c = 4; var d = 5; var k = 4.3f; var g = 0;

        b -= 1
        d -= 1
        println(b * a + c * d)

        a += 1
        println(a);

        println(- 2 * (g - k) + c)

        c += 1
        println(c)

        c += 1
        a += 1
        c = c * a
        println(c) 
    }    
} 