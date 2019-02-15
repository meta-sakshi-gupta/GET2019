function myFunction() 
  {
    var string = prompt("Please enter the string");
    if(string!=null)
    {
    var number = prompt("Please enter the number of times you want to repeatify the string", "2")
    }
    document.getElementById("demo").innerHTML = string.repeat(number);
  }