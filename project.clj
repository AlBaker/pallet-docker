(defproject com.palletops/pallet-docker "0.1.1-SNAPSHOT"
  :description "A provider for using Pallet with Docker."
  :url "http://github.com/pallet/docker-crate"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [com.palletops/pallet "0.8.0-RC.3"]
                 [com.palletops/docker-crate "0.8.0-alpha.1"]]
  :plugins [[com.palletops/pallet-lein "0.8.0-alpha.1"]])
