(ns sync-sub.web
  (:use  [compojure.core]
         [ring.middleware.params]
         [ring.middleware.multipart-params])
  (:require [compojure.handler :as handler]
            [compojure.route :as route]
            [net.cgrand.enlive-html :refer [deftemplate]]))


(deftemplate index "public/index.html" [])



(defroutes app-routes
  (GET "/" [] (index))

  (POST "/sync" request
        (str "Multipart" (:multipart-params request)))

  ;; To serve static pages in resources/public directory
  (route/resources "/")
  (route/not-found "Page not found"))

(def app
  (handler/site
   app-routes))
