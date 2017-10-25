(ns my-cool-function.core)

(defn sum [arg1 arg2]
  (+ arg1 arg2))

(defn invert [arg]
  (if (nil? arg) true
  (if (false? arg) true false)))

; extract query [parameter] from [req] as string
(defn extract-query-parameter [req parameter]
    (let [query-string (get req :query-string)]
        (cond
            (nil? query-string) nil
            :else
            (get
                (into (sorted-map)
                    (map (fn [x] (clojure.string/split x #"=")) (clojure.string/split (get req :query-string) #"&")))
                parameter))))

(defn crunch-my-data-function
  [req]
  )
