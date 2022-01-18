package lib;

import java.lang.annotation.Retention;

public class LinkedList<T> {
    Node header;
  class Node{
      T data;
      Node next;
  }

  public Node insert(T data){
      Node node = new Node();
      node.data = data;
      node.next = null;
      if (header == null){
          header = node;
      }
      else{
          Node temp = header;
          while(temp.next != null){
              temp = temp.next;
          }
          temp.next = node;
      }

      return node;
  }

  public void print(){
      Node temp = header;
      while(temp.next != null){
          System.out.println("values"+ temp.data);
          temp = temp.next;
      }
      System.out.println("values"+ temp.data);
  }

  public void addToFirst(T data){
      Node node = new Node();
      node.data = data;
      node.next = header;
      header = node;
  }

    public void delete(int index){
      if (index == 0){
          header = header.next;
      }
        Node temp = header;
        for(int i =0; i < index-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    public void midElement(){
       Node node = header;
       Node nodeDouble = header;
       while (node.next != null && nodeDouble.next != null){
           node = node.next;
           nodeDouble = node.next.next;
       }
       System.out.println("mid element"+node.data);
    }

    public void test1(){

    }
    public void test2(){

    }

    public void test3(){

    }

    public void test4(){

    }



}
