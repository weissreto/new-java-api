package java9.api.changes.lang;

import java.lang.Character.UnicodeBlock;
import java.lang.Character.UnicodeScript;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;

import javax.xml.stream.events.Characters;

public class Types 
{
	public void unsignedByte()
	{
		Byte.compareUnsigned((byte)-45,(byte)45);
	}
	
	public void unsignedShort()
	{
		Short.compareUnsigned((short)-45, (short)45);
	}
	
	public void newBidirectionCharacterTypes()
	{
		byte bidi = Character.DIRECTIONALITY_FIRST_STRONG_ISOLATE;
		bidi = Character.DIRECTIONALITY_LEFT_TO_RIGHT_ISOLATE;
		bidi = Character.DIRECTIONALITY_POP_DIRECTIONAL_ISOLATE;
		bidi = Character.DIRECTIONALITY_RIGHT_TO_LEFT_ISOLATE;
	}
	
	public void newUnicodeBlocks()
	{
		UnicodeBlock start = Character.UnicodeBlock.AHOM;
		// ca 30 more
		UnicodeBlock end = Character.UnicodeBlock.WARANG_CITI;
	}
	
	public void newUnicodeScripts()
	{
		UnicodeScript start = Character.UnicodeScript.AHOM;
		// ca 30 more
		UnicodeScript end = Character.UnicodeScript.WARANG_CITI;
	}
	
	public void integer()
	{
		CharSequence charSequence = "Hi0101World";
		int begin = 2;
		int end = 6;
		int radix = 2;
		Integer.parseInt(charSequence , begin, end,  radix);
		Integer.parseUnsignedInt(charSequence, begin,  end, radix);
	}
	
	public void longParse()
	{
		CharSequence charSequence = "Hi0101World";
		int begin = 2;
		int end = 6;
		int radix = 2;
		Long.parseLong(charSequence , begin, end,  radix);
		Long.parseUnsignedLong(charSequence, begin,  end, radix);
	}
	
	public void string()
	{
		"Hello".chars().forEach(ch -> System.out.print(ch));
		"Hello".codePoints().forEach(cp -> System.out.print(cp));
	}
	
	public void bigDecimal()
	{
		BigDecimal bigDecimal = new BigDecimal(12);
		bigDecimal.sqrt(MathContext.DECIMAL128);
	}
	
	public void bigInteger()
	{
		byte[] value = null;
		int offset = 12;
		int length = 16;
		new BigInteger(value, offset, length);
		
		int signum = 15;;
		byte[] magnitude = null;
		new BigInteger(signum, magnitude, offset, length);
		
		BigInteger bigInteger = new BigInteger("12");
		BigInteger result = bigInteger.sqrt();
		BigInteger[] results = bigInteger.sqrtAndRemainder();
	}
	
}
