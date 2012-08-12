(ns numeric-perf.core
  (:use criterium.core))

(defn fib [x]
  "fib(n) = n < 2 ? n : fib(n-1) + fib(n-2)"
  (if (< x 2)
    x
    (+ (fib (dec x)) (fib (- x 2)))))

(defn parse-int []
  (-> (Integer/MAX_VALUE)
    (rand-int)
    (Integer/toHexString)
    (Integer/parseInt 16)))
