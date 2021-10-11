class Node {
    constructor(valueInput) {
        this.value = valueInput;
        this.next = null;
    }
}

class SLL {
    constructor() {
        this.head = null;
    }

    addToFront(value) {
        var node = new Node(value);
        node.next = this.head;
        this.head = node;
        return this;
    }
    display() {
        let result = "";
        let runner = this.head;
        while (runner != null) {
            result += `${runner.value}--> `;
            runner = runner.next;
        }
        console.log(result);
    }
    reverseList() {
        var runner = this.head
        var previousNode = null

        while (runner != null) {
            var temp = runner.next
            runner.next = previousNode
            previousNode = runner
            runner = temp

        }
        this.head = previousNode
    }
}