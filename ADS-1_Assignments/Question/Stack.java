class Stack 
{ 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return (top < 0); 
    } 
    Stack() 
    { 
        top = -1; 
    } 
  
    boolean push(int x) 
    { 
        if (top >= (MAX-1)) 
        { 
           
            return false; 
        } 
        else
        { 
            a[++top] = x; 
            return true; 
        } 
    } 
  
    int pop() 
    { 
        if (top < 0) 
        { 
            System.out.println("no Registrations"); 
            return 0; 
        } 
        else
        { 
            int x = a[top--]; 
            return x; 
        } 
    } 
}