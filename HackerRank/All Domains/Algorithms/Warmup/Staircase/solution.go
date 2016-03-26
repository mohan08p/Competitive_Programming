package main
import "fmt"

func main() {
    var N int
    fmt.Scanf("%d",&N)
    
    for i:=1;i<=N;i++ {
        for j:=N;j>=1;j-- {
            if j<=i {
                fmt.Print("#")
            } else {
                fmt.Print(" ")
            }
        }
        fmt.Println();
    }
}