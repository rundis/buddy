(defproject niwi.be/buddy "0.1.0"
  :description "Authentication, Authorization and Sign library."
  :url "https://github.com/niwibe/buddy"
  :license {:name "Apache 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0.txt"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [commons-codec/commons-codec "1.8"]
                 [com.taoensso/nippy "2.4.1"]]
  :source-paths ["src/clojure"]
  :java-source-paths ["src/java"]
  :plugins [[codox "0.6.6"]]
  :codox {:output-dir "docs/api/clojure"
          :src-dir-uri "http://github.com/niwibe/buddy/blob/master/"
          :src-linenum-anchor-prefix "L"})