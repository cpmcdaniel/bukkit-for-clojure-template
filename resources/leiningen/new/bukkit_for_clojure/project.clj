(defproject {{raw-name}} "1.0"
  :description "FIXME: write description"
  :url "https://github.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies []
  :repositories {"spigot-repo" "https://hub.spigotmc.org/nexus/content/repositories/snapshots/"}
  :source-paths ["src"]
  :resource-paths ["resources"]
  :target-path "target/%s"
  :aot :all

  ;; Clojure and bukkit-for-clojure libraries are both provided by the Bukkit4Clojure plugin.
  ;; Make sure you have that plugin installed on your server.
  :profiles {:provided {:dependencies [[org.clojure/clojure "1.10.1"]
                                       [org.kowboy/bukkit-for-clojure "1.0.6"]
                                       ;; This dependency is provided by the server itself.
                                       [org.spigotmc/spigot-api "1.16.3-R0.1-SNAPSHOT"]]}})
