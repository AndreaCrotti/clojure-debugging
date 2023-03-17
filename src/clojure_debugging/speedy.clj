(ns clojure-debugging.speedy
  (:require
   [taoensso.tufte :as tufte :refer (defnp p profiled profile)]
   [clj-time.format :as cf]))

(defnp with-fmt [fmt s]
  (cf/parse fmt s))

(defnp without-fmt [s]
        (cf/parse s))

(def f (cf/formatter "yyyy-MM-dd"))

(comment
  (profile ; Profile any `p` forms called during body execution
   {} ; Profiling options; we'll use the defaults for now
   (dotimes [_ 100]
     (with-fmt f "2023-03-01")
     (without-fmt "2023-03-01"))));; =>
