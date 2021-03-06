package name.pehl.piriti.converter.client;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

/**
 * @author $LastChangedBy: harald.pehl $
 * @version $LastChangedRevision: 19 $
 */
public class CharacterConverterTest
{
    private CharacterConverter underTest;


    @Before
    public void setUp() throws Exception
    {
        underTest = new CharacterConverter();
    }


    @Test
    public void testConvertNull()
    {
        Character result = underTest.convert(null);
        assertNull(result);
    }


    @Test
    public void testConvertEmpty()
    {
        Character result = underTest.convert("");
        assertNull(result);
    }


    @Test
    public void testConvertBlank()
    {
        Character result = underTest.convert("    ");
        assertEquals(' ', result.charValue());
    }


    @Test
    public void testConvertFoo()
    {
        Character result = underTest.convert("foo");
        assertEquals('f', result.charValue());
    }


    @Test
    public void testConvertValidCharacter()
    {
        Character result = underTest.convert("c");
        assertEquals('c', result.charValue());
    }
}
