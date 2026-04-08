package audio;

import core.Stream;

public class StreamMp3 extends Stream {

    public StreamMp3(String input, String output) {
        super(input, output);
    }

    @Override
    public void encoder() {
        executarComando(
            "ffmpeg/ffmpeg.exe",
            "-i", dataInput,
            "-vn",
            "-acodec",
            "libmp3lame",
            dataOutput
        );
    }

    @Override
    public void decoder() {
        System.out.println("Decodificando MP3...");
    }
}
