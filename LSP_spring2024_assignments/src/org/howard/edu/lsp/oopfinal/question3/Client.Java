package org.howard.edu.lsp.oopfinal.question3;

//Client.java
public class Client {
 public static void main(String[] args) {
     Shape c = ShapeFactory.createShape("circle");
     c.draw();
     Shape r = ShapeFactory.createShape("rectangle");
     r.draw();
 }
}