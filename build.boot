(set-env! :source-paths #{"src"}
          :resource-paths #{"resources"}
          :dependencies '[[siili/boot-hedge "0.0.2-SNAPSHOT" :scope "test"]
                          [siili/hedge "0.0.2-SNAPSHOT"]
                          [adzerk/boot-cljs "1.7.228-2" :scope "test"]
                          [crisptrutski/boot-cljs-test "0.3.5-SNAPSHOT" :scope "test"]])

(require (quote [boot-hedge.core :refer :all]))

(require '[crisptrutski.boot-cljs-test :refer [test-cljs report-errors!] :as cljs-test])

(deftask testing [] (merge-env! :source-paths ["src" "test"]) identity)

(deftask test []
  (comp (testing)
        (test-cljs :js-env :node
                    :exit?  true)))
