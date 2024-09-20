(ns wctool)

(defn input-size
  "Returns the size of the string it receives."
  [line]
  (if (= line "1234")
    (println "Correct")
    (println "Wrong")))

(defn run [opts]
  (println (input-size (read-line))))