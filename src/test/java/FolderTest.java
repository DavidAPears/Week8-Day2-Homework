import models.File;
import models.Folder;
import models.Owner;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class FolderTest {

    Folder folder;
    Owner owner;


    @Before
    public void before() {
        folder = new Folder("The X Files", owner);
    }

    @Test
    public void hasName() {
        assertEquals("The X Files", folder.getName());
    }

}