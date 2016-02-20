package main
import "fmt"

func main() {
    var N int
    fmt.Scanf("%d",&N)
    var a []int64
    a=make([]int64,N)
    for i:=0;i<N;i++{
        fmt.Scanf("%d",&a[i])
    }
    var res int64
    for i:=0;i<N;i++{
        res+=a[i]
    }
    fmt.Println(res)
}