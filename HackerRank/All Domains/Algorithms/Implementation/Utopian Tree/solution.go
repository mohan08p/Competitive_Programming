package main
import "fmt"

func main() {
    var T int
    fmt.Scanf("%d", &T)
    var total int
    for T>0 {
        var N int
        fmt.Scanf("%d", &N)
        total=1
        flag:=1
        for N>0 {
            if flag!=0 {
                if total==1 {
                    total+=1
                } else {
                    total*=2
                }
                flag--
            } else {
                total+=1
                flag++
            }
            N--
        }
        fmt.Println(total)
        T--
    }
}