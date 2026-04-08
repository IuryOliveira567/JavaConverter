package video;

import core.Stream;

public class StreamMP4 extends Stream {

    public StreamMP4(String input, String output) {
        super(input, output);
    }

    @Override
    public void encoder() {
        executarComando(
            "ffmpeg/ffmpeg.exe",
            "-i", dataInput,
            "-c:v", "libx264",
            "-c:a", "aac",
            dataOutput
        );
    }

    @Override
    public void decoder() {
        System.out.println("Decodificando MP4...");
    }
}
