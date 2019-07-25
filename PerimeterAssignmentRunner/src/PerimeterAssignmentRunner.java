import edu.duke.*;
import java.io.File;

public class PerimeterAssignmentRunner {
    public double getPerimeter (Shape s) {
        // Start with totalPerim = 0
        double totalPerim = 0.0;
        // Start wth prevPt = the last point
        Point prevPt = s.getLastPoint();
        // For each point currPt in the shape,
        for (Point currPt : s.getPoints()) {
            // Find distance from prevPt point to currPt
            double currDist = prevPt.distance(currPt);
            // Update totalPerim by currDist
            totalPerim = totalPerim + currDist;
            // Update prevPt to be currPt
            prevPt = currPt;
        }
        // totalPerim is the answer
        return totalPerim;
    }

    public int getNumPoints (Shape s) {
        int numPoints = 0;
        Point prevPoint = s.getLastPoint();
        for(Point currPoint : s.getPoints()){
            numPoints++;
        }
        return numPoints;
    }

    public double getAverageLength(Shape s) {
        double totalPerim = 0;
        int numPoints = 0;
        Point prevPoint = s.getLastPoint();
        for(Point currPoint : s.getPoints()){
            double currDist = prevPoint.distance(currPoint);
            totalPerim += currDist;
            prevPoint = currPoint;
            numPoints++;
        }
        if(numPoints != 0) {
            return totalPerim/(double)numPoints;
        }
        return 0.0;
    }

    public double getLargestSide(Shape s) {
        double largestSide = 0;
        Point prevPt = s.getLastPoint();
        // For each point currPt in the shape,
        for (Point currPt : s.getPoints()) {
            // Find distance from prevPt point to currPt
            double currDist = prevPt.distance(currPt);
            largestSide = Math.max(largestSide,currDist);
            prevPt = currPt;
        }
        return largestSide;
    }

    public double getLargestX(Shape s) {
        // Put code here
        double largestX = Integer.MIN_VALUE;
        Point prevPt = s.getLastPoint();
        largestX = Math.max(largestX,prevPt.getX());
        // For each point currPt in the shape,
        for (Point currPt : s.getPoints()) {
            largestX = Math.max(largestX,currPt.getX());
        }
        return largestX;
    }

    public double getLargestPerimeterMultipleFiles() {
        double largestPerimeter = -1;
        DirectoryResource dr = new DirectoryResource();
        for (File f : dr.selectedFiles()) {
            FileResource fr = new FileResource(f);
            Shape s = new Shape(fr);
            largestPerimeter = Math.max(largestPerimeter,getPerimeter(s));
        }
        return largestPerimeter;
    }

    public String getFileWithLargestPerimeter() {
        File temp = null;
        double largestPerimeter = -1;
        DirectoryResource dr = new DirectoryResource();
        for (File f : dr.selectedFiles()) {
            FileResource fr = new FileResource(f);
            Shape s = new Shape(fr);
            if(largestPerimeter < getPerimeter(s)) temp = f;
            largestPerimeter = Math.max(largestPerimeter,getPerimeter(s));
        }
        return temp.getName();
    }

    public void testPerimeter () {
        FileResource fr = new FileResource();
        Shape s = new Shape(fr);
        System.out.println("perimeter = " + getPerimeter(s));
        System.out.println("numOfPoints = " + getNumPoints(s));
        System.out.println("AverageLength = " + getAverageLength(s));
        System.out.println("Maximum Length = " + getLargestSide(s));
        System.out.println("Largest X  = " + getLargestX(s));
        testFileWithLargestPerimeter();
        //testPerimeterMultipleFiles();

    }

    public void testPerimeterMultipleFiles() {
        System.out.println("largest perimeter among files = " + getLargestPerimeterMultipleFiles());
    }

    public void testFileWithLargestPerimeter() {
        System.out.println("File with largest perimeter = " + getFileWithLargestPerimeter());
    }

    // This method creates a triangle that you can use to test your other methods
    public void triangle(){
        Shape triangle = new Shape();
        triangle.addPoint(new Point(0,0));
        triangle.addPoint(new Point(6,0));
        triangle.addPoint(new Point(3,6));
        for (Point p : triangle.getPoints()){
            System.out.println(p);
        }
        double peri = getPerimeter(triangle);
        System.out.println("perimeter = "+peri);
    }

    // This method prints names of all files in a chosen folder that you can use to test your other methods
    public void printFileNames() {
        DirectoryResource dr = new DirectoryResource();
        for (File f : dr.selectedFiles()) {
            System.out.println(f);
        }
    }

}
