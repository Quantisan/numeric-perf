(ns numeric-perf.core-test
  (:use clojure.test
        [criterium.core :only (quick-bench)]
        numeric-perf.core))

(deftest fib-test
  (println "\nRecursive Fibonacci\n")
  (quick-bench (fib 20)))

(deftest parse-test
  (println "\nParse integer\n")
  (quick-bench (parse-int)))

(deftest qsort-test
  (println "\nNumeric vector sort\n")  
  (quick-bench (qsort-vec 5000)))

(deftest pi-sun-test
  (println "\nSlow pi series\n")
  (quick-bench (dotimes [_ 500] (pi-sum-mr 10000))))
