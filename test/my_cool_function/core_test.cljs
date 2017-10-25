(ns my-cool-function.core-test
    (:require-macros [cljs.test :refer [deftest testing is]])
    (:require [cljs.test] [my-cool-function.core :as my-cool-function]))

;(deftest i-will-always-fail []
 ; (is (= 1 0)))

 (deftest sanity-test []
   (is (= 1 1)))

 (deftest calculate-2-plus-2-is-4-test []
   (is (= (my-cool-function/sum 2 2) 4)))

 (deftest invert-boolean-test []
   (is (false? (my-cool-function/invert true)))
   (is (true? (my-cool-function/invert false))))

  (deftest invert-nil-returns-true []
   (is (true? (my-cool-function/invert nil))))
