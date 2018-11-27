/**
Program to print Hello, COMP 163
@James Thomas
*/
public class Repo1 {
  String string;
  /**
  This method holds String for Repo1
  @param s string
  */
  public Repo1(String s) {
    string = s;
  }
  
  public void Print() {
    System.out.println(string);
  }
  public static void main(String[] args) {
    Repo1 stuff1 = new Repo1("Hello, COMP 163");
    stuff1.Print();
    Repo1 stuff2 = new Repo1("Goodbye COMP 163");
    stuff2.Print();
  }
}