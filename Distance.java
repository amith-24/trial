import java.util.Scanner;
import java.io.*;
import java.lang.Math;
public class Distance
{
  // Return the Euclidean distance between x and y.
  public static double distance(double[] x, double[] y)
  { 
    double total = 0;
    double buffer[] = new double[x.length];
    for(int i = 0; i < x.length; i++)
    {
      buffer[i] = ((x[i] - y[i]) * (x[i]- y[i]));
      total = total + buffer[i];
    }
    double edst = Math.sqrt(total); 
    return edst;
  }
// Entry point (DO NOT EDIT).
  public static void main(String[] args) 
  {
    double[] x = {-9.0, 1.0, 10.0, -1.0, 1.0};
    double[] y = {-5.0, 9.0, 6.0, 7.0, 4.0};
    StdOut.println(distance(x, y));
  }
}