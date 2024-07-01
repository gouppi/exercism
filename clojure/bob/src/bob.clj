(ns bob
  (:require [clojure.string :as string]))
(defn question? [s]
  (string/ends-with? (string/trimr s) "?"))
(defn forceful? [s]
  (re-matches #"[^a-z]*[A-Z]+[^a-z]*" s))
(defn silence? [s]
    (string/blank? s))
(defn response-for [s]
  (cond
    (and (question? s)
         (forceful? s))  "Calm down, I know what I'm doing!"
    (question? s)        "Sure."
    (forceful? s)        "Whoa, chill out!"
    (silence? s)         "Fine. Be that way!"
    :default             "Whatever."))
