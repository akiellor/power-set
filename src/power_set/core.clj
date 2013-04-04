(ns power-set.core)

(defn to-vector [s]
  (apply vector s))

(defn with-cons [x]
  (fn [xs] (to-vector (cons x xs))))

(defn vmap [f xs]
  (to-vector (map f xs)))

(defn power-set [s]
  (cond
   (empty? s) []
   (empty? (rest s)) [(to-vector s)]
   :else (concat
          [(to-vector (take 1 s))]
          (power-set (to-vector (rest s)))
          (vmap (with-cons (first s)) (power-set (to-vector (rest s))))))
)
