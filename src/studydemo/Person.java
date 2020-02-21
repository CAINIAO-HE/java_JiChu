package studydemo;

public class Person
{
  String name;
  int age;
  int weight;
  double height;
  String hobby;
  String sex;
 //String sleep;
  void eating() {
	  System.out.println("³Ô·¹");
  }
  void sleeping() {
	  System.out.println("Ë¯¾õ");
  }
  void study() {
	  System.out.println("studying");
  }
  void showage() {
	  System.out.println(age);
  }
  int addage() {
	  int agea;
	  agea=age+2;
	  return(agea);
  }
}
