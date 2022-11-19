import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
  public static void main(String[] args) {
    extracted(getFloats(args[0]), getFloatList(args[1]));
  }

  private static float[] getFloats(String filePath) {
    float[] coordinatesCircle = new float[3];
    try (Scanner scanner = new Scanner(new File(filePath))) {
      int count = 0;
      while (scanner.hasNextFloat()) {
        coordinatesCircle[count] = scanner.nextFloat();
        count++;
      }
    } catch (Exception e) {
      System.out.println("error when reading the first file");
    }
    return coordinatesCircle;
  }

  private static List<Float> getFloatList(String filePath) {
    List<Float> coordinatesDot = new ArrayList<>();
    try (Scanner scanner = new Scanner(new File(filePath))) {
      int count = 0;
      while (scanner.hasNextFloat() | count > 100) {
        coordinatesDot.add(scanner.nextFloat());
        count++;
      }
    } catch (Exception e) {
      System.out.println("error when reading the second file");
    }
    return coordinatesDot;
  }

  private static void extracted(float[] coordinatesCircle, List<Float> coordinatesDot) {
    float coordinateXCircle = coordinatesCircle[0];
    float coordinateYCircle = coordinatesCircle[1];
    float radiusSqr = (float) Math.pow(coordinatesCircle[2], 2);
    for (int i = 0; i < coordinatesDot.size(); i += 2) {
      float result = (float) (Math.pow((coordinateXCircle - coordinatesDot.get(i)), 2) + Math.pow((coordinateYCircle - coordinatesDot.get(i + 1)), 2));
      if (result == radiusSqr) {
        System.out.println(0);
      } else if (result < radiusSqr) {
        System.out.println(1);
      } else if (result > radiusSqr) {
        System.out.println(2);
      }
    }
  }
}
