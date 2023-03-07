(ns clojure-debugging.clojure-debugging
  "FIXME: my new org.corfield.new/scratch project.")

(defn exec
  "Invoke me with clojure -X clojure-debugging.clojure-debugging/exec"
  [opts]
  (println "exec with" opts))

(defn -main
  "Invoke me with clojure -M -m clojure-debugging.clojure-debugging"
  [& args]
  (println "-main with" args))
