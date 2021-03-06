(defproject jarohen/chord.example ""
  :description "An example project to show Chord in action"
  :url "https://github.com/james-henderson/chord/example-project"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0-alpha4"]
                 [jarohen/chord "0.6.0"]

                 [ring/ring-core "1.2.0"]
                 [compojure "1.1.5"]
                 [hiccup "1.0.4"]
                 [ring-middleware-format "0.4.0"]
                 [ring-basic-authentication "1.0.5"]

                 [org.clojure/core.async "0.1.346.0-17112a-alpha"]
                 [org.clojure/clojurescript "0.0-2727"]

                 [jarohen/flow "0.3.0-alpha3"]]

  :plugins [[lein-pdo "0.1.1"]
            [jarohen/lein-frodo "0.4.1"]
            [lein-cljsbuild "1.0.3"]
            [lein-shell "0.4.0"]
            [jarohen/simple-brepl "0.2.1"]]

  :exclusions [org.clojure/clojure]

  :frodo/config-resource "chord-example.edn"

  :aliases {"dev" ["do"
                   ["shell" "mkdir" "-p"
                    "target/resources"]
                   ["pdo"
                    ["cljsbuild" "auto"]
                    "frodo"]]}

  :source-paths ["src"]
  
  :resource-paths ["resources" "target/resources"]

  :cljsbuild {:builds [{:source-paths ["src"]
                        :compiler {:output-to "target/resources/js/chord-example.js"
                                   :optimizations :whitespace
                                   :pretty-print true}}]})
