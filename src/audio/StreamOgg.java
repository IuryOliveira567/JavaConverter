package audio;

import core.Stream;

public class StreamOgg extends Stream {

    public StreamOgg(String input, String output) {
        super(input, output);
    }

    @Override
    public void encoder() {
        executarComando(
            "ffmpeg/ffmpeg.exe",
            "-i", dataInput,
            "-vn",
            "-map", "0:a",
            "-c:a", "libvorbis",
            "-q:a", "5",
            dataOutput
        );
    }

    @Override
    public void decoder() {
        System.out.println("Decodificando OGG...");
    }
}
