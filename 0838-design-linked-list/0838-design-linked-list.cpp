#include <iostream>

struct Node {
    int data;
    Node* next;
};

class MyLinkedList {
    Node* head;     // Pointer to the head of the linked list
    int length;     // Length of the linked list

public:
    MyLinkedList() : head(nullptr), length(0) {}

    // Retrieve the value at a given index
    int get(int index) {
        if (index < 0 || index >= length) {
            return -1;  // Index out of bounds, return -1
        }

        Node* t = getNode(index);   // Get the node at the index
        return t->data;             // Return the value at the node
    }

    // Add a new node at the head
    void addAtHead(int val) {
        Node* newNode = createNode(val);    // Create a new node
        newNode->next = head;               // Set the new node's next to the current head
        head = newNode;                     // Update the head pointer to the new node
        length++;                           // Increment the length
    }

    // Add a new node at the tail
    void addAtTail(int val) {
        Node* newNode = createNode(val);    // Create a new node

        if (head == nullptr) {
            head = newNode;                 // If the list is empty, set the new node as the head
        } else {
            Node* t = getNode(length - 1);  // Find the last node in the list
            t->next = newNode;              // Set the next pointer of the last node to the new node
        }
        length++;                           // Increment the length
    }

    // Add a new node at a specific index
    void addAtIndex(int index, int val) {
        if (index > length) {
            return;                         // Index is greater than the length, do nothing
        } else if (index <= 0) {
            addAtHead(val);                 // Index is 0 or negative, add the node at the head
        } else if (index == length) {
            addAtTail(val);                 // Index is equal to the length, add the node at the tail
        } else {
            Node* t = getNode(index - 1);   // Find the node at the previous index
            Node* newNode = createNode(val);// Create a new node
            newNode->next = t->next;        // Set the next pointer of the new node
            t->next = newNode;              // Update the next pointer of the previous node
            length++;                       // Increment the length
        }
    }

    // Delete a node at a specific index
    void deleteAtIndex(int index) {
        if (index < 0 || index >= length) {
            return;                         // Index out of bounds, do nothing
        }

        if (index == 0) {
            Node* temp = head;
            head = head->next;              // Update the head pointer to skip the first node
            deleteNode(temp);               // Delete the node
        } else {
            Node* t = getNode(index - 1);   // Find the node at the previous index
            Node* temp = t->next;            // Store the node to be deleted
            t->next = t->next->next;        // Update the next pointer of the previous node
            deleteNode(temp);               // Delete the node
        }
        length--;                           // Decrement the length
    }

    // Get the length of the linked list
    int len() {
        return length;
    }

private:
    // Get the node at a given index
    Node* getNode(int index) {
        Node* t = head;
        for (int i = 0; i < index; i++) {
            t = t->next;
        }
        return t;
    }

    // Create a new node with the given value
    Node* createNode(int val) {
        Node* newNode = new Node;
        newNode->data = val;
        newNode->next = nullptr;
        return newNode;
    }

    // Delete a node
    void deleteNode(Node* node) {
        delete node;
    }
};
