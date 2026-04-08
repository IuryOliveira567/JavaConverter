package audio;

import core.Stream;

public class StreamM4u extends Stream {

    public StreamM4u(String input, String output) {
        super(input, output);
    }

    @Override
    public void encoder() {
        executarComando(
            "ffmpeg/ffmpeg.exe",
            "-i", dataInput,
            "-vn",
            dataOutput
        );
    }

    @Override
    public void decoder() {
        System.out.println("Decodificando M4U...");
    }
}
