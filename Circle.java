/** complete */

public class Circle {

    private Point center; 
    private int radius;


    /** constructor */
    public Circle()
    {
        center = new Point(0,0);
        radius = 1;
    }
    public Circle(Point userGivenPoint, int userGivenRadius)
    {
        center = new Point(0,0);
        radius = userGivenRadius;
    }


    /** getters */
    public Point getCenter()
    {
        return center;
    }

    public int getRadius()
    {
        return radius;
    }



    /** setters */
    public void setCenter(Point userGivenCenter)
    {
        center = userGivenCenter;
    }

    public void setRadius(int userGivenRadius)
    {
        radius = userGivenRadius;
    }



    /** compareTo */
    public boolean equals(Circle otherCircle) 
    {

        if (this.radius == otherCircle.radius)
        {
            return true;
        }
            return false;
    }

    /** area() */
    public double area() 
    {
        return Math.PI * radius * radius;
    }

    /** toString */
    public String toString() 
    {
        return"The area of the circle is "+ area()+
	            " and your radius is "+ getRadius();
    }

}
