class Queue
{
   constructor()
   {
       this.elements=[];
   }

    enque(element)
    {
       this.elements.push(element);
       this.display();
   }

    dequeue() 
    { 
       if(this.isEmpty())
       { 
           document.getElementById("QueueElements").innerHTML= "Queue:Underflow"; 
       }
       else
       {
           this.elements.shift(); 
           this.display();
       }
   } 

    display()
    {
       
           var str = "Queue:"; 
           for(var i = 0; i < this.elements.length; i++) 
               str += this.elements[i] +" "; 
       
           document.getElementById("QueueElements").innerHTML=str;
   }

    isEmpty() 
   { 
       return this.elements.length == 0; 
   } 
}


var queue = new Queue();

function addElement()
{
  queue.enque(document.getElementById("queueInput").value);
  document.getElementById("queueInput").value="";
}

function removeElement()
{
   queue.dequeue();
}