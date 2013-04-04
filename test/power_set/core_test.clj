(ns power-set.core-test
  (:use clojure.test
        power-set.core))

(deftest power-set-test
  (testing "empty"
    (is (= (power-set '()) '())))
  (testing "one"
    (is (= (power-set '(1)) '((1)))))
  (testing "two"
    (is (= (power-set '(1 2)) '((1) (2) (1 2))))))
