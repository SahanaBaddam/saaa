package exceptions;

public class InvalidAgeException extends RuntimeException{
		public String toString()
	{
		return "age should be positive";
	}
	
}
