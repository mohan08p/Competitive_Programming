package main

import "fmt"

func main() {
  var n int
  fmt.Scanf("%d", &n)
  values := make([]int, 0, n)
  for i := 0; i < n; i++ {
    var v int
    fmt.Scanf("%d", &v)
    values = append(values, v)
  }
  fmt.Println(Candies(values))
}

func Candies(values []int) int {
  vl := len(values)
  c := vl
  up := make([]int, vl)
  for pc := 0; pc != c; {
    pc = c
    for i := 1; i < vl; i++ {
      if values[i-1] < values[i] && up[i-1] >= up[i] {
        c++
        up[i]++
      }
      if values[vl-i] < values[vl-i-1] && up[vl-i] >= up[vl-i-1] {
        c++
        up[vl-i-1]++
      }
    }
  }
  return c
}