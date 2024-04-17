import org.junit.Test;
import static org.junit.Assert.*;

public class NativeDictionaryTest {

    @Test
    public void testPutAndGet() {
        NativeDictionary<Integer> dictionary = new NativeDictionary<>(17, Integer.class);
        dictionary.put("key", 10);
        assertEquals(10, (int) dictionary.get("key"));

        dictionary.put("key", 20);
        assertEquals(20, (int) dictionary.get("key"));
    }

    @Test
    public void testIsKey() {
        NativeDictionary<String> dictionary = new NativeDictionary<>(17, String.class);

        dictionary.put("key", "value");

        assertTrue(dictionary.isKey("key"));
        assertFalse(dictionary.isKey("key1"));
    }

    @Test
    public void testGetNonExistentKey() {
        NativeDictionary<Integer> dictionary = new NativeDictionary<>(17, Integer.class);

        dictionary.put("key", 1);

        assertNull(dictionary.get("key1"));
    }

}

