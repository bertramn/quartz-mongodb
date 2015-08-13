(defproject com.novemberain/quartz-mongodb "2.0.0-SNAPSHOT"
  :description "A MongoDB-backed store for Quartz Scheduler and Quartzite"
  :min-lein-version "2.4.2"
  :license {:name "Apache License 2.0"}
  :dependencies [[org.slf4j/slf4j-api           "1.7.10"]
                 [org.quartz-scheduler/quartz   "2.1.7"]
                 [org.mongodb/mongo-java-driver "3.0.2"]
                 [joda-time/joda-time           "2.7"]
                 [commons-codec/commons-codec   "1.10"]
                 [org.clojure/clojure           "1.7.0"]]
  :plugins [[lein2-eclipse "2.0.0"]]
  :source-paths ["src" "src/main/clojure"]
  :java-source-paths ["src/main/java"]  ; Java source is stored separately.
  :test-paths ["test" "src/test/clojure"]
  :resource-paths ["src/main/resource"]
  :test-selectors {:all     (constantly true)
                   :focus   :focus
                   :default (constantly true)}
  :javac-options     ["-target" "1.7" "-source" "1.7"]
  :profiles {:dev {:resource-paths ["src/test/resources"]
                   :dependencies [[org.clojure/clojure       "1.7.0"]
                                  [clojurewerkz/quartzite    "1.3.0"]
                                  [com.novemberain/monger    "1.7.0"]
                                  [org.clojure/tools.logging "0.3.1" :exclusions [org.clojure/clojure]]
                                  [org.slf4j/slf4j-simple    "1.7.10"]
                                  [org.slf4j/slf4j-api       "1.7.10"]]}}
  :repositories {"sonatype" {:url "http://oss.sonatype.org/content/repositories/releases"
                             :snapshots false
                             :releases {:checksum :fail :update :always}}
                 "sonatype-snapshots" {:url "http://oss.sonatype.org/content/repositories/snapshots"
                                       :snapshots true
                                       :releases {:checksum :fail :update :always}}})
