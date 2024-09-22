(ns wctool.core
  (:require [clojure.java.io :as io]
            [clojure.string :refer [split]]))

(defn c-command [value]
  (print (.length (io/file value))))

(defn l-command [value]
  (print (count (line-seq (io/reader value)))))

(defn w-command [value]
  (-> (slurp value)
      (split #"\W+")
      (count)
      (print)))

(defn m-command [value]
  (-> (slurp value)
      (count)
      (print)))

(defn default-command [value] 
  (c-command value)
  (print " ")
  (l-command value)
  (print " ")
  (w-command value))

(defn -main [& args]
  (let [command (str (first args))
        value (if (empty? (str (second args))) command (str (second args)))]
    (case command
      "-c" (c-command value)
      "-l" (l-command value)
      "-w" (w-command value)
      "-m" (m-command value)
      (default-command command))
    (print " " value)))