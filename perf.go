package main

import (
	"fmt"
	"os"
	"strconv"
	"time"
	"math"
)

func main() {
	start := time.Now()

	n, err := strconv.Atoi(os.Args[1])
	if err != nil {
		fmt.Println(err)
		os.Exit(2)
	}

	sum := 0.0

	for i := 1; i <= n; i++ {
		sum += math.Log2(float64(i))
	}

	elapsed := float64(time.Since(start)) / float64(1000000000)

	fmt.Printf("Go: %.9fs\t%f\n", elapsed, sum)
}
