import models.File;
import models.Folder;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class FolderTest {

    Folder folder;


    @Before
    public void before() {
        folder = new Folder("The X Files");
    }

    @Test
    public void hasName() {
        assertEquals("The X Files", folder.getName());
    }


}