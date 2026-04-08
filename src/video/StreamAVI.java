package video;

import core.Stream;

public class StreamAVI extends Stream {

    public StreamAVI(String input, String output) {
        super(input, output);
    }

    @Override
    public void encoder() {
        executarComando(
            "ffmpeg/ffmpeg.exe",
            "-i", dataInput,
            "-c:v", "libxvid",
            "-c:a", "mp3",
            dataOutput
        );
    }

    @Override
    public void decoder() {
        System.out.println("Decodificando AVI...");
    }
}
