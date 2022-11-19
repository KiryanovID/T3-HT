public class Value {
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
}