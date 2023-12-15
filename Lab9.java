package homework;

public class Lab9 {
    public static void main(String[] args) {
        MyPoint[][] pointArray = new MyPoint[2][3];
        pointArray[0][0] = new MyPoint(0.5, 1.2);
        pointArray[0][1] = new MyPoint(0.0, 3.14);
        pointArray[0][2] = new MyPoint(15.0, 27.5);
        pointArray[1][0] = new MyPoint(6.6, 7.7);
        pointArray[1][1] = new MyPoint(1.2, 2.1);
        pointArray[1][2] = new MyPoint(12.0, 127.0);
        
        for (int i = 0; i < pointArray.length; i++) {
            for (int j = 0; j < pointArray[i].length; j++) {
                System.out.println("Array[" + i + "][" + j + "] = (" + pointArray[i][j].getX() + ", " + pointArray[i][j].getY() + ")");
            }
        }
    }
}
