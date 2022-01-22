import com.giavudangle.protobuf.Keyboard;

import java.util.Random;

public class Generator {

    public Random random;

    public Generator(){
        random = new Random();
    }

    public Keyboard NewKeyBoard(){
        return Keyboard.newBuilder()
                .setLayout(randomKeyBoardLayout())
                .setBacklit(random.nextBoolean())
                .build();
    }

    private Keyboard.Layout randomKeyBoardLayout(){
        return null;
    }
}
