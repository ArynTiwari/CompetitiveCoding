class Node {
  constructor(data) {
    this.data = data;
    this.next = null;
  }
}
class CircularLL {
  constructor() {
    this.head = null;
    this.tail = null;
    this.size = 0;
  }
  add(data) {
    const newNode = new Node(data);
    if (!this.head) {
      this.head = newNode;
      this.tail = newNode;
      newNode.next = this.head;
      this.size++;
    } else {
      this.tail.next = newNode;
      newNode.next = this.head;
      this.tail = newNode;
      this.size++;
    }
  }
  getSize() {
    return this.size;
  }
  print() {
    if (!this.head) {
      console.log("Circular Linked List is empty.");
      return;
    }
    let current = this.head;
    do {
      console.log(current.data);
      current = current.next;
    } while (current !== this.head);
  }
}
let ll = new CircularLL();
ll.add(10);
ll.add(20);
console.log(ll.getSize());
ll.print();
