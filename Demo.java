/*

throws

   If a method is capable of causing an exception that it does not handle, 
   it must specify this behavior so that callers of the method can guard themselves 
    against that exception. 

    You do this by including a throws clause in the method’s declaration. A throws clause   
    lists     the types  of exceptions that a method might throw. 

    This is necessary for all   
    exceptions, except those of type Error or RuntimeException, or any of their subclasses. 

    All other exceptions that a method  can throw must be declared in the throws clause. 
    If they are not, a compile-time error will result.

 
      general form of a method declaration that includes a throws clause:
     
     return_type method-name(parameter-list) throws exception-list
                        {
                           // body of method
                        }

    Here, exception-list is a comma-separated list of the exceptions that a method can throw.

*/
          class Demo
        {
                   // public static void main(String args[]) 
                   public static void main(String args[]) throws InterruptedException
                        {

                  System.out.println(" In main ");

                          Thread.sleep (1000) ;

                                            System.out.println(" exit from main ...");


                                }
        }