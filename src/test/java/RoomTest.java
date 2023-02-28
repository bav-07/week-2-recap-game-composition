import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RoomTest {

    private Room room;

    @BeforeEach
    public void setUp() {
        this.room = new Room("Test Room","Test description", List.of());
    }

    @Test
    public void canGetName() {
        assertThat(room.getName()).isEqualTo("Test Room");
    }

    @Test
    public void canGetDescription(){
        assertThat(room.getDescription()).isEqualTo("Test Description");
    }
}
