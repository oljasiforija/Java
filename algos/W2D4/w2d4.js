class Node{
    constructor(valueInput){
        this.value= valueInput;
        this.next = null;
        this.prev = null;
    }
}

class DLL{
    constructor(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }
    
    addBack(value){
        if(this.head === null){
            let node = new Node(value);
            this.head = node;
            this.tail = node;
            ++this.length;
        }else{
            let runner = this.head;
            while(runner.next){
                runner = runner.next;
            }
            let node = new Node(value);
            runner.next = node;
            node.prev = runner
            this.tail = node;
            ++this.length;
        }
    }
    addFront(value){
        if(this.head === null){
            let node = new Node(value);
            this.head = node;
            this.tail = node;
            ++this.length;
        }else{
            let node = new Node(value);
            let runner = this.head;
            this.head = node;
            node.next = runner;
            runner.prev = node;
            ++this.length;
        }
    }
    
    removeBack(){
        if(this.head !== null){
            let runner = this.head;
            while(runner.next.next){
                runner = runner.next;
            }
            runner.next = null;
            this.tail = runner;
            --this.length;
        }
    }
    remFront(){
        if(this.head !== null){
            this.head = this.head.next;
            this.head.prev = null;
            --this.length;
        }
    }
    
    print(){
        let runner = this.head;
        while(runner){
            console.log(runner.value);
            runner = runner.next;
        }
    }
    printBackwards(){
        let runner = this.tail;
        while(runner){
            console.log(runner.value);
            runner = runner.prev;
            
        }
    }   
}
let list = new DLL();
list.addBack(5);
list.addBack(4);
list.addBack(3);
list.addFront(1);
list.addFront(2);
list.remFront();
list.removeBack();
list.print();
list.printBackwards();