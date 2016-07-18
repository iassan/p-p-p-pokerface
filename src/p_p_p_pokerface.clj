(ns p-p-p-pokerface)

(defn rank [card]
  (let [[rank _] card
        high-ranks {\T 10, \J 11, \Q 12, \K 13, \A 14}]
    (if (Character/isDigit rank) (Integer/valueOf (str rank)) (high-ranks rank))))

(defn suit [card]
  (let [[_ suit] card]
    (str suit)))

(defn repeats [hand]
  (frequencies (vals (frequencies (map rank hand)))))

(defn pair? [hand]
  (= ((repeats hand) 2) 1))

(defn three-of-a-kind? [hand]
  (= ((repeats hand) 3) 1))

(defn four-of-a-kind? [hand]
  (= ((repeats hand) 4) 1))

(defn flush? [hand]
  nil)

(defn full-house? [hand]
  nil)

(defn two-pairs? [hand]
  (= ((repeats hand) 2) 2))

(defn straight? [hand]
  nil)

(defn straight-flush? [hand]
  nil)

(defn value [hand]
  nil)
