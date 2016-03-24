package main
import "fmt"
import "math"

func main() {
    var N int
    fmt.Scanf("%d",&N)
    var a []int
    a=make([]int,N*N)
    for i:=0;i<N*N;i++{
        fmt.Scanf("%d",&a[i])
    }
    var sum1,sum2 int
    sum1=0
    sum2=0
    for i,j:= 0,N-1;i<N*N;i,j=i+N+1, j+N-1{
        sum1+=a[i]
        sum2+=a[j]
    }
    fmt.Println(math.Abs(float64(sum2-sum1)))
    //fmt.Println(sum1-sum2)
}