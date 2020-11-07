(ns {{ns}}
  (:gen-class
   :name {{package}}.{{class}}
   :extends bukkitclj.ClojurePlugin)
  (:import [org.bukkit.plugin.java JavaPlugin]))

(set! *warn-on-reflection* true)

(defn -onEnable [^JavaPlugin this]
  (.. this (getLogger) (info "Clojure plugin {{class}} enabled")))

(defn -onDisable [^JavaPlugin this]
  )