(ns cars-assemble)

(defn production-rate
  "Returns the assembly line's production rate per hour,
   taking into account its success rate"
  [speed]
      (cond (< speed 5) (* 1.0 speed 221.0)
            (< speed 9) (* 0.9 speed 221.0)
            (= speed 9) (* 0.8 speed 221.0)
            (= speed 10) (* 0.77 speed 221.0)
            :else 0.0
      )
)

(defn working-items
  "Calculates how many working cars are produced per minute"
  [speed]
      (int (/ (production-rate speed) 60))
      )
