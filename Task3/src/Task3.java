import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.*;


public class Task3 {
  public static void main(String[] args) {
    File file1 = new File(args[0]);
    File file2 = new File(args[1]);

    ObjectMapper objectMapper = new ObjectMapper();
    objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    try {
      Tests tests =  objectMapper.readValue(file1, Tests.class);
      Values values = objectMapper.readValue(file2, Values.class);

      List<Tests> testsList = null;
      if(tests.getValues() != null){
        testsList = Arrays.asList(tests.getValues());
      }
      Value[] list = values.getValues();

      for(Value v : list){
        if(v.getId() == tests.getId()){
          tests.setValue(v.getValue());
        }
        else{
          for(Tests t : testsList){
            if(v.getId() == t.getId()){
              t.setValue(v.getValue());
            }
          }
        }
      }
      System.out.println("Enter the path to save");
      Scanner scanner = new Scanner(System.in);
    objectMapper.writeValue(new File(scanner.nextLine()), tests);
    objectMapper.writeValueAsString(tests);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
