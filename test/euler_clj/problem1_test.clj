(ns euler-clj.problem1-test
  (:require [clojure.test :refer :all]
            [euler-clj.problem1 :refer :all]))

(deftest properties-of-result-test
  (testing "Sum is a positive number."
    (is (> (sum-of-multiples-of-3-or-5-below-1000) 0))))
