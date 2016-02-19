package main
import "fmt"

func main() {
 //Enter your code here. Read input from STDIN. Print output to STDOUT
    var t int
    fmt.Scanf("%d",&t)
    var a []int
    a=make([]int,t)
    res:=0
    for i:=0;i<t;i++ {
        fmt.Scanf("%d",&a[i])
    }
    for i:=0;i<t;i++ {
        res+=a[i]
    }
    fmt.Println(res)
}