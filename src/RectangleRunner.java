public class RectangleRunner {
    public static void main(String[] args) {
        //Plot 1
        Rectangle plot1 = new Rectangle(150, 200);

        //Plot 2
        Rectangle plot2 = new Rectangle(125);

        //Plot 3
        Rectangle plot3 = new Rectangle();

        //Use setter to change width(and length for plot 2 so it remains a square)
        plot1.setterWid(75);
        plot2.setterLen(75);
        plot2.setterWid(75);
        plot3.setterWid(75);

        //Calculate each of their areas
        int area1 = plot1.calculateArea();
        int area2 = plot2.calculateArea();
        int area3 = plot3.calculateArea();

        //Calculate and print total area
        System.out.println("These three plotes rquires " + (area1 + area2 + area3) + " square feet of seed");
    }


}
