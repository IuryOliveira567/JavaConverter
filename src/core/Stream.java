package core;

import java.io.IOException;

public abstract class Stream {

    protected String dataInput;
    protected String dataOutput;

    public Stream(String dataInput, String dataOutput) {
        this.dataInput = dataInput;
        this.dataOutput = dataOutput;
    }

    public abstract void encoder();
    public abstract void decoder();

    protected void executarComando(String... comando) {
        try {
            ProcessBuilder pb = new ProcessBuilder(comando);
            pb.inheritIO();

            Process process = pb.start();
            int exitCode = process.waitFor();

            System.out.println("Finalizado com código: " + exitCode);

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
