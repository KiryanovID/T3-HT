public class Task1 {
  public static void main(String[] args) {
    extracted(args[0],args[1]);
  }


  private static void extracted(String firstNum, String secondNum) {
    int n = Integer.parseInt(firstNum);
    int m = Integer.parseInt(secondNum);
    int temp = m;
    StringBuilder startArray = new StringBuilder();
    StringBuilder result = new StringBuilder("1");
    for (int i = 1; i < n + 1; i++) {
      startArray.append(i);
    }
    char isk = 0;
    while (isk != startArray.charAt(0)) {
      isk = startArray.charAt((m - 1));
      result.append(isk);
      m += temp - 1;
      if (startArray.length() < m) {
        startArray.append(startArray);
      }
    }
    result.deleteCharAt(result.length() - 1);
    System.out.println(result);
  }
}

