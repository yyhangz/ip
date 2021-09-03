package duke;

import static org.junit.jupiter.api.Assertions.assertEquals;

import duke.io.DukeParser;
import duke.type.DukeCommand;
import org.junit.jupiter.api.Test;

public class DukeParserTest {
    @Test
    public void getCommandType_invalidCommand_invalidCommandTypeReturned() {
        assertEquals(DukeCommand.INVALID, new DukeParser().getCommandType("this is an invalid command"));
    }
}
