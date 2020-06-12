package com.sjzc.javaTest.leetcode;

import lombok.Data;

/**
 * @author zhaochong
 * @Description
 * @create: 2020/5/14 8:31 下午
 **/
public class MyLinkedList {

    private Node First;
    private int length = 0;

    MyLinkedList(){
        First = new Node(0);
    }
    public int get(int index){
        int current = 0;
        if (index > length) {
            return -1;
        }
        Node currentNode = First.next;
        while (current < length) {
            currentNode = currentNode.next;
            current++;
        }
        return currentNode.val;
    }
    public void addAtHead(int val){
        Node f = new Node(val);
        f.next = First.next;
        First.next = f;
        length++;
    }
    public void addAtTail(int val){
        Node temp = First;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node t = new Node(val);
        temp.next = t;
        length++;
    }

    public void addAtIndex(int index,int val){
        if (index > length) {
            this.addAtTail(val);
            return;
        }
        if (index <= 0) {
            this.addAtHead(val);
            return;
        }
        if (index == length) {
            this.addAtTail(val);
        }
        int current = 0;
        Node currentNode = First;
        while (current < index) {
            currentNode = currentNode.next;
            current++;
        }
        Node other = new Node(0);
        other.next = currentNode.next;
        Node insertNode = new Node(val);
        currentNode.next = insertNode;
        insertNode.next = other.next;
        length++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index > length) {
            return;
        }
        int current = 0;
        Node currentNode = First;
        while (current < index) {
            currentNode = currentNode.next;
            current++;
        }
        currentNode.next = currentNode.next.next;
    }

    public void print() {
        Node temp = First.next;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    @Data
    class Node{
        int val;
        Node next;

        Node(int t) {
            val = t;
        }
    }

    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addAtTail(1);
        linkedList.addAtTail(2);
        linkedList.addAtTail(3);
        linkedList.addAtHead(23);
        // linkedList.deleteAtIndex(1);
        linkedList.addAtIndex(-2,111);
        linkedList.print();
    }
}
