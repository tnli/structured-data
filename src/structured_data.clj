(ns structured-data)

(defn do-a-thing [x]
  (let [doublex (+ x x)]
    (Math/pow doublex doublex)))

(defn spiff [v]
  (+ (get v 0) (get v 2)))

(defn cutify [v]
  (conj v "<3"))

(defn spiff-destructuring [v]
  (let [[x y z] v]
    (+ x z)))

(defn point [x y]
  [x y])

(defn rectangle [bottom-left top-right]
  [bottom-left top-right])

(defn width [rectangle]
  (let [[[x1 y1] [x2 y2]] rectangle]
    (- x2 x1)))

(defn height [rectangle]
  (let [[[x1 y1] [x2 y2]] rectangle]
    (- y2 y1)))

(defn square? [rectangle]
  (if (== (width rectangle) (height rectangle)) true false))

(defn area [rectangle]
  (* (width rectangle) (height rectangle)))

(defn contains-point? [rectangle point]
  (let [[[[x1 y1] [x2 y2]] [x3 y3]] [rectangle point]]
    (if (and (<= x1 x3 x2) (<= y1 y3 y2)) true false)))

(defn contains-rectangle? [outer inner]
  (let [[[[x1 y1] [x2 y2]] [[x3 y3] [x4 y4]]] [outer inner]]
    (if (and (<= x1 x3 x2) (<= y1 y3 y2) (<= x1 x4 x2) (<= y1 y4 y2)) true false)))

(defn title-length [book]
  (count (:title book)))

(defn author-count [book]
  (count (:authors book)))

(defn multiple-authors? [book]
  (if (< 1 (author-count book)) true false))

(defn add-author [book new-author]
  (assoc book :authors (conj (book :authors) new-author)))

(defn alive? [author]
  (if (contains? author :death-year) false true))

(defn element-lengths [collection]
  (map count collection))

(defn second-elements [collection]
  (let [rest-elements (fn [x] (first (rest x)))]
    (map rest-elements collection)))

(defn titles [books]
  (let []
    (map :title books)))

(defn monotonic? [a-seq]
  (if (apply <= a-seq) true (if (apply >= a-seq) true false)))

(defn stars [n]
  (apply str (repeat n "*")))

(defn toggle [a-set elem]
  (if (contains? a-set elem) (disj a-set elem) (conj a-set elem)))

(defn contains-duplicates? [a-seq]
  (if (< (count (set a-seq)) (count a-seq)) true false))

(defn old-book->new-book [book]
  (assoc book :authors (set (book :authors))))

(defn has-author? [book author]
  (contains? (book :authors) author))

(defn authors [books]
    (set (apply clojure.set/union (map :authors books))))

(defn all-author-names [books]
  (let [author-names
       (fn [book] (map :name (:authors book)))]
  (set (apply clojure.set/union (map author-names books)))))

(defn author->string [author]
  (str (let (author :name)) (let (author :birth-year) (author :death-year))))

(defn authors->string [authors]
  :-)

(defn book->string [book]
  :-)

(defn books->string [books]
  :-)

(defn books-by-author [author books]
  :-)

(defn author-by-name [name authors]
  :-)

(defn living-authors [authors]
  :-)

(defn has-a-living-author? [book]
  :-)

(defn books-by-living-authors [books]
  :-)

; %________%
