package app;

import core.Stream;
import audio.*;
import video.*;

public class Main {

    public static void main(String[] args) {

        Stream mp3 = new StreamMp3("entrada.mp4", "saida.mp3");
        Stream ogg = new StreamOgg("entrada.mp4", "saida.ogg");
        Stream m4a = new StreamM4u("entrada.mp4", "saida.m4a");

        Stream mp4 = new StreamMP4("entrada.mp4", "saida.mp4");
        Stream avi = new StreamAVI("entrada.mp4", "saida.avi");
        Stream mkv = new StreamMKV("entrada.mp4", "saida.mkv");

        mp3.encoder();
        ogg.encoder();
        m4a.encoder();

        mp4.encoder();
        avi.encoder();
        mkv.encoder();
    }
}
