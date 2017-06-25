/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.ia;

/**
 *
 * @author Faizaan Chishtie
 */
public class TriangleIntegrate {

    private double a = 0;
    private double b = 0;
    private double c = 0;
    private double d = 0;

    /**
     * Constructor for Triangle Integrate object
     *
     * @param a the coefficient of the highest degree of x
     * @param b the coefficient of the smallest degree of x
     * @param c the position of the apex of the triangle from 0 to height
     */
    public TriangleIntegrate(double a, double b, double c) {
        this.a += a;
        this.b += b;
        this.c += c;
    }

    /**
     * Function that returns the y intercept of the parabola
     *
     * @param a the coefficient of the highest degree of x
     * @param b the coefficient of the smallest degree of x
     * @param c the constant
     * @return Returns constant
     */
    public static double y_intercept(double a, double b, double c) {
        //ax^2 + bx + c = y    
        return c;
    }

    /**
     * Function that computes the heights of triangles based on their position
     * on the function
     *
     * @param a coefficient of x
     * @param b constant
     * @param c array of the x intercepts
     * @param d number of triangles per unit
     * @param t object t
     * @return Returns an array of heights
     */
    public static double[] height_array(double a, double b, double[] c, int d, TriangleIntegrate t) {
        // y = -ax^2 + b assume a already - 
        int n = (int) c[0]; //takes the + x intercept
        int times = d; // takes d and stores as times
        double[] height_list = new double[n]; // creates an array with length based on the x intercept
        if (times == n) { // n is intercept
            double[] height_with_increments = TriangleIntegrate.increments(a, b, d, t);
            return height_with_increments;
        }
        if (times < n) {
            double[] height_with_increments = TriangleIntegrate.bigger_increments(t, d);
            return height_with_increments;
        }
        if (times > n) {
            double[] height_with_increments = TriangleIntegrate.increments(a, b, d, t);
            return height_with_increments;
        }
        return height_list;
    }

    /**
     * Function that computes the x_intercepts of the parabola given
     *
     * @param a coefficient of x
     * @param b constant
     * @return returns the x intercepts in an array
     */
    public static double[] x_intercepts(double a, double b) {
        // y = 0 = -ax^2 + b 
        double[] roots = new double[2];
        double sum = -b / a;
        double root_0 = Math.sqrt(sum);
        roots[0] = root_0;
        roots[1] = -root_0;
        return roots;
    }

    /**
     * Function that computes the area of the individual triangles and stores
     * them in an array
     *
     * @param a array that receives the heights of the heights of the triangles
     * @param length_of_base receives the length of base
     * @return returns the area of the triangles in an array
     */
    public static double[] triangle_array(double[] a, double length_of_base) {
        // area of a triangle = a*b/2
        double[] area = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            double tri_area = a[i] * length_of_base / 2;
            area[i] = tri_area;
        }
        return area;
    }

    /**
     * Function that returns the sums of the areas
     *
     * @param a array of heights to compute the sums of the areas of the
     * constituent triangles.
     * @return returns the sums of areas
     */
    public static double ret_area(double[] a) {
        double c = 0;
        for (int i = 0; i < a.length; i++) {
            c += a[i];
        }
        return c;
    }

    /**
     * Function that takes the increments
     *
     * @param a x coefficient
     * @param b constant
     * @param c times per unit
     * @param t object triangle
     * @return returns triangle per unit
     */
    public static double[] increments(double a, double b, int c, TriangleIntegrate t) {
        double[] height = new double[c];
        double x_intercept = Math.sqrt(-b / a);
        double times_per_unit = x_intercept / c;
        for (int i = 0; i < c; i++) {
            double times_factor = times_per_unit;
            double x = TriangleIntegrate.apex_triangle(i * times_factor, t); //takes count and removes that factor from i;
            double x_value = a * x * x;
            double sum = x_value + b;
            height[i] = sum;
        }
        return height;
    }

    /**
     * Function that calculates the summit of the triangle.
     *
     * @param a unit_value*times_factor
     * @param t object t
     * @return returns the x coordinate of the height of the height of the
     * triangle.
     */
    public static double apex_triangle(double a, TriangleIntegrate t) {
        double position_height = t.c;
        double b_pos = position_height;
        double factor_minus = a + b_pos;
        return factor_minus;
    }

    /**
     * Function that calculates bigger increments.
     *
     * @param t object t
     * @param c times integer
     * @return returns height array
     */
    public static double[] bigger_increments(TriangleIntegrate t, int c) {
        double[] height = new double[c];
        double x_int = Math.sqrt(-t.b / t.a);
        double tp_bu = x_int / c;
        for (int i = 0; i < c; i++) {
            double x = TriangleIntegrate.apex_triangle(i * tp_bu, t);
            double x_value = t.a * x * x;
            double sum = x_value + t.b;
            height[i] = sum;
        }
        return height;
    }

   
    /**
     * Function that calculates the summit of the triangle.
     * 
     * @param a the factor to multiply 
     * @param t object t
     * @return returns the x coordinate of the triangle's height
     */
    /*
    public static double bigger_apex_triangle(double a, TriangleIntegrate t) {
        double position_height = t.c;
        double b_pos = position_height * a;
        return b_pos;
    }
    */
    
    /**
     * Function that returns the x coordinate of the first unit height
     * 
     * @param t Object t
     * @param c Times c
     * @return returns height
     */
    public static double first_height(TriangleIntegrate t, int c){
       double x_int = Math.sqrt(-t.b / t.a);
       if (x_int < c){
           return Math.sqrt((TriangleIntegrate.increments(t.a, t.b, c, t)[1]-t.b)/t.a);
       }
       if (x_int > c){
           return Math.sqrt((TriangleIntegrate.increments(t.a, t.b, c, t)[1]-t.b)/t.a);
       }
       if (x_int == c) { 
           return Math.sqrt((TriangleIntegrate.increments(t.a, t.b, c, t)[1]-t.b)/t.a);
        }
       return 0;
    }
    
}
