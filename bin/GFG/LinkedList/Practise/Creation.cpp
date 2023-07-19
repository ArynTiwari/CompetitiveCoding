#include <bits/stdc++.h>
using namespace std;
struct Node
{
    int data;
    struct Node *next;
};
void insertAtStart(struct Node **head, int data)
{
    Node *newNode = new Node;
    newNode->next = (*head);
    newNode->data = data;
    *head = newNode;
}
void printLL(Node *node)
{
    while (node != NULL)
    {
        cout << node->data << " ";
        node = node->next;
    }
}
int main()
{
    struct Node *head = NULL;
    struct Node *first = NULL;
    struct Node *second = NULL;
    // head = new Node;
    first = new Node;
    second = new Node;

    head->data = 10;
    head->next = first;
    first->data = 20;
    first->next = second;
    second->data = 30;
    second->next = NULL;
    insertAtStart(&head, 0);
    printLL(head);
    return 0;
}