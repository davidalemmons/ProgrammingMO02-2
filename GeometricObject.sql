--------------------------------
|        GeometricObject        |
--------------------------------
| - color: String               |
| - filled: boolean             |
--------------------------------
| + GeometricObject()           |
| + GeometricObject(color: String, filled: boolean) |
| + getColor(): String          |
| + setColor(color: String): void |
| + isFilled(): boolean         |
| + setFilled(filled: boolean): void |
| + toString(): String          |
--------------------------------

--------------------------------
|           Triangle            |
--------------------------------
| - side1: double               |
| - side2: double               |
| - side3: double               |
--------------------------------
| + Triangle()                  |
| + Triangle(side1: double, side2: double, side3: double) |
| + getSide1(): double          |
| + setSide1(side1: double): void |
| + getSide2(): double          |
| + setSide2(side2: double): void |
| + getSide3(): double          |
| + setSide3(side3: double): void |
| + getArea(): double           |
| + getPerimeter(): double      |
| + toString(): String          |
--------------------------------
