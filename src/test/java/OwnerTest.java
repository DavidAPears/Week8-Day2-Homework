import models.Folder;
import models.Owner;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class OwnerTest {

    Owner owner;

    @Before
    public void before() { owner = new Owner("Fox Mulder", "Fox Mulder FBI Agent");}


    @Test
    public void hasName() {
        assertEquals("Fox Mulder", owner.getName());
    }

    @Test
    public void hasUsername() { assertEquals("Fox Mulder FBI Agent", owner.getUsername());}

}