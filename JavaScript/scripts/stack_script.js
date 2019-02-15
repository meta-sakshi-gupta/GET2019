class Stack
{
    constructor()
    {
        this.elements=[];
    }
 
     push(element)
     {
        this.elements.push(element);
        this.display();
    }
 
    pop()
     {  
        if(this.isEmpty())
        { 
            document.getElementById("StackElements").innerHTML= "Stack:Underflow"; 
        }
        else
        {
            this.elements.pop(); 
            this.display();
        }
    } 
 
     display()
     {
        
            var str = "Stack:"; 
            for(var i = 0; i < this.elements.length; i++) 
                str += this.elements[i] +" "; 
        
            document.getElementById("StackElements").innerHTML=str;
    }
 
         
    isEmpty() 
    { 
         
        return this.elements.length == 0; 
    } 
 }
 
 
 var stack = new Stack();
 
 function addElement()
 {
   stack.push(document.getElementById("pushInput").value);
   document.getElementById("pushInput").value="";
 }
 
 function removeElement()
 {
    stack.pop();
 }