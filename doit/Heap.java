package doit;

import java.util.Scanner;

final int HeapSize=1000;

enum Boolean {
	FALSE, TRUE
};

class Element<Type> {
	public Type key;

	public Element() {
	}

	public Element(Type key) {
		this.key = key;
	}
}

interface MaxPQ<Type> {

	public void Insert(Element<Type>);

	public Element<Type> DeleteMax(Element<Type>);
}

class MaxHeap implements MaxPQ<Type> {

	public MaxHeap(int sz = HeapSize){
		MaxSize = sz;
		n = 0;
		heap = new Element<Type>[MaxSize + 1]; // Don't want to use heap[0]
	}


	Element<Type> heap;
	int n; // current size of MaxHeap
	int MaxSize; // Maximum allowable size of MaxHeap

	void HeapEmpty() {
		System.out.println("Heap Empty" +"<<" +  "\n" );
		}

	void HeapFull() { 
		System.out.println(" << Heap Full" );
		}

	void display()
	{
		int i;
		System.out.println( "<< MaxHeap:: (i, heap[i].key):" );
		for (i = 1; i <= n; i++) { 
			System.out.printf("(" +"<<" + i + "<< ", " << heap[i].key << " );
		System.out.println( "<<" + "\n");
		}
	}

	@Override
	public void Insert(Element<Type> x) {
		int i;
		int n;
		if (n == MaxSize) {
			HeapFull();
			return;
		}
		n++;
		for (i = n; 1;) {
			if (i == 1)
				break; // at root
			if (x.key <= heap[i / 2].key)
				break;
			// move from parent to i
			heap[i] = heap[i / 2];
			i /= 2;
		}
		heap[i] = x;
	}

	Element<Type> DeleteMax(Element<Type>& x)
	{
		int i, j;
		if (!n) { HeapEmpty(); return 0; }
		x = heap[1]; Element<Type> k = heap[n]; n--;

		for (i = 1, j = 2; j <= n; )
		{
			if (j < n) if (heap[j].key < heap[j + 1].key) j++;
			// j points to the larger child
			if (k.key >= heap[j].key) break;
			heap[i] = heap[j];
			i = j; j *= 2;
		}
		heap[i] = k;
		return x;
	}

}

public class Heap {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int select = 0;
		int data = 0;

		MaxHeap<int> heap(20);
		Element<int> ele;

		Element<int> deletedEle = nullptr;

		do {
			System.out.println("Max Tree. Select: 1 insert, 2 display, 3 delete, >=5 exit");
			select = stdIn.nextInt();
			switch (select) {
			case 1:
				System.out.println("input value: ");
				cin >> data;
				heap.Insert(Element<int>(data));
				heap.display();
				break;
			case 2:
				heap.display();
				break;
			case 3:
				deletedEle = heap.DeleteMax(ele);
				if (deletedEle != nullptr) {
					System.out.println("deleted element:  << deletedEle->key << "); 
				}
				System.out.println( "current max heap: " );
				heap.display();
				break;
			case 5:
				exit(1);
				break;

			}
		} while (select < 5);

		return 0;
	}
}}