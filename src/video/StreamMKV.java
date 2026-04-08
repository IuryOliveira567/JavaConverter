package video;

import core.Stream;

public class StreamMKV extends Stream {

    public StreamMKV(String input, String output) {
        super(input, output);
    }

    @Override
    public void encoder() {
        executarComando(
            "ffmpeg/ffmpeg.exe",
            "-i", dataInput,
            "-c:v", "libx265",
            "-c:a", "aac",
            dataOutput
        );
    }

    @Override
    public void decoder() {
        System.out.println("Decodificando MKV...");
    }
}
