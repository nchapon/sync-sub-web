(defproject sync-sub "0.1.0-SNAPSHOT"
  :description "See https://github.com/nchapon/sync-sub-web"
  :url "https://github.com/nchapon/sync-sub-web"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [joda-time/joda-time "2.1"]
                 [midje "1.5.1"]
                 [compojure "1.1.5"]
                 [enlive "1.1.4"]]
  :plugins [[lein-ring "0.8.7"]]
  :ring {:handler sync-sub.web/app})
