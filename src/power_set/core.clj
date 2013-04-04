(ns power-set.core)

(defn with-cons [x]
  (fn [xs] (cons x xs)))

(defn power-set [s]
  (cond
   (empty? s) '()
   (empty? (rest s)) (cons s '())
   :else (concat
          (cons (take 1 s) '())
          (power-set (rest s))
          (map (with-cons (first s)) (power-set (rest s))))))
