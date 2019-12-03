(require '[clojure.string :as str])

(println
 (reduce +
    (for [x (map #(Integer/parseInt %)
        (str/split
            (slurp "day_1_1.input") #"\n"))] (- (int (Math/floor (/ x 3))) 2))))
