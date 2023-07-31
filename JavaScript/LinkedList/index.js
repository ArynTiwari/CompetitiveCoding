class Node {
  constructor(data) {
    this.data = data;
    this.next = null;
  }
}
class LinkedList {
  constructor() {
    this.head = null;
    this.size = 0;
  }
  isEmpty() {
    return this.size;
  }
  getSize() {
    return this.size;
  }
  append(data) {
    const newNode = new Node(data);

    if (!this.head) {
      this.head = newNode;
    } else {
      let current = this.head;
      while (current.next) {
        current = current.next;
      }
      current.next = newNode;
    }

    this.size++;
  }
  nthFromLast(n) {
    let fast = this.head,
      slow = this.head;
    for (let i = 0; i < n; i++) {
      if (fast === null) {
        return -1;
      }
      fast = fast.next;
    }
    while (fast != null) {
      slow = slow.next;
      fast = fast.next;
    }
    return slow.data;
  }
  insertAtIndex(data, pos) {
    if (pos < 0 || pos > this.size) {
      return null;
    }

    const newNode = new Node(data);

    if (pos === 0) {
      newNode.next = this.head;
      this.head = newNode;
    } else {
      let current = this.head;
      for (let i = 1; i < pos; i++) {
        current = current.next;
      }
      newNode.next = current.next;
      current.next = newNode;
    }

    this.size++;
  }
  prepend(data) {
    let newNode = new Node(data);
    if (!this.head) {
      this.head = newNode;
      this.size++;
      return;
    }
    newNode.next = this.head;
    this.head = newNode;
    this.size++;
  }
  deleteMiddle() {
    if (this.head === null || this.head.next === null) {
      return null;
    }
    let fast = this.head,
      slow = this.head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    let curr = this.head,
      prev = null;
    while (curr !== slow) {
      prev = curr;
      curr = curr.next;
    }
    prev.next = curr.next;
  }
  oddEven() {
    let odd = this.head,
      even = this.head.next,
      evenStart = this.head.next;
    while (even != null && even.next != null) {
      odd.next = even.next;
      even.next = even.next.next;
      odd = odd.next;
      even = even.next;
    }
    odd.next = evenStart;
  }
  reverseLL() {
    if (this.head == null || this.head.next == null) {
      return this.head;
    }
    let curr = this.head,
      prev = null;
    while (curr != null) {
      let front = curr.next;
      curr.next = prev;
      prev = curr;
      curr = front;
    }
    this.head = prev;
  }
  detectCycle() {
    if (this.head == null || this.head.next != null) {
      return this.head;
    }
    let slow = this.head,
      fast = this.head;
    while (fast != null && fast.next != null) {
      if (fast == slow) {
        console.log("Found cycle at:- " + slow.data);
      }
      fast = fast.next.next;
      slow = slow.next;
    }
    console.log("No cycle found!");
  }
  removeDuplicates(){
    
  }
  print() {
    let current = this.head;
    while (current) {
      console.log(current.data);
      current = current.next;
    }
  }
}
var detectCycle = function (head) {
  if (head == null || head.next == null) {
    return null;
  }
  let fast = head,
    slow = head,
    p = head;
  while (fast != null && fast.next != null) {
    fast = fast.next.next;
    slow = slow.next;
    if (slow == fast) {
      break;
    }
  }
  if (slow != fast) {
    return null;
  }
  while (p != slow) {
    slow = slow.next;
    p = p.next;
  }
  return p;
};
const linkedList = new LinkedList();
// linkedList.append(1);
// linkedList.append(2);
// linkedList.append(3);
// linkedList.append(4);
// linkedList.append(5);
// linkedList.detectCycle();
// linkedList.print();
// linkedList.reverseLL();
// linkedList.print();
let head = new Node(10);
let first = new Node(20);
let second = new Node(30);
let third = new Node(10);
head.next = first;
first.next = second;
second.next = third;
third.next = first;
let ans = detectCycle(head);
console.log("Cycle present at Node with value:- " + ans.data);
