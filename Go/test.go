package main

import (
    "fmt"
    "reflect"
    "time"
)
    
var (
    name, course    string
    module          float64
)

func add(x, y int) int {
	return x + y
}
func swap(x, y string) (string, string) {
	return y, x
}
func split(sum int) (x, y int) {
	x = sum * 4 / 9
	y = sum - x
	return
}
func main() {
    
    fn, age, contact := "Vishal", 22, 9764644889
    fmt.Println("Name is ", name, " and is of type ", reflect.TypeOf(name))
    fmt.Println("Module is ", module)
    fmt.Println(fn," ",age," ",contact)

    a := 10.33
    b := 3

    c := int(a) + b
    fmt.Println(c)
    d := a + float64(b)
    fmt.Println(d)

    s1, s2 := swap("hello", "world")
    fmt.Println(s1, s2)
    
    fmt.Println(time.Now().Date())

    t := time.Now()
	switch {
	case t.Hour() < 12:
		fmt.Println("Good morning!")
	case t.Hour() < 17:
		fmt.Println("Good afternoon.")
	default:
		fmt.Println("Good evening.")
	}
}