
// 1. Make the class square inherit from Rectangle
public class Square extends Rectangle {
     // 2. Add a Square no-argument constructor
     public Square() {
        super();
     }

     // 3. Add a Square constructor with 1 argument for a side
     public Square(int s) {
       super(s, s);
     }

}
