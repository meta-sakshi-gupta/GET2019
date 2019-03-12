import static org.junit.Assert.*;

import org.junit.Test;

public class UniqueCharacterTest 
{

	
	UniqueCharacter uc= new UniqueCharacter();
	@Test
	public void testUniqueCharacter() 
	{
		assertEquals(1, uc.numberOfUniqueCharacter("aqwe@#$qwea@#"));
		assertEquals(4, uc.numberOfUniqueCharacter("sakshi"));
		assertEquals(6, uc.numberOfUniqueCharacter("metacube"));
		assertEquals(0, uc.numberOfUniqueCharacter("ggggggggggg"));
		assertEquals(10, uc.numberOfUniqueCharacter("1234567890"));
	}

}