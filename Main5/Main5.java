import java.util.Scanner;

class Main5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("名前：");
    String firstName = scanner.next();

    System.out.println("名字：");
    String lastName = scanner.next();

    System.out.println("年齢：");
    int age = scanner.nextInt();

    System.out.println("身長(m)：");
    double height = scanner.nextDouble();

    System.out.println("体重(kg)：");
    double weight = scanner.nextDouble();


    Person5.printData(firstName, lastName, age, height, weight);
  }

}
