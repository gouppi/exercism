(ns triangle)

(defn is-valid? [a b c] ;; <- arglist goes here
  (and
     (> (+ a b) c)
     (> (+ a c) b)
     (> (+ b c) a))
)

(defn equilateral? [a b c] ;; <- arglist goes here
  (and (is-valid? a b c)
       (and (= a b)
            (= b c)
       ))
)

(defn isosceles? [a b c]
  (and (is-valid? a b c)
       (or
         (and (= a b))
         (and (= a c))
         (and (= b c))

       ))
)

(defn scalene? [a b c] ;; <- arglist goes here
  ;; your code goes here
  (and (is-valid? a b c)
       (and (not= a b)
            (not= b c)
            (not= c a)))

)

