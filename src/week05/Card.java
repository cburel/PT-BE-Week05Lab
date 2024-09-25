package week05;

public class Card {
  String name;
  String field;
  int value;
  
  private String getName() {
    return this.name;
  }
  private void setName(String name) {
    this.name = name;
  }
  private String getField() {
    return this.field;
  }
  private void setField(String field) {
   this.field = field; 
  }
  private int getValue() {
    return this.value;
  }
  private void setValue(int value) {
    this.value = value;
  }
  
  public Card() {}
  
  public Card(String name, String field, int value) {
    this.name = name;
    this.field = field;
    this.value = value;
  }
  
  public void describe() {
    System.out.println("Name: " + name);
    System.out.println("Field: " + field);
    System.out.println("Value: " + value);
  }
}
