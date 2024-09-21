// class Node {
//   constructor(value) {
//     this.value = value;
//     this.next = null;
//   }
// }
const Node = require("./Node");
class Queue {
  constructor() {
    this.front = null;
    this.rear = null;
    this.length = 0;
  }

  // Add an element to the end of the queue
  enqueue(element) {
    const newNode = new Node(element);
    if (this.isEmpty()) {
      this.front = this.rear = newNode;
    } else {
      this.rear.next = newNode;
      this.rear = newNode;
    }
    this.length++;
  }

  // Remove an element from the front of the queue
  dequeue() {
    if (this.isEmpty()) {
      return "Queue is empty";
    }
    const dequeuedNode = this.front;
    this.front = this.front.next;
    if (this.front === null) {
      this.rear = null;
    }
    this.length--;
    return dequeuedNode.value;
  }

  // Get the front element of the queue
  getFront() {
    if (this.isEmpty()) {
      return "Queue is empty";
    }
    return this.front.value;
  }

  // Check if the queue is empty
  isEmpty() {
    return this.length === 0;
  }

  // Get the size of the queue
  size() {
    return this.length;
  }

  // Print the elements of the queue
  printQueue() {
    let current = this.front;
    let queueStr = "";
    while (current) {
      queueStr += current.value + (current.next ? " -> " : "");
      current = current.next;
    }
    console.log(queueStr);
  }
}
module.exports = Queue;
