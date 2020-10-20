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
    (name-to-path $)
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
  (let [main-ns (multi-segment (sanitize-ns name) "plugin")
        data {:raw-name name
              :name (project-name name) 
              :ns main-ns
              :class (sanitize-class name)
              :package (sanitize-package name)
              :sanitized (name-to-path main-ns)
              :year (year)}]
    (main/info "Generating fresh 'lein new' bukkit-for-clojure project.")
    (->files data
             ["README.md" (render "README.md" data)]
             ["project.clj" (render "project.clj" data)]
             ["resources/plugin.yml" (render "plugin.yml" data)]
             ["src/{{sanitized}}.clj" (render "plugin.clj" data)]
             [".gitignore" (render "gitignore" data)]
             [".hgignore" (render "hgignore" data)]
             [".gitattributes" (render "gitattributes" data)]
             ["LICENSE" (render "LICENSE" data)])))
