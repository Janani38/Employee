public class FirstNameLastNameValidate
{
   public static void main( String[] args )
   {
       System.out.println(validateFirstName("Tom"));
       System.out.println(validateLastName("Tom"));
   }
   // validate first name
   public static boolean validateFirstName( String firstName )
   {
      return firstName.matches( "[A-Z][a-zA-Z]*" );
   } // end method validateFirstName

   // validate last name
   public static boolean validateLastName( String lastName )
   {
      return lastName.matches( "[a-zA-z]+([ '-][a-zA-Z]+)*" );
   } // end method validateLastName
   
}