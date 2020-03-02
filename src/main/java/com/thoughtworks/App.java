package com.thoughtworks;

public class App {

  public static void main(String[] args) {
    MemoryRepository<Student> students = new MemoryRepository<>();
    students.save("3", new Student("3","张三"));
    students.save("4", new Student("4","李四"));
    students.save("5", new Student("5","王五"));
    students.save("6", new Student("6","赵六"));
    students.save("7", new Student("7","钱七"));

    System.out.println(students.get("3").toString());
    students.delete("4");
    students.update("5", new Student("5", "冯五"));
    System.out.println("Students' info:");
    RepositoryUtil.printList(students.list());
  }
}
