
#include <iostream>
#include<vector>
using namespace std;
struct Node{
    int data;
    Node* next;
    Node(int data){
        this->data=data;
        this->next=nullptr;
    }
};

void print(Node* head){
    Node* temp=head;
    while(temp){
        cout<<temp->data<<" -> ";
        temp=temp->next;
    }
    cout<<endl;
}
 Node* ConvertArr(vector<int> arr){
     Node* head = new Node(arr[0]);
     Node* mover = head;
     for(int i=1;i<arr.size();i++){
         Node* temp = new Node(arr[i]);
         mover->next=temp;
         mover=temp;
     }
     return head;
 }
 
 Node* deleteHead(Node* head){
     if(head==nullptr) return head;
     Node* temp = head;
     head=head->next;
     delete temp;
     return head;
 }

int main() {
    vector<int> arr = {1,2,3,4,5};
    Node* head = ConvertArr(arr);
    cout<<"Head before Deleting : "<<head->data<<endl;
    print(head);
    head = deleteHead(head);
    cout<<"Head after deleting : "<<head->data<<endl;
    print(head);
    return 0;
}
