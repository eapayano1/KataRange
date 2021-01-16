(ns katarange.core-test
  (:require [clojure.test :refer :all]
            [katarange.core :refer :all]))

(deftest a-test
  (testing "Testing-include?"
    (is (= (includes? "[2,5]" "{2,3,4,5}")true))))
