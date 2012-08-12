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

(defn qsort [[head & tail]]
  "http://bilfp.wikidot.com/why-functional-programming-matters"
  (when head
    (lazy-cat (qsort (filter #(< % head) tail))
              [head]
              (qsort (remove #(< % head) tail)))))

(defn qsort-vec [n]
  (let [v  (take n (repeatedly rand))]
    (doall (qsort v))))
