(ns leiningen.new.bukkit-for-clojure
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files 
                                             project-name sanitize-ns multi-segment 
                                             group-name year]]
            [leiningen.core.main :as main]
            [clojure.string :as s]))

(def render (renderer "bukkit-for-clojure"))

(defn- sanitize-class [name]
  (as-> name $
    (project-name $)
    (s/split $ #"_+")
    (map s/capitalize $)
    (apply str $)))

(defn- sanitize-package [name]
  (as-> name $
    (or (group-name $) $)
    (sanitize-ns $)))

(defn bukkit-for-clojure
  "Creates a bukkit-for-clojure project"
  [name]
  (let [data {:name name
              :ns (multi-segment (sanitize-ns name) "plugin")
              :class (sanitize-class name)
              :package (sanitize-package name)
              :simple-name (project-name name)
              :sanitized (name-to-path name)
              :year (year)}]
    (main/info "Generating fresh 'lein new' bukkit-for-clojure project.")
    (->files data
             ["README.md" (render "README.md" data)]
             ["project.clj" (render "project.clj" data)]
             ["resources/plugin.yml" (render "plugin.yml" data)]
             ["src/{{sanitized}}/plugin.clj" (render "plugin.clj" data)]
             [".gitignore" (render ".gitignore")]
             [".hgignore" (render ".hgignore")]
             [".gitattributes" (render ".gitattributes")]
             ["LICENSE" (render "LICENSE")])))
