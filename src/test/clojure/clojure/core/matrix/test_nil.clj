(ns clojure.core.matrix.test-nil
  (:use clojure.core.matrix)
  (:use clojure.core.matrix.utils)
  (:require [clojure.core.matrix.protocols :as mp])
  (:require [clojure.core.matrix.operators :as op])
  (:require [clojure.core.matrix.compliance-tester])
  (:refer-clojure :exclude [vector?])
  (:use clojure.test))

(deftest test-scalar-properties
  (is (not (array? nil)))
  (is (nil? (shape nil)))
  (is (== 1 (ecount nil))))

(deftest test-nil 
  (is (nil? (transpose nil)))
  (is (== 0 (dimensionality nil)))
  (is (nil? (shape nil))))

(deftest test-arithmentic
  (is (error? (add nil 1))))

(deftest test-join 
  (is (e= [nil nil] (join [nil] [nil]))))

(deftest instance-tests
  (clojure.core.matrix.compliance-tester/instance-test nil))
