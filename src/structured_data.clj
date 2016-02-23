(ns structured-data)

(defn do-a-thing [x]
  (let [double_number (+ x x)]
    (Math/pow double_number double_number)))

(defn spiff [v]
  (let [zero_elem (get v 0) second_elem (get v 2)]
    (if (and (not zero_elem) (not second_elem)) 
      v
      (+ zero_elem second_elem))))

(defn cutify [v]
  (conj v "<3"))

(defn spiff-destructuring [v]
  (let [[a b c] v]
    (if (and (not a) (not c))
      v
      (+ a c))))

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
  (= (width rectangle) (height rectangle)))

(defn area [rectangle]
  (* (width rectangle) (height rectangle)))

(defn contains-point? [rectangle point]
  (let [[[rx1 ry1] [rx2 ry2]] rectangle [px py] point]
    (and (>= ry2 py ry1) (>= rx2 px rx1))))

(defn contains-rectangle? [outer inner]
  (let [[point1 point2] inner]
    (and (contains-point? outer point1) (contains-point? outer point2))))

(defn title-length [book]
  (count (:title book)))

(defn author-count [book]
  (count (:authors book)))

(defn multiple-authors? [book]
  (if (>= (author-count book) 2)
    true
    false))

(defn add-author [book new-author]
  (let [orig-authors (:authors book)]
    (assoc book :authors (conj orig-authors new-author))))

(defn alive? [author]
  (let [death (:death-year author)]
    (if (not death)
     true 
     false)))

(defn element-lengths [collection]
  (let [getcount (fn [x]
        (count x))]
    (map getcount collection)))

(defn second-elements [collection]
  (let [get_sec_elem (fn [x] 
                       (get x 1))]
    (map get_sec_elem collection)))

(defn titles [books]
  (let [get_title (fn [x]
                    (:title x))]
    (map get_title books)))

(defn monotonic? [a-seq]
  (or (apply >= a-seq) (apply <= a-seq)))

(defn stars [n]
  :-)

(defn toggle [a-set elem]
  :-)

(defn contains-duplicates? [a-seq]
  :-)

(defn old-book->new-book [book]
  :-)

(defn has-author? [book author]
  :-)

(defn authors [books]
  :-)

(defn all-author-names [books]
  :-)

(defn author->string [author]
  :-)

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
