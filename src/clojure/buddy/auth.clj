;; Copyright 2013 Andrey Antukh <niwi@niwi.be>
;;
;; Licensed under the Apache License, Version 2.0 (the "License")
;; you may not use this file except in compliance with the License.
;; You may obtain a copy of the License at
;;
;;     http://www.apache.org/licenses/LICENSE-2.0
;;
;; Unless required by applicable law or agreed to in writing, software
;; distributed under the License is distributed on an "AS IS" BASIS,
;; WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
;; See the License for the specific language governing permissions and
;; limitations under the License.

(ns buddy.auth
  (:import (buddy.exceptions UnauthorizedAccessException)))

(defn authenticated?
  "Test if a current request is
  authenticated or not."
  [request]
  (boolean (:identity request)))

(defn throw-unauthorized
  ([] (throw-unauthorized {}))
  ([metadata]
   (throw (UnauthorizedAccessException. metadata))))
