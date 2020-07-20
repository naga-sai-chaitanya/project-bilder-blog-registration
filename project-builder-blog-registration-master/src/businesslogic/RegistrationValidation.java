package businesslogic;
public class RegistrationValidation 
{
	
		public boolean checkUserDetails(String email, String password, String confirmPassword) {
			if (validPassword(password, confirmPassword) && validEmail(email))
			{
				return true;
			}
			return false;
			
			
		}
		private boolean validPassword(String password, String confirmPassword) {
			if (password.equals(confirmPassword)) {
				if (password.length()>0 && password.length()>=8 && password.length()<=20)
				{
					for(int i=0;i<password.length();i++)
					{
						if((password.charAt(i)<='z' && password.charAt(i)>='a') ||  (password.charAt(i)<='Z' && password.charAt(i)>='A')) {
							return true;
						}
					}
					return false;
					
				}
			}
			return false;
			
		}
		private boolean validEmail(String email) {
			int c=0;
			for(int i=0;i<email.length();i++)
			{
				if ((email.length()>0)&&(email.charAt(i)=='_' || email.charAt(i)=='@'||email.charAt(i)=='.' ) && (email.charAt(i)<='z' && email.charAt(i)>='a') && (email.charAt(i)>=1 && email.charAt(i)<=9))
				{
					c++;
				}
			}
			if (c==email.length())
			{
				return true;
			}
			return false;
		}
	
}
	
	/*Email can contain alphanumeric value*
	//8.*Allowed special characters - _, @, .[at, underscore, dot]*
//	9.*Email should not be empty.*
	10.*Password should pass the following constraints*
	11.*Password field should not be empty.*
	12.*Password and confirm password should match.*
	13.*Must contain atleast 8 characters and atmost 20 characters.*
	14.*Must have atleast one uppercase letter, 1 lowercase letter and 1 number*/

	


