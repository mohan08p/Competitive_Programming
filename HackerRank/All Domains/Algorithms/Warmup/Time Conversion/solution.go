package main
import "fmt"

func main() {
 //Enter your code here. Read input from STDIN. Print output to STDOUT
    var str string
    fmt.Scanf("%s",&str)
    val:=(str[0]-'0')*10+(str[1]-'0')
    if str[8]=='A' {
        if val==12 {
            val=0
        }
    } else {
        val+=12
        if val==24 {
            val=12
        }
    }
    fmt.Printf("%.2d",val)
    fmt.Println(str[2:8])
}