static void reversePrint(SinglyLinkedListNode head){
    SinglyLinkedListNode node = head;
    StringBuilder s = new StringBuilder();
    while(node != null){
        s.insert(0, Integer.toString(node.data)+'\n');
        node = node.next;
    }
    System.out.print(s);
}
