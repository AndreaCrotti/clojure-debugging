(ns clojure-debugging.history-test
  (:require
   [clojure.test :refer [deftest testing is]]
   [clojure-debugging.history :as sut]))

(deftest history-test
  (testing "Can compute the value of everything"
    (is (= 42 (sut/meaning-of-life)))))
