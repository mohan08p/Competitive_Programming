package main
import "fmt"

func main() {
    var T int
    fmt.Scanf("%d",&T)
    for t:=0;t<T;t++ {
        var N int
        fmt.Scanf("%d",&N)
        var no5, no3 = 0, 0
        for i:=N/3; i>=0; i-- {
            if (N-3*i)%5==0 {
                no3=i
                no5=(N-3*i)/5
                break
            }
        }
        if no3==0 && no5==0 {
            fmt.Println("-1")
        } else {
            for i:=0;i<3*no3; i++ {
                fmt.Print("5")
            }
            for i:=0;i<5*no5; i++ {
                fmt.Print("3")
            }
            fmt.Println()
        }
    }   
}