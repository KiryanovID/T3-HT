import jdk.nashorn.internal.ir.annotations.Ignore;

import java.util.Arrays;

public class Values {
  private Value[] values;

  public Value[] getValues() {
    return values;
  }

  public Values() {
  }

  public Values(Value[] values) {
    this.values = values;
  }

  @Override
  public String toString() {
    return "Values{" +
        "values=" + Arrays.toString(values) +
        '}';
  }

  /*private static class Value {
    private int id;
    private String value;

    public int getId() {
      return id;
    }

    public String getValue() {
      return value;
    }

    public Value() {
    }

    public Value(int id, String value) {
      this.id = id;
      this.value = value;
    }

    @Override
    public String toString() {
      return "Value{" +
          "id=" + id +
          ", value='" + value + '\'' +
          '}';
    }
  }*/
}
