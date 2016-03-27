package main
import "fmt"

func main() {
 //Enter your code here. Read input from STDIN. Print output to STDOUT
    var T int
    fmt.Scanf("%d", &T)
    for t:=0 ;t<T ;t++ {
        var N,K int
        fmt.Scanf("%d %d", &N,&K)
        var a []int64
        a=make([]int64,N)
        for i:=0; i<N; i++ {
            fmt.Scanf("%d", &a[i])
        }
        var count int
        count=0;
        for i:=0; i<N; i++ {
            if a[i]<=0 {
                count++;   
            }
        }
        if count<K {
            fmt.Println("YES")
        } else {
            fmt.Println("NO")
        }
    }
}