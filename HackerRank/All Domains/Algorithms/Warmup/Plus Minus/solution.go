package main
import "fmt"

func main() {
    var N int
    fmt.Scanf("%d",&N)
    var a []int
    a=make([]int,N)
    for i:=0;i<N;i++{
        fmt.Scanf("%d",&a[i])
    }
    var f1,f2,f3 float64
    for i:=0;i<N;i++{
        if(a[i]>0){
            f1++
        } else if(a[i]<0){
            f2++
        } else{
            f3++
        }
    }
    f:=float64(N)
    fmt.Printf("%.6f\n", f1/f)
    fmt.Printf("%.6f\n", f2/f)
    fmt.Printf("%.6f", f3/f)
}