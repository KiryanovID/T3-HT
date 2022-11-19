import java.util.Arrays;

public class Tests {
  private int id;
  private String title;
  private String value;
  private Tests[] values;

  public int getId() {
    return id;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public String getTitle() {
    return title;
  }

  public String getValue() {
    return value;
  }

  public Tests[] getValues() {
    return values;
  }

  public Tests(int id, String title, String value, Tests[] values) {
    this.id = id;
    this.title = title;
    this.value = value;
    this.values = values;
  }

  public Tests() {
  }

  @Override
  public String toString() {
    return "Test{" +
        "id=" + id +
        ", title='" + title + '\'' +
        ", value='" + value + '\'' +
        ", values=" + Arrays.toString(values) +
        '}';
  }
}
