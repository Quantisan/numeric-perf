# numeric-perf

Clojure implementation of [Julia language](http://julialang.org/)'s
cross-platform benchmark.

## Result

Note that Clojure benchmarks were ran with a [micro-benchmark
library](https://github.com/hugoduncan/criterium)
whereas others were done natively.

<table>
  <tr>
    <td></td>
    <td>Clojure 1.4</td>
    <td>Julia 2f1953a311</td>
    <td>Python 2.7.1</td>
    <td>R 2.15.1</td>
  </tr>
  <tr>
    <td>fib</td>
    <td>0.48667</td>
    <td>0.1938343048095703</td>
    <td>3.95107269287</td>
    <td>34.00000000</td>
  </tr>
  <tr>
    <td>parse-int</td>
    <td>0.13881</td>
    <td>0.3230571746826172</td>
    <td>3.54099273682</td>
    <td>65.00000000</td>
  </tr>
  <tr>
    <td>quicksort</td>
    <td>49.079</td>
    <td>0.5228519439697266</td>
    <td>22.8469371796</td>
    <td>218.00000000</td>
  </tr>  
  <tr>
    <td>pi-sum</td>
    <td>6440.4</td>
    <td>38.4678840637207</td>
    <td>1035.23206711</td>
    <td>6809.00000000</td>
  </tr>
</table>

Mandelbrot and a couple of matrix benchmarks are missing.

## Usage

```bash
lein test
```

## License

Copyright © 2012 Paul Lam

Distributed under the Eclipse Public License, the same as Clojure.
