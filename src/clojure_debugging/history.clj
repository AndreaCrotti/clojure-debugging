(ns clojure-debugging.history
  (:require
   [clojure.string :as string]
   [hato.client :as h]))

(defn meaning-of-life []
  (->> "https://en.wikipedia.org/wiki/List_of_black_films_of_the_2010s"
       h/get
       :body
       (re-seq #"\/.*\_\(film\)")
       (map #(string/split %  #"/"))
       (map last)
       (map #(string/split % #"_"))
       (map first)
       (filter #(= 2 (count %)))
       second
       Integer/parseInt))
