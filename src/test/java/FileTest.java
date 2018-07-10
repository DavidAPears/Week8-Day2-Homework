import models.File;
import models.Folder;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class FileTest {

    File file;
    Folder xfile;

    @Before
    public void before() {
        file = new File("The Loch Ness Monster", "Java", 340.56, xfile );
    }

    @Test
    public void hasName() {
        assertEquals("The Loch Ness Monster", file.getName());
    }

    @Test
    public void hasExtenstion() {
        assertEquals("Java", file.getExtension());
    }

    @Test
    public void hasSize() {
        assertEquals(340.56, file.getSize(), 0.01);
    }
}