(ns raindrops)

(defn convert [num] ;; <- arglist goes here

  
  (cond-> nil
    (zero? (mod num 3)) (str "Pling")
    (zero? (mod num 5)) (str "Plang")
    (zero? (mod num 7)) (str "Plong")
    :always (or (str num))
    )
  
  
  
  
  ;; Your code goes here
  )
